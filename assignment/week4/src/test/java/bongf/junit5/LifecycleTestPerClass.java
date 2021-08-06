package bongf.junit5;

import org.junit.jupiter.api.*;

import java.util.Stack;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("A stack")
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class LifecycleTestPerClass {
    Stack<Object> stack = new Stack<>();
    String anElement = "an element";

    @Test
    @DisplayName("push an element and is no longer empty")
    @Order(1)
    void isNotEmpty() {
        stack.push(anElement);
        assertThat(stack.isEmpty()).isFalse();
    }

    @Test
    @DisplayName("it is empty")
    @Order(2)
    void isEmpty() {
        stack.pop();
        assertThat(stack.isEmpty()).isTrue();
    }
}

