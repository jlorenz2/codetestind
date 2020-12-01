# codetestind

# Test Code
# v0.0.1

This application povides a REST endpoint to calculate a product price.

 

##   Installation

###  Required software

	- Apache Maven 3.6.0
  	- Java jdk 1.8

	Clone the content of the application repository and run:

		$ git clone https:github.com/jlorenz2/codetestind

##  Compiling

	On the root folder of the installation path:
	
		$ mvn install

##  Running Test Code

	On the target folder of the installation path:
	
		$ java -jar restful-web-services-0.0.1-SNAPSHOT.jar
	
## REST requests:

  localhost:8080/price?datetime=yyyyMMddHHmmss&productid=number&brandid=number
  
  Example: 
  
  	 localhost:8080/price?datetime=20200617160000&productid=35455&brandid=1
   
License
----

*** It's a Free Software, enjoy! **
