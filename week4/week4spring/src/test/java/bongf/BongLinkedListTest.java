package bongf;

import org.junit.jupiter.api.*;

import bongf.BongLinkedList.*;

import static org.assertj.core.api.Assertions.*;

class BongLinkedListTest {
    BongLinkedList linkedList;
    ListNode head;

    @BeforeEach
    void setUp() {
        linkedList = new BongLinkedList();
    }

    @Test
    @DisplayName("잘못된 위치에 head를 추가하면 예외가 발생해야한다")
    void addHeadAtWrongPosition() {
        ListNode nodeToAdd = new ListNode(1);
        assertThatThrownBy(() -> {
            linkedList.add(nodeToAdd, nodeToAdd, 100);
        }).isInstanceOf(IndexOutOfBoundsException.class);
    }

    @Nested
    @DisplayName("Head 추가한 후")
    class WhenAddHead {

        @BeforeEach
        void addHead() {
            head = new ListNode(0);
        }

        @Test
        @DisplayName("노드를 0에 추가하면 새 노드가 head가 되어야 한다.")
        void addNodeAt0() {
            ListNode nodeToAdd = new ListNode(1);
            linkedList.add(head, nodeToAdd, 0);
            assertThat(nodeToAdd.getNext()).isEqualTo(head);
        }

        @Test
        @DisplayName("잘못된 위치에 node를 추가하면 예외가 발생해야한다")
        void addNodeAtWrongPosition() {
            assertThatThrownBy(() -> {
                linkedList.add(head, new ListNode(1), 5);
            }).isInstanceOf(IndexOutOfBoundsException.class);

        }

        @Test
        @DisplayName("마지막 node의 다음 index에 새로운 노드를 추가할 수 있어야한다.")
        void addLast() {
            ListNode nodeToAdd = new ListNode(1);
            linkedList.add(head, nodeToAdd, 1);
            assertThat(head.getNext()).isEqualTo(nodeToAdd);
        }

        @Nested
        @DisplayName("node 하나 더 추가한 후")
        class WhenAddAnotherNode {
            ListNode addedNode1;
            ListNode addedNode2;

            @BeforeEach
            void addNodes() {
                addedNode1 = new ListNode(1);
                addedNode2 = new ListNode(2);
                linkedList.add(head, addedNode1, 1);
                linkedList.add(head, addedNode2, 2);
            }

            @Test
            @DisplayName("node를 다른 노드들 사이에 추가할 수 있어야한다")
            void addToInsert() {
                ListNode nodeToInsert = new ListNode(3);
                linkedList.add(head, nodeToInsert, 1);
                Assertions.assertAll(
                        () -> assertThat(head.getNext()).isEqualTo(nodeToInsert),
                        () -> assertThat(nodeToInsert.getNext()).isEqualTo(addedNode1)
                );
            }

            @Test
            @DisplayName("head를 제거할 수 있어야한다")
            void removeHead() {
                linkedList.remove(head, 0);
                assertThat(head.getNext()).isNull();
            }

            @Test
            @DisplayName("다른 node 사이의 node를 제거할 수 있어야한다")
            void removeNode() {
                linkedList.remove(head, 1);
                Assertions.assertAll(
                        () -> assertThat(head.getNext()).isEqualTo(addedNode2),
                        () -> assertThat(addedNode1.getNext()).isNull()
                );
            }

            @Test
            @DisplayName("잘못된 위치에서 제거하면 예외가 발생한다")
            void removeWrongNode() {
                assertThatThrownBy(() -> {
                    linkedList.remove(head, 5);
                }).isInstanceOf(IndexOutOfBoundsException.class);
            }

            @Test
            @DisplayName("node가 기존에 있는 node인지 확인 할 수 있어야한다")
            void checkNode() {
                Assertions.assertAll(
                        () -> assertThat(linkedList.contains(head, head)).isTrue(),
                        () -> assertThat(linkedList.contains(head, addedNode1)).isTrue(),
                        () -> assertThat(linkedList.contains(head, addedNode2)).isTrue(),
                        () -> assertThat(linkedList.contains(head, new ListNode(3))).isFalse()
                );
            }
        }
    }
}
