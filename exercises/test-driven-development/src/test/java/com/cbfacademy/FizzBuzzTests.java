package com.cbfacademy;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.stream.Stream;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

@DisplayName("The FizzBuzz kata should")
public class FizzBuzzTests {
    @Test
    @DisplayName("Checks the app is created")
    public void createsAnApp() {
        final App app = new App();

        assertThat(app, is(notNullValue()));
    }

    // NB you are meant to purposely have tests that fail, then write hard coded
    // code, then have it pass, then write actual properly implemented code to have
    // it pass
    @ParameterizedTest
    @MethodSource("exerciseArguments")
    @DisplayName("should return number, 'Fizz, 'Buzz' or 'FizzBuzz'")
    public void ShouldReturnCorrectOutput(Integer value, String expected) {
        final String actual = FizzBuzz.of(value);

        assertThat(actual, is(expected));
    }

    public static Stream<Arguments> exerciseArguments() {
        return Stream.of(
                org.junit.jupiter.params.provider.Arguments.arguments(1, "1"),
                org.junit.jupiter.params.provider.Arguments.arguments(3, "Fizz"),
                org.junit.jupiter.params.provider.Arguments.arguments(6, "Fizz"),
                org.junit.jupiter.params.provider.Arguments.arguments(21, "Buzz"));
    }

    // @Test
    // @DisplayName("should return 'fizz' when input is 3")
    // public void ShouldReturnFizzWhenInputIs3(){
    // final String actual = FizzBuzz.of(3);

    // assertThat(actual, is("Fizz"));
    // }

    // @DisplayName("should return 1 when input is 1")
    // public void ShouldReturn1WHenInputIs1(){
    // final String actual = FizzBuzz.of(1);

    // assertThat(actual, is("1"));
    // }
}
