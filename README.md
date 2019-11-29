
Maven Project for FizzBuzz Excercise
=====================================

# Introduction
Program to to print numbers from 1 to 100. But
* A number is Fizz if it is divisible by 3 or if it has 3 in it
* A number is Buzz if it is divisible by 5 or if it has 5 in it
* A number is FizzBuzz if it satisfy above 2 criterias together

# TechStack
* Java 1.8
* Junit 4.12
* Hamcrest 1.3

# Compile And Test
  `mvn clean test`
  
# Print numbers 1 to 100 use below code 
`FizzBuzzConverter converter = new FizzBuzzConverter();`<br>
`IntStream.rangeClosed(1, 100).forEach(n -> System.out.println(converter.convert(n)));`
