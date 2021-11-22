package bongf.junit5;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ExampleTest {

    @Test
    @DisplayName("Should demonstrate a simple assertion")
    void shouldShowSimpleAssertion() {
        assertEquals(1, 1);
    }
}
