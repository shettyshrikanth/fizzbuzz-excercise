package com.uk.fzbz;

import static java.lang.String.format;

public class FizzBuzzConverter {

    public String convert(final int number) {
        if(number < 1 || number > 100)
            throw new IllegalArgumentException(format("number %d is out of range, number should be > 0 and < 100", number));

        final boolean isFizz = isMatch(number, 3);
        final boolean isBuzz = isMatch(number, 5);

        if (isFizz && isBuzz)
            return "FizzBuzz";
        else if (isFizz)
            return "Fizz";
        else if (isBuzz)
            return "Buzz";
        else
            return Integer.toString(number);
    }

    private boolean isMatch(final int numerator, final int denominator) {
        return numerator % denominator == 0
                || numerator % 10 == denominator
                || numerator / 10 == denominator;
    }
}
