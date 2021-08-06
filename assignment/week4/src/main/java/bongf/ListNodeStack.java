package bongf;

import java.util.EmptyStackException;

public class ListNodeStack {
    ListNode head;

    public ListNodeStack() {
    }

    public ListNode push(int data) {
        if (head == null) {
            head = new ListNode(data);
            return head;
        }

        ListNode lastNode = head;
        while (lastNode.getNext() != null) {
            lastNode = lastNode.getNext();
        }

        lastNode.setNext(new ListNode(data));
        return lastNode;
    }

    public ListNode pop() {
        if (head == null) {
            throw new EmptyStackException();
        }

        if (head.getNext() == null) {
            this.head = null;
            return null;
        }

        ListNode prev = head;
        ListNode last = prev.getNext();
        while (last.getNext() != null) {
            prev = prev.getNext();
            last = last.getNext();
        }

        prev.setNext(null);
        return prev;
    }
}
