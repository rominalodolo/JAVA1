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
" The JVM looks inside the JAR and expects to find what it needs right there. It won’t go digging into other directories, unless the class is part of a package, and even then the JVM looks only in the directories that match the package statement. "

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



### Compiling & Running packages 

### -d 

### Executable package with JAR 

### Manifest file? 

### Java Web Start 


### .jnlp file 


## Summary exercise 
![Data-3](https://user-images.githubusercontent.com/83961643/174574989-69c5bb62-5ad2-43ef-b031-0a06cb2bd6a5.png)



## Last Edit July 2022

