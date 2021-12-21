package bongf.junit5;

import org.junit.jupiter.api.*;

import java.util.Stack;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("A stack")
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class BeforeAllTest {
    Stack<Object> stack = new Stack<>();
    String anElement = "an element";

    @BeforeAll
    void createNewStack() {
        stack.push(anElement);
    }

    @Test
    @DisplayName("it is not empty")
    void isNotEmpty() {
        assertThat(stack.isEmpty()).isFalse();
    }

    @Test
    @DisplayName("returns the element when popped and is empty")
    void returnElementWhenPopped() {
        assertThat(stack.pop()).isEqualTo(anElement);
        assertThat(stack.isEmpty()).isTrue();
    }
}
