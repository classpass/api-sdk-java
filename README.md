# Java SDK

Qordoba’s Java SDK offers platform-specific features that make the Qordoba API implementation much simpler. The SDK allows you to integrate our API with your application without worrying about low-level API details. Our Java SDK is open-source and can be forked at the link below. Once forked and configured, you will be able to easily integrate our API into your application.

### Get the SDK

Download the Java API SDK from [GitHub](https://github.com/Qordobacode/api-sdk-java).

To clone the repo: `git clone git@github.com:Qordobacode/api-sdk-java.git`.


### Introduction

The controller classes accept the configuration parameters in their respective constructors. The code uses a Java library ([UniRest](http://unirest.io/java.html)). The reference to this library is already added as a Maven dependency in the pom.xml file.

###How to build and install via Maven: 

* Extract the zip file to a new folder named JavaSDK
* Open a command prompt and navigate to the JavaSDK/QordobaLib folder
* Execute "mvn install." This will install dependencies and also add the JAR in your local Maven repository
* In your own Maven application, add the following lines which will refer to the newly installed SDK: 
 
```
<dependency>
	<groupId>QordobaLib</groupId>
	<artifactId>QordobaLib</artifactId>
	<version>0.0.1-SNAPSHOT</version>
	<scope>compile</scope>
</dependency>
```

###How to build and install via Eclipse:

* Open Eclipse and use the Import option in File menu
* Select General -> Existing Projects into Workspace option from the tree list
* In Select Root Directory, provide path to the unzipped archive for the code
* Click Finish and ensure that the Project -> Build Automatically option is enabled in the menu


###How to leverage the library:

The exported JAR can now be used as a Java library. To learn more about this topic, check out these resources: 

[Exporting JARs](http://help.eclipse.org/juno/index.jsp?topic=%2Forg.eclipse.jdt.doc.user%2Ftasks%2Ftasks-33.htm)
		[Using JARs](http://help.eclipse.org/juno/index.jsp?topic=%2Forg.eclipse.jst.j2ee.doc.user%2Ftopics%2Ftjimpapp.html)




### Bug reports
Have a bug? Please create an issue [here](https://github.com/Qordobacode/api-sdk-java/issues) on GitHub! 
