package bongf.study.deepcopy;

public class ShallowCopyDeepCopy {
    public static void main(String[] args) {
        Node node1 = new Node(1, 1);
        Node node2 = new Node(node1.idx, node1.size);
        System.out.println(node1.equals(node2)); //false

        node1.size = 1000;
        System.out.println(node2); //Node{idx=1, size=1}
    }
}

class Node {
    int idx;
    int size;

    public Node(int idx, int size) {
        this.idx = idx;
        this.size = size;
    }

    @Override
    public String toString() {
        return "Node{" +
                "idx=" + idx +
                ", size=" + size +
                '}';
    }
}
