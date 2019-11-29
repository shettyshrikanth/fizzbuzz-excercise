package com.uk.fzbz;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class FizzBuzzConverterTest {
    private static final String FIZZ = "Fizz";
    private static final String BUZZ = "Buzz";
    private static final String FIZZBUZZ = "FizzBuzz";

    private FizzBuzzConverter fizzBuzzConverter;

    @Rule
    public ExpectedException exceptionRule = ExpectedException.none();

    @Before
    public void setup () {
        fizzBuzzConverter = new FizzBuzzConverter();
    }

    @Test
    public void shouldThrowExceptionWhenArgumentIsOutOfRange () {
        exceptionRule.expect(IllegalArgumentException.class);
        exceptionRule.expectMessage("number -1 is out of range, number should be > 0 and < 100");
        fizzBuzzConverter.convert(-1);
    }

    @Test
    public void shouldReturnNumberWhenNoMatch () {
        assertThat(fizzBuzzConverter.convert(1), is("1"));
        assertThat(fizzBuzzConverter.convert(2), is("2"));
        assertThat(fizzBuzzConverter.convert(7), is("7"));
    }

    @Test
    public void shouldReturnFizzWhenMultipleOfThree () {
        assertThat(fizzBuzzConverter.convert(3), is(FIZZ));
        assertThat(fizzBuzzConverter.convert(12), is(FIZZ));
        assertThat(fizzBuzzConverter.convert(99), is(FIZZ));
    }

    @Test
    public void shouldReturnBuzzWhenMultipleOfFive () {
        assertThat(fizzBuzzConverter.convert(5), is(BUZZ));
        assertThat(fizzBuzzConverter.convert(20), is(BUZZ));
        assertThat(fizzBuzzConverter.convert(55), is(BUZZ));
    }

    @Test
    public void shouldReturnFizzBuzzWhenMultipleOfThreeAndFive () {
        assertThat(fizzBuzzConverter.convert(15), is(FIZZBUZZ));
        assertThat(fizzBuzzConverter.convert(60), is(FIZZBUZZ));
        assertThat(fizzBuzzConverter.convert(75), is(FIZZBUZZ));
    }

    @Test
    public void shouldReturnFizzWhenContainsThree () {
        assertThat(fizzBuzzConverter.convert(13), is(FIZZ));
        assertThat(fizzBuzzConverter.convert(37), is(FIZZ));
        assertThat(fizzBuzzConverter.convert(73), is(FIZZ));
    }

    @Test
    public void shouldReturnFizzWhenContainsFive () {
        assertThat(fizzBuzzConverter.convert(52), is(BUZZ));
        assertThat(fizzBuzzConverter.convert(58), is(BUZZ));
        assertThat(fizzBuzzConverter.convert(59), is(BUZZ));
    }

    @Test
    public void shouldReturnFizzWhenContainsThreeAndFive () {
        assertThat(fizzBuzzConverter.convert(35), is(FIZZBUZZ));
        assertThat(fizzBuzzConverter.convert(53), is(FIZZBUZZ));
    }
}
