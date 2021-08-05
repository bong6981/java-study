package bongf;

public class BongLinkedList {

    public BongLinkedList() {
    }

    public void add(ListNode head, ListNode nodeToAdd, int position) {
        checkIndex(position);

        if (position == 0) {
            if (head == nodeToAdd) {
                return;
            }
            nodeToAdd.setNext(head);
            return;
        }

        ListNode prev = head;
        while (position - 1 > 0) {
            if (prev.getNext() == null) {
                throw new IndexOutOfBoundsException();
            }
            prev = prev.getNext();
            position--;
        }

        ListNode next = prev.getNext();
        prev.setNext(nodeToAdd);
        nodeToAdd.setNext(next);
    }

    public void remove(ListNode head, int positionToRemove) {
        checkIndex(positionToRemove);

        if (positionToRemove == 0) {
            head.setNext(null);
            return;
        }

        ListNode prev = head;
        while (positionToRemove - 1 > 0) {
            if (prev.getNext() == null) {
                throw new IndexOutOfBoundsException();
            }
            prev = prev.getNext();
            positionToRemove--;
        }

        if (prev.getNext() == null) {
            throw new IndexOutOfBoundsException();
        }

        ListNode toRemove = prev.getNext();
        if (toRemove.getNext() == null) {
            prev.setNext(null);
        } else {
            prev.setNext(toRemove.getNext());
        }
        toRemove.setNext(null);
    }

    public boolean contains(ListNode head, ListNode nodeToCheck) {
        ListNode checkingNode = head;
        while (checkingNode != null) {
            if (checkingNode == nodeToCheck) {
                return true;
            }
            checkingNode = checkingNode.getNext();
        }
        return false;
    }

    private void checkIndex(int position) {
        if (position < 0)
            throw new IndexOutOfBoundsException();
    }
}


