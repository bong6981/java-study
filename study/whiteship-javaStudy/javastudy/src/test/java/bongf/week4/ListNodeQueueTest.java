package bongf.week4;

import bongf.week4.ListNode;
import bongf.week4.ListNodeQueue;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

class ListNodeQueueTest {
    ListNodeQueue listNodeQueue;

    @BeforeEach
    void set() {
        listNodeQueue = new ListNodeQueue();
    }

    @Test
    @DisplayName("빈 큐에 offer를 하면 추가한 element가 head가 돼야 한다")
    void offerIntoEmptyQueue() {
        listNodeQueue.offer(0);
        assertAll(
                () -> assertThat(listNodeQueue.head.getData()).isEqualTo(0),
                () -> assertThat(listNodeQueue.head.getNext()).isEqualTo(null)
        );
    }

    @Test
    @DisplayName("빈 큐에 poll하면 null이 return 되어야 한다")
    void pollFromEmptyQueue() {
        assertThat(listNodeQueue.poll()).isNull();
    }

    @Nested
    @DisplayName("요소 추가 후")
    class WhenOfferElements {
        ListNode head;
        ListNode second;
        ListNode third;

        @BeforeEach
        void offerElements() {
            head = listNodeQueue.offer(0);
            second = listNodeQueue.offer(1);
            third = listNodeQueue.offer(2);
        }

        @Test
        @DisplayName("offer하면 마지막 element 뒤에 요소가 추가되어야 한다")
        void offerIntoQueue() {
            listNodeQueue.offer(3);

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
        @DisplayName("큐에 poll하면 첫번째 요소가 제거되어야 한다.")
        void pollFromQueue() {
            ListNode removedNode = listNodeQueue.poll();

            assertAll(
                    () -> assertThat(removedNode.getData()).isEqualTo(0),
                    () -> assertThat(removedNode.getNext()).isNull(),
                    () -> assertThat(listNodeQueue.head.getData()).isEqualTo(1)
            );
        }

        @Test
        @DisplayName("모든 요소를 poll하면 head가 null이어야한다")
        void pollAll() {
            for (int i = 0; i < 3; i++) {
                listNodeQueue.poll();
            }
            assertThat(listNodeQueue.head).isNull();
        }
    }
}
