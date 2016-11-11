var mkdirp = require('mkdirp');
var fs = require('fs');
var Q = require('q');
var pclib = require('purecloud-api-sdk-common');

var pclibSwaggerVersion = pclib.swaggerVersioning();
var progressTracker = 0;
var swaggerFilePath = 'swagger.json';
var versionFilePath = 'version.json';

updateVersion()
	.then(writeConfig)
	.then(function() {
		console.log('prebuild script complete');
		// Have to explicitly exit because promises keep the node process running
		process.exit(0);
	})
	.catch(function(error) {
		console.log('Error encountered in prebuild script!');
		console.log(error.stack);
		process.exit(1);
	});

function updateVersion() {
	var deferred = Q.defer();

	pclib.updateSwaggerAndVersion(swaggerFilePath, versionFilePath, "mypurecloud.com", function(hasChanges){
		var version = pclibSwaggerVersion.getVersionString("version.json");

		if(hasChanges){
			console.log("has changes, new version: " + version)
			fs.writeFileSync("newVersion.md", version);

			versionJson = JSON.parse(fs.readFileSync("version.json", 'UTF-8'))

			var notes = pclibSwaggerVersion.getChangeReadmeText(versionJson.changelog[version]);
			fs.writeFileSync("RELEASENOTES", notes);
		}else{
			console.log("no changes, still version " + version)
		}

		deferred.resolve();
	});

	return deferred.promise;
}

function writeConfig() {
	var deferred = Q.defer();

	var v = pclibSwaggerVersion.getVersionString("version.json") + '.' + process.env['BUILD_NUMBER'];
	console.log('Package version: ' + v);
	mkdirp.sync('bin');
	fs.writeFileSync('bin/VERSION', v, 'UTF-8');
	var config = {
		"artifactId": "platform-android-client",
		"artifactVersion": v,
		"apiPackage": "com.mypurecloud.sdk.api",
		"modelPackage": "com.mypurecloud.sdk.model",
		"invokerPackage": "com.mypurecloud.sdk",
		"groupId": "com.mypurecloud",
		"localVariablePrefix": "pc",
		"serializableModel": "true",
		"hideGenerationTimestamp": "false",
		"httpUserAgent":"PureCloud SDK",
		"packageDescription":"The official Android SDK for the PureCloud Platform API SDK",
		"packageUrl":"https://developer.mypurecloud.com/api/rest/client-libraries/java/latest/"
	};

	fs.writeFile('bin/config.json', JSON.stringify(config), function(err) {
		if (err) {
			console.log('Failed to write config file!');
			console.log(err);
			deferred.reject(err);
			return;
		}

		console.log('Config file written');
		deferred.resolve();
		return;
	});

	return deferred.promise;
}

function stringStartsWith(string, prefix) {
	return string.slice(0, prefix.length) == prefix;
}

function fileExists(filepath) {
	if (!filepath) return false

	try {
		return fs.statSync(filepath).isFile()
	} catch (e) {
		return false
	}
}


