package bongf.week4;

import bongf.week4.ListNode;
import bongf.week4.ListNodeStack;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.util.EmptyStackException;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.assertAll;

class ListNodeStackTest {
    ListNodeStack listNodeStack;

    @BeforeEach
    void set() {
        listNodeStack = new ListNodeStack();
    }

    @Test
    @DisplayName("빈 스택에 push를 하면 추가한 element가 head가 돼야 한다")
    void pushIntoEmptyStack() {
        listNodeStack.push(0);
        assertAll(
                () -> assertThat(listNodeStack.head.getData()).isEqualTo(0),
                () -> assertThat(listNodeStack.head.getNext()).isEqualTo(null)
        );
    }

    @Test
    @DisplayName("빈 스택에 pop하면 예외가 발생 되어야 한다")
    void popFromEmptyStack() {
        assertThatThrownBy(() -> {
            listNodeStack.pop();
        }).isInstanceOf(EmptyStackException.class);
    }

    @Nested
    @DisplayName("요소 추가한 후에")
    class WhenPushElements {
        ListNode head;
        ListNode second;
        ListNode third;

        @BeforeEach
        void pushElements() {
            head = listNodeStack.push(0);
            second = listNodeStack.push(1);
            third = listNodeStack.push(2);
        }

        @Test
        @DisplayName("push하면 마지막 element뒤에 요소가 추가되어야 한다")
        void pushIntoStack() {
            listNodeStack.push(3);

            ListNode lastNode = head;
            while (lastNode.getNext() != null) {
                lastNode = lastNode.getNext();
            }

            ListNode finalLastNode = lastNode;
            assertAll(
                    () -> assertThat(finalLastNode.getData()).isEqualTo(3),
                    () -> assertThat(finalLastNode.getNext()).isNull()
            );
        }

        @Test
        @DisplayName("스택에 pop하면 마지막 요소가 제거되어야 한다.")
        void popFromStack() {
            listNodeStack.pop();

            ListNode lastNode = head;
            while (lastNode.getNext() != null) {
                lastNode = lastNode.getNext();
            }

            ListNode finalLastNode = lastNode;
            assertAll(
                    () -> assertThat(finalLastNode.getData()).isEqualTo(1),
                    () -> assertThat(third.getNext()).isNull()
            );
        }

        @Test
        @DisplayName("모든 요소를 pop하면 head가 null이어야한다")
        void popAll() {
            for (int i = 0; i < 3; i++) {
                listNodeStack.pop();
            }

            assertThat(listNodeStack.head).isNull();
        }
    }
}
