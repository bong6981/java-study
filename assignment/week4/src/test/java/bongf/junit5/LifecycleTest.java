package bongf.junit5;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Stack;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("A stack")
public class LifecycleTest {
    Stack<Object> stack = new Stack<>();
    String anElement = "an element";

    @Test
    @DisplayName("push an element and is no longer empty")
    void isNotEmpty() {
        stack.push(anElement);
        assertThat(stack.isEmpty()).isFalse();
    }

    @Test
    @DisplayName("it is empty")
    void isEmpty() {
        stack.pop();
        assertThat(stack.isEmpty()).isTrue();
    }
}

