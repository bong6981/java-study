package bongf.week4;

public class ListNodeQueue {
    ListNode head;

    public ListNodeQueue() {
    }

    public ListNode offer(int data) {
        if(head == null) {
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

    public ListNode poll() {
        if(head == null) {
            return null;
        }

        ListNode toRemove = head;
        head = head.getNext();
        toRemove.setNext(null);
        return toRemove;
    }
}
