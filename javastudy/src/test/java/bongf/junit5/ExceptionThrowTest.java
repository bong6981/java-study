package bongf.junit5;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class ExceptionThrowTest {
    @DisplayName("Should throw exception")
    @Test
    void shouldThrowException() {
        assertThrows(RuntimeException.class, () -> {
            Integer.parseInt("hello");
        });
    }
}
