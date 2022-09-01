# coindesk
# Java Application to send RESTful API request to the following API endpoint to retrieve the current price of Bitcoin as a JSON array which uses third party dependencies to parse the returned payload and out put the rates to the console display: https://api.coindesk.com/v1/bpi/currentprice.json
# Watch "Building Java with 3rd Party Dependencies without an IDE" on YouTube by Cruz Macias for help: https://youtu.be/NZZWMr9tmXs
# How to compile
```
javac -d classes/ -cp lib/json-simple.jar src/coinapp/Main.java -verbose -Xlint:unchecked

jar --create --file lib/coinapp.jar -C classes/ .
```
# How to run

## Unix / Linux
```
java -cp lib/coinapp.jar:lib/json-simple.jar coinapp.Main > output.txt
```

## Windows
```
java -cp lib/coinapp.jar;lib/json-simple.jar coinapp.Main > output.txt
```

# Requirements
```
JDK 17+
JRE 17+
```

# install Java in Windows visit
```
https://docs.oracle.com/en/java/javase/18/install/installation-jdk-microsoft-windows-platforms.html#GUID-DAF345BA-B3E7-4CF2-B87A-B6662D691840
```

# How to compile in Windows (back slash)
```
javac -d classes/ -cp lib\json-simple.jar src\coinapp\Main.java -verbose -Xlint:unchecked
jar --create --file lib\coinapp.jar -C classes/ .
```

# How to run in Windows (semi-colon)
```
java -cp lib\coinapp.jar;lib\json-simple.jar coinapp.Main > output.txt
```

# Maven JSON Simple 1.1.1 (Third Party Package) Repo
```
https://repo1.maven.org/maven2/com/googlecode/json-simple/json-simple/1.1.1/json-simple-1.1.1.jar
```

#Coindesk BTC API endpoint
```
https://api.coindesk.com/v1/bpi/currentprice.json
```

# Maven JSON Simple (Third Party Package) Repo
```
https://mvnrepository.com/artifact/com.googlecode.json-simple/json-simple/1.1.1
```

# Oracle JDK 18.0.2 Installer
```
https://www.oracle.com/java/technologies/downloads/#jdk18-windows
```

# Oracle JDK 18.0.2 Installer Tutorial
```
https://docs.oracle.com/en/java/javase/18/install/installation-jdk-microsoft-windows-platforms.html#GUID-DAF345BA-B3E7-4CF2-B87A-B6662D691840
```

# Cygwin Get that Linux feeling - on Windows
```
https://www.cygwin.com/
```

# Check if you have Linux commands on your Windows machine
```
Open CMD and type the command, e.g., ls or vim
If it exists, use where to see where it lives, e.g., where ls or where nano
If it does not exist, you will need to install something like Gitbash or CygWin
```

# Install Java (Linux, Ubuntu 20.04)
```
sudo apt update
sudo apt upgrade
sudo apt install openjdk-17-jdk openjdk-17-jre
```

# How to compile in Ubuntu (forward slash)
```
javac -d classes/ -cp lib/json-simple.jar src/coinapp/Main.java -verbose -Xlint:unchecked
jar --create --file lib/coinapp.jar -C classes/ .
```

# How to run in Ubuntu (colon)
```
java -cp lib/coinapp.jar:lib/json-simple.jar coinapp.Main > output.txt
```
