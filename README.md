FizzBuzz Excercise

TechStack
Java 1.8
Junit 4.12
Hamcrest 1.3

Compile And Test
mvn clean test

To print 1 to 100 numbers use the below code
FizzBuzzConverter converter = new FizzBuzzConverter();
IntStream.rangeClosed(1, 100).forEach(n -> System.out.println(converter.convert(n)));# fizzbuzz-excercise
