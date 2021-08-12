package bongf.week4;

public class ListNode {
        private int data;
        private ListNode next;

        ListNode(int data) {
            this.data = data;
        }

        ListNode getNext() {
            return this.next;
        }

        int getData() {
            return this.data;
        }

        void setNext(ListNode next) {
            this.next = next;
        }
}


