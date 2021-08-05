package bongf;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.EmptyStackException;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.assertAll;

class ArrayStackTest {
    ArrayStack arrayStack;

    @BeforeEach
    void set() {
        arrayStack = new ArrayStack();
    }

    @Test
    @DisplayName("빈 스택에 push를 할 수 있어야 한다")
    void pushIntoEmptyStack() {
        arrayStack.push(1);
        assertAll(
                () -> assertThat(arrayStack.getStackArray().length).isEqualTo(1),
                () -> assertThat(arrayStack.getStackArray()[0]).isEqualTo(1)
        );
    }

    @Test
    @DisplayName("빈 스택에 pop하면 예외가 발생해야 한다")
    void popFromEmptyStack() {
        assertThatThrownBy(() -> {
            arrayStack.pop();
        }).isInstanceOf(EmptyStackException.class);
    }

    @Nested
    @DisplayName("요소 추가 후")
    class WhenPushElements {

        @BeforeEach
        void pushElements() {
            arrayStack.push(0);
            arrayStack.push(1);
        }

        @Test
        @DisplayName("스택에 push를 할 수 있어야 한다.")
        void pushIntoStack() {
            arrayStack.push(2);
            assertAll(
                    () -> assertThat(Arrays.toString(arrayStack.getStackArray())).isEqualTo("[0, 1, 2]"),
                    () -> assertThat(arrayStack.getStackArray().length).isEqualTo(3)
            );
        }

        @Test
        @DisplayName("스택에 pop하면 마지막 요소가 제거되어야 한다.")
        void popFromStack() {
            int num = arrayStack.pop();
            assertAll(
                    () -> assertThat(num).isEqualTo(1),
                    () -> assertThat(Arrays.toString(arrayStack.getStackArray())).isEqualTo("[0]"),
                    () -> assertThat(arrayStack.getStackArray().length).isEqualTo(1)
            );
        }
    }
}
