@echo off

echo Initializing...

setlocal

if EXIST bin (
    rmdir /S /Q bin
)

if EXIST dist (
    rmdir /S /Q dist
)

mkdir bin

mkdir dist

echo Getting sources...

dir /s /B *.java > sources.txt

echo Compiling Classes...

javac -d bin @sources.txt

cd bin

echo Making Jar...

jar cfe Decryptor.jar de.mctzock.decryptor.main.Main .

copy Decryptor.jar ..\dist\

cd ..\dist

echo Downloading Resources...

powershell.exe Invoke-WebRequest -Uri http://download.mctzock.de/Decryptor/assets.zip -OutFile assets.zip

echo Unzipping...

powershell.exe Expand-Archive -Path 'assets.zip' -DestinationPath '.'

echo Cleaning up...

rmdir /S /Q ..\bin
del assets.zip
 
echo Finished.