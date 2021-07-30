package bongf.junit5;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.time.LocalDate;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ExampleTest {

    private final String currentDayOfWeek = LocalDate.now().getDayOfWeek().toString();

    @Test
    @Disabled("Not implemented yet")
    void shouldShowSimpleWrongAssertion() {
        assertEquals(1, 2);
    }

    @Test
    @DisplayName("Should demonstrate a simple assertion")
    void shouldShowSimpleAssertion() {
        assertEquals(1, 1);
    }

    @Test
    @DisplayName("Should check all items in the list")
    void shouldCheckAllItemsInTheList() {
        List<Integer> numbers = List.of(2, 3, 5, 7);
        assertEquals(2, numbers.get(0));
        assertEquals(3, numbers.get(3));
        assertEquals(5, numbers.get(2));
        assertEquals(7, numbers.get(3));
    }

    @Test
    @DisplayName("Should check all items in the list")
    void shouldCheckAllItemsInByAssertAll() {
        List<Integer> numbers = List.of(2, 3, 5, 7);
        Assertions.assertAll(
                () -> assertEquals(1, numbers.get(0)),
                () -> assertEquals(3, numbers.get(1)),
                () -> assertEquals(1, numbers.get(2)),
                () -> assertEquals(7, numbers.get(3)));
    }

    @Test
    @DisplayName("Should only run the test if some criteria are met")
    void shouldOnlyRunTheTestIfSomeCriteriaAreMet() {
        Assumptions.assumeTrue(currentDayOfWeek.equals("WEDNESDAY"));
        assertEquals(1, 1);
    }

    @ParameterizedTest
    @DisplayName("Should check all numbers are odd numbers")
    @ValueSource(ints = {3, 4, 5, 8, 14})
    void shouldCheckOddNumbers(int number) {
        assertThat(number%2).isEqualTo(1);
    }

    @DisplayName("Should throw exception")
    @Test
    void shouldThrowException() {
        assertThrows(RuntimeException.class, () -> {
            Integer.parseInt("hello");
        });
    }
}
