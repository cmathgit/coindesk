:: Run a Java Program in the current directory
:: Programmer: Cruz Macias

@ECHO OFF
color 0d

:: remove any existing dependencies
echo removing jars, class definitions, and json payload
echo enter to confirm
pause

rm -f lib\coinapp.jar
:: rm -f lib\json-simple.jar
rm -rf classes/*
rm -f api_payload.json

:: get current price of bitcoin by calling the coindesk API endpoint
echo update API payload
pause

curl -# -o api_payload.json https://api.coindesk.com/v1/bpi/currentprice.json
ls
pause

:: copy MAVEN repo (third-party dependencies) into lib
:: echo copying jar files from repo
:: curl -s https://repo1.maven.org/maven2/com/googlecode/json-simple/json-simple/1.1.1/json-simple-1.1.1.jar -o lib\json-simple.jar
:: echo lib
:: ls lib
:: pause

:: compile the Java program with third-party dependencies (libraries/jar files)
echo compiling the Java program
javac -d classes/ -cp lib\json-simple.jar src\coinapp\Main.java -verbose -Xlint:unchecked
echo user defined packages
ls classes
pause

:: create a jar file and specify the directory where the class files live
echo create jar files
jar --create --file lib\coinapp.jar -C classes/ .
ls lib
pause

:: run the program and include dependencies
java -cp lib\coinapp.jar;lib\json-simple.jar coinapp.Main > output.txt
pause
