# Set up node
cd $WORKSPACE/repo/buildScripts
npm install
cd $WORKSPACE/repo/

# Execute prebuild script
node buildScripts/prebuild.js

# Get version string
PACKAGE_VERSION=`cat bin/VERSION`
echo $PACKAGE_VERSION

# Clear build directory
rm -rf build
mkdir build

# Configuration
executable="$WORKSPACE/swagger-codegen/modules/swagger-codegen-cli/target/swagger-codegen-cli.jar"
JAVA_OPTS="$JAVA_OPTS -XX:MaxPermSize=256M -Xmx1024M -DloggerPath=conf/log4j.properties"
ags="generate -i swagger.json --library retrofit2 -l purecloudjava -o build -c bin/config.json -t swagger_template"

# Generate SDK source
java $JAVA_OPTS -jar $executable $ags

# Copy over extension files
cp -r extensions/* build/src/main/java/com/mypurecloud/sdk

# Add maven to path
export PATH=$PATH:/usr/local/maven/bin

# Compile module
cd $WORKSPACE/repo/build

#echo "BUILD_MODE=$BUILD_MODE"
#if [ $BUILD_MODE == "verify" ]
#then
	# Build and sign
#	mvn --settings $WORKSPACE/settings.xml verify -Dgpg.passphrase=$DPGP_PASSPHRASE
#elif [ $BUILD_MODE == "deploy" ]
#then
	# Build, sign, deploy to sonatype, and release to maven central
#	mvn --settings $WORKSPACE/settings.xml deploy -Dgpg.passphrase=$DPGP_PASSPHRASE
#else
	# Default, just build
#	mvn --settings $WORKSPACE/settings.xml package
#fi

cd $WORKSPACE/repo/

cd $WORKSPACE/repo/build
cp $WORKSPACE/repo/README.md $WORKSPACE/repo/build/docs/index.md
zip -r ${WORKSPACE}/doc.zip docs/*

	echo "Adding to commit"
	git add .
	git commit -am $PACKAGE_VERSION
# Conditionally commit
cd $WORKSPACE/repo/
#if [[ -f "$REPO/newVersion.md" && $SKIP_COMMIT != true ]]
if [ -f "$WORKSPACE/repo/newVersion.md" ]
then
	echo "Adding to commit"
	git add .
	git commit -am $PACKAGE_VERSION
else
	echo "Skipping git commit"
fi