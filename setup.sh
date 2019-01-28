## Build script

# Gradle Steps #
echo "Building project, getting dependencies, and creating eclipse project."
gradle build -x test
gradle eclipse

echo "Finished setup."

#Create Property Files#

propertiesFile=test.properties.local

if [ ! -e "$propertiesFile" ]
then
Echo “Creating test.properties.local”
cp $propertiesTemplate $propertiesFile
fi
