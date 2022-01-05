# Log4Shell  with Java using the libraries

## Requirements

  * Any JDK
  * log4j-api-2.14.1.jar
  * log4j-core-2.14.1.jar

## Compile the program:
  
  `javac -cp .:log4j-api-2.14.1.jar:log4j-core-2.14.1.jar Main.java `

## Testing with JDK 11 or obove
  
there is no need to explicity  compile

` java -cp .:log4j-api-2.14.1.jar:log4j-core-2.14.1.jar Main.java some-text`
  
  The error function passes the  input (some-text) provided in the argument


