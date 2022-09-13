package javabase.han.huffmancode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class HuffmanTree {

    public static void main(String[] args) {
        int arr[] = { 13, 7, 8, 3, 29, 6, 1 };
        Node root = createHuffmanTree(arr);
        preOrder(root);

    }

    //前序遍历
    public static void preOrder(Node root) {
        if(root != null) {
            root.preOrder();
        }else{
            System.out.println("是空树不能遍历");
        }
    }

    // 创建霍夫曼树
    public static Node createHuffmanTree(int[] arr) {
        List<Node> nodes = new ArrayList<Node>();
        for (int value : arr) {
            nodes.add(new Node(value));
        }

        while(nodes.size() > 1) {

            //排序，从小到大
            Collections.sort(nodes);

            System.out.println("nodes =" + nodes);

            //取出根结点权值最小的两颗二叉树
            Node leftNode = nodes.get(0);
            Node rightNode = nodes.get(1);

            //构建一颗新的二叉树
            Node parent = new Node(leftNode.value + rightNode.value);
            parent.left = leftNode;
            parent.right = rightNode;

            nodes.remove(leftNode);
            nodes.remove(rightNode);

            nodes.add(parent);
        }

        return nodes.get(0);

    }
}

// 创建节点类
// 为了让node对象持续排序collections集合排序
// 让Node 实现Comparable接口
class Node implements Comparable<Node> {
    int value; // 节点权值
    Node left;
    Node right;

    public void preOrder() {
        System.out.println(this);
        if(this.left != null) {
            this.left.preOrder();
        }
        if(this.right != null) {
            this.right.preOrder();
        }
    }

    public Node(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Node [value=" + value + "]";
    }

    @Override
    public int compareTo(Node o) {
        // TODO Auto-generated method stub
        // 从小到大排序
        return this.value - o.value;
    }

}

