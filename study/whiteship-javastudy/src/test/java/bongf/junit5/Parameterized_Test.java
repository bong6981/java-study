package bongf.junit5;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.params.ParameterizedTest;

public class Parameterized_Test {

    @ParameterizedTest
    @DisplayName("Should check all numbers are odd numbers")
    @ValueSource(ints = {3, 4, 5, 8, 14})
    void shouldCheckOddNumbers(int number) {
        assertThat(number%2).isEqualTo(1);
    }
}
