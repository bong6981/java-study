package bongf.junit5;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Stack;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("A stack")
public class BeforeEachTest {
    Stack<Object> stack;
    String anElement = "an element";

    @BeforeEach
    void createNewStack() {
        stack = new Stack<>();
        stack.push(anElement);
    }

    @Test
    @DisplayName("it is no longer empty")
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

