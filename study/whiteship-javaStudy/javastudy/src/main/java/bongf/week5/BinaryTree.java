package bongf.week5;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTree {
    private List<Integer> dfsVisited = new ArrayList<>();

    public BinaryTree() {
    }

    public List<Integer> bfs(Node root) {
        List<Integer> visited = new ArrayList<>();
        Queue<Node> toCheckNodes = new LinkedList<>();
        toCheckNodes.offer(root);

        while (!toCheckNodes.isEmpty()) {
            Node node = toCheckNodes.poll();
            visited.add(node.getValue());

            if (node.getLeft() != null) {
                toCheckNodes.offer(node.getLeft());
            }
            if (node.getRight() != null) {
                toCheckNodes.offer(node.getRight());
            }
        }
        return visited;
    }

    public List<Integer> dfs(Node root) {
        if (root.getLeft() != null) {
            dfs(root.getLeft());
        }

        dfsVisited.add(root.getValue());

        if (root.getRight() != null) {
            dfs(root.getRight());
        }
        return dfsVisited;
    }
}
