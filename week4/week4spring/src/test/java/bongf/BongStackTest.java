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

class BongStackTest {
    BongStack bongStack;

    @BeforeEach
    void set() {
        bongStack = new BongStack();
    }

    @Test
    @DisplayName("빈 스택에 push를 할 수 있어야 한다")
    void pushIntoEmptyStack() {
        bongStack.push(1);
        assertAll(
                () -> assertThat(bongStack.getStackArray().length).isEqualTo(1),
                () -> assertThat(bongStack.getStackArray()[0]).isEqualTo(1)
        );
    }

    @Test
    @DisplayName("빈 스택에 pop하면 예외가 발생해야 한다")
    void popFromEmptyStack() {
        assertThatThrownBy(() -> {
            bongStack.pop();
        }).isInstanceOf(EmptyStackException.class);
    }

    @Nested
    @DisplayName("요소 추가 후")
    class WhenPushElements {

        @BeforeEach
        void pushElements() {
            bongStack.push(0);
            bongStack.push(1);
        }

        @Test
        @DisplayName("이미 데이터가 있는 스택에 push를 할 수 있어야 한다.")
        void pushIntoStack() {
            bongStack.push(2);
            assertAll(
                    () -> assertThat(Arrays.toString(bongStack.getStackArray())).isEqualTo("[0, 1, 2]"),
                    () -> assertThat(bongStack.getStackArray().length).isEqualTo(3)
            );
        }

        @Test
        @DisplayName("스택에 pop하면 마지막 요소가 제거되어야 한다.")
        void popFromStack() {
            bongStack.pop();
            assertAll(
                    () -> assertThat(Arrays.toString(bongStack.getStackArray())).isEqualTo("[0]"),
                    () -> assertThat(bongStack.getStackArray().length).isEqualTo(1)
            );
        }
    }
}
