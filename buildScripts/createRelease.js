var api = require('github-api-promise');
var dateFormat = require('dateformat');
var fs = require('fs');
var archiver = require('archiver');
var Q = require('q');
var release = require('purecloud-api-sdk-common').createRelease();

var dFormat = 'dddd, mmmm dS yyyy';
var tFormat = 'h:MM:ss TT';

var repo = 'purecloud_api_sdk_android';

main();


function main() {
	var version = '0.0.0.0';
	var token = null;
	var releaseNotes = '';

	function stringStartsWith (string, prefix) {
		return string.slice(0, prefix.length) == prefix;
	}

	// Parse args
	process.argv.forEach(function (val, index, array) {
		if (stringStartsWith(val, '/version=')) {
			version = val.substring(9);
		} else if (stringStartsWith(val, '/token=')) {
			token = val.substring(7);
		}
	});

	try {
		releaseNotes = fs.readFileSync("RELEASENOTES", "UTF-8");
	} catch(err) {
		console.log(err);
	}

	// Create release
	release.release(token, repo, version, releaseNotes, null, null);
}