package bongf.week5;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class BinaryTreeTest {
    BinaryTree binaryTree = new BinaryTree();
    Node root;

    /*
     *                0
     *              /  \
     *             1    2
     *            /\    /\
     *           3  4  5  6
     */
    @BeforeEach
    void set() {
        root = new Node(0);
        Node one = new Node(1);
        Node two = new Node(2);
        Node three = new Node(3);
        Node four = new Node(4);
        Node five = new Node(5);
        Node six = new Node(6);
        root.setLeft(one);
        root.setRight(two);
        one.setLeft(three);
        one.setRight(four);
        two.setLeft(five);
        two.setRight(six);
    }

    @Test
    void dfs() {
        assertThat(binaryTree.bfs(root).toString()).isEqualTo("[0, 1, 2, 3, 4, 5, 6]");
    }

    @Test
    void bfs() {
        assertThat(binaryTree.dfs(root).toString()).isEqualTo("[3, 1, 4, 0, 5, 2, 6]");
    }
}
