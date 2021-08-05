package bongf;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

class ArrayQueueTest {
    ArrayQueue arrayQueue;

    @BeforeEach
    void set() {
        arrayQueue = new ArrayQueue();
    }

    @Test
    @DisplayName("빈 큐에 offer를 할 수 있어야 한다")
    void pushIntoEmptyQueue() {
        arrayQueue.offer(0);
        assertAll(
                () -> assertThat(arrayQueue.getQueueArray().length).isEqualTo(1),
                () -> assertThat(arrayQueue.getQueueArray()[0]).isEqualTo(0)
        );
    }

    @Test
    @DisplayName("빈 큐에 poll하면 null이 return 되어야 한다")
    void pollFromEmptyQueue() {
        assertThat(arrayQueue.poll()).isNull();
    }

    @Nested
    @DisplayName("요소 추가 후")
    class WhenOfferElements {

        @BeforeEach
        void offerElements() {
            arrayQueue.offer(0);
            arrayQueue.offer(1);
        }

        @Test
        @DisplayName("큐에 offer를 할 수 있어야 한다.")
        void offerIntoQueue() {
            arrayQueue.offer(2);
            assertAll(
                    () -> assertThat(Arrays.toString(arrayQueue.getQueueArray())).isEqualTo("[0, 1, 2]"),
                    () -> assertThat(arrayQueue.getQueueArray().length).isEqualTo(3)
            );
        }

        @Test
        @DisplayName("큐에 poll하면 첫번째 요소가 제거되어야 한다.")
        void pollFromQueue() {
            int num = arrayQueue.poll();
            assertAll(
                    () -> assertThat(num).isEqualTo(0),
                    () -> assertThat(Arrays.toString(arrayQueue.getQueueArray())).isEqualTo("[1]"),
                    () -> assertThat(arrayQueue.getQueueArray().length).isEqualTo(1)
            );
        }
    }
}
