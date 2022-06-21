# Head First Java 
>> by Kathy Sierra & Bert Bates 
>> 
>> O'Reilly


## This section is focused on Chapter 17 of this book - Package, Jars and Deployment 

## Release Your code 
- wrote code
- tested code
- refined code

now to... 
- organize, package, deploy

_" A java program is a bunch of classes. That's the output of your development. The real question is what to do with those classes when you're done. "_

## Deployment options: 
- Local: 
The entire application runs on the end-user’s computer, as a stand-alone,probably GUI, program, deployed as an executable JAR.

- Combinations of local and remote:
The application is distributed with a client portion running on the user’s local system, connected to a server where other parts of the application are running.

- Remote:
The entire Java application runs on a server system, with the client accessing the system through some non-Java means, probably a web browser.

### Separate source code and class files
_" The key is a combination of directory structure organization and the ```-d``` compiler option. "_

- Compiling with the ``-d`` (directory) flag
`` %cd MyProject/source ``
`` %javac -d ../classes MyApp.java ``
- Running your code 
`` %cd MyProject/classes ``
`` %java MyApp ``

### Put your java in a JAR 
> making an executable JAR 
> - Make sure all your class files are in classes directory 
> - Create a manifest.txt file that states which class has the main() method
> - Run the jar tool to create a JAR file that contains everything in the classes directory, plus the mainfest 

### Running (Executing) the JAR
_" The JVM looks inside the JAR and expects to find what it needs right there. It won’t go digging into other directories, unless the class is part of a package, and even then the JVM looks only in the directories that match the package statement. "_

`` %cd MyProject/classes ``
`` %java -jar app1.jar `` 

### Put your classes in packages
Package structure of the Java API for:
> java.text.NumberFormat
> 
> java.util.ArrayList
> 
> java.awt.FlowLayout
> 
> java.awt.event.ActionEvent
> 
> java.net.Socket
> 

![hierachy](https://user-images.githubusercontent.com/83961643/174780986-67b0e53b-edc5-4535-9724-e434be57e502.jpeg)


### Preventing package name conflicts 

_" Packages can prevent name conflicts, but only if you choose a package name that’s guaranteed to be unique. The best way to do that is to preface your packages with your reverse domain name. "_

![name](https://user-images.githubusercontent.com/83961643/174782237-b9af7e1c-f578-4e56-b18f-061f55e6d84e.jpeg)

Putting your class in a package:
1. Choose a package name
2. Put a package in your class
3. Set up a matching directory structure

**NB: Always put a class into a directory structure that matches the package hierachy.** 

![structure](https://user-images.githubusercontent.com/83961643/174783072-8953094c-cd81-4fca-abe7-2028b5cbd72b.jpeg)


### Compiling & Running packages 
_" both the compiler and JVM have to be capable of finding your class and all of the other classes it uses. "_
Java knows where the core API classes are but it doesn't know your how to find your classes. 

- Compiling with the -d (directory) flag
`` %cd MyProject/source `` Stay in your source directory 
`` %javac -d ../classes com/headfirstjava/PackageExercise.java `` 
To compile all the .java files in the com.headfirstjava package, use: `` %javac -d ../classes com/headfirstjava/*.java ``

- Running your code
`` %cd MyProject/classes ``
`` %java com.headfirstjava.PackageExercise `` 

### -d 
- let's you send your compiled class files into a directory other than the one where the source file is, 
- knows to put the class into the correct directory structure for the package the class is in.
- Compiling with `-d` tells the compiler to not just put your classes into the correct directory tree, but to build the directories if they don’t exist.
- if the directories aren’t there, create them first and then put the class in the right place.

### Executable package with JAR 
1. Make sure all of your class files are within the correct package structure,under the classes directory.
2. Create a manifest.txt file that states which class has the main() method, and be sure to use the fully-qualified class name

> Make a text file named manifest.txt that has a single line:
> 
> Main-Class: com.headfirstjava.PackageExercise
> 
> Put the manifest file into the classes directory

3. Run the jar tool to create a JAR file that contains the package directories plus the manifest

`%cd MyProject/classes`

`%jar -cvmf manifest.txt packEx.jar com`




### Manifest file? 
1. List the contents of a JAR

`% jar -tf packEx.jar`

2. Extract the contents of a JAR (i.e. unjar)

`% cd Skyler`

`% jar -xf packEx.jar`


### Java Web Start (JWS)
_" End-users launch a Java Web Start app by clicking on a link in a Web page. But once the app downloads, it runs outside the browser, just like any other stand-alone Java application. In fact, a Java Web Start app is just an executable JAR that’s distributed over the Web. "_

**How it works** 
1. The client clicks on a Web page link to your JWS application (a .jnlp file).
2. The Web server (HTTP) gets the request and sends back a .jnlp file (this is NOT the JAR).
3. Java Web Start (a small ‘helper app’ on the client) is started up by the browser. The JWS helper app reads the .jnlp file, and asks the server for the MyApp.jar file.
4. The Web server ‘serves’ up the requested .jar file.
5. Java Web Start gets the JAR and starts the application by calling the specified main( ) method (just like an executable JAR).


### .jnlp file 
1. create a .jnlp (Java Network Launch Protocol) file that describes your application
2. JWS app reads and uses this file to find your JAR and launch the app
3. It's a simple XML document that has several different things you can put in




## Summary exercise 
![Data-3](https://user-images.githubusercontent.com/83961643/174574989-69c5bb62-5ad2-43ef-b031-0a06cb2bd6a5.png)



## Last Edit July 2022

