package javabase.deng;

/**
 * @Author:         lz
 * @CreateDate:     2019-07-01 20:37
 *
 * 二叉树
 * 先中后遍历
 */


public class BinarySearchTree {

    static class Node{
        public int data;
        protected Node left;
        protected Node right;

        public Node(int data) {
            this.data = data;
        }
    }

    static class Tree{
        Node root;

        public Tree(Node root) {
            this.root = root;
        }

        public Tree() {
        }
    }

    public static void insert(Tree tree, int value){
        Node node = new Node(value);
        node.left = null;
        node.right = null;

        if(tree.root == null){
            tree.root = node;
        }else{
            Node temp = tree.root;
            while (temp != null){
                if(value < temp.data){
                    if(temp.left == null){
                        temp.left = node;
                        return;
                    }else{
                        temp = temp.left;
                    }
                }else{
                    if(temp.right == null){
                        temp.right = node;
                        return;
                    }else{
                        temp = temp.right;
                    }
                }
            }
        }
    }

    public static void preorder(Node node){
        if(node != null){
            System.out.println(node.data);
            preorder(node.left);
            preorder(node.right);
        }

    }

    public static void inorder(Node node){
        if(node != null){
            preorder(node.left);
            System.out.println(node.data);
            preorder(node.right);
        }
    }

    public static void psotorder(Node node){
        if(node != null){
            preorder(node.left);
            preorder(node.right);
            System.out.println(node.data);
        }
    }

    public static int get_height(Node node){
        if(node == null){
            return 0;
        }else{
            int left_h = get_height(node.left);
            int right_h = get_height(node.right);
            int max = left_h;
            if(right_h > max){
                max = right_h;
            }
            return max + 1;
        }
    }

    public static int get_maximum(Node node){
        if(node == null){
            return -1;
        }else{
            int m1 = get_maximum(node.left);
            int m2 = get_maximum(node.right);
            int m3 = node.data;
            int max = m1;
            if(m2 > max){
                max = m2;
            }
            if(m3 > max){
                max = m3;
            }
            return max;
        }
    }

    public static void main(String[] args) {
        int[] arr = {6,3,8,2,5,1,7};

        Tree tree = new Tree();
        tree.root = null;

        for (int i = 0; i < 7; i++) {
            insert(tree, arr[i]);
        }

        preorder(tree.root);

        int height = get_height(tree.root);
        System.out.println("height: " + height);

        int maximum = get_maximum(tree.root);
        System.out.println("maximum: " + maximum);
    }
}
