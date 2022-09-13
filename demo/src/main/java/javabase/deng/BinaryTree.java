package javabase.deng;

/**
* @Author:         lz
* @CreateDate:     2019-07-01 20:37
 *
 * 二叉树
 * 先中后遍历
*/
class TreeNode{
    public int data;
    protected TreeNode left;
    protected TreeNode right;

    public TreeNode(int data) {
        this.data = data;
    }
}

public class BinaryTree {

    public static void preorder(TreeNode node){
        if(node != null){
            System.out.println(node.data);
            preorder(node.left);
            preorder(node.right);
        }

    }

    public static void inorder(TreeNode node){
        if(node != null){
            preorder(node.left);
            System.out.println(node.data);
            preorder(node.right);
        }
    }

    public static void psotorder(TreeNode node){
        if(node != null){
            preorder(node.left);
            preorder(node.right);
            System.out.println(node.data);
        }
    }

    public static void main(String[] args) {
        TreeNode n1  = new TreeNode(5);
        TreeNode n2 = new TreeNode(6);
        TreeNode n3 = new TreeNode(7);
        TreeNode n4 = new TreeNode(8);

        n1.left = n2;
        n1.right = n3;
        n2.left = n4;
        n2.right = null;
        n3.left = null;
        n3.right = null;
        n4.left = null;
        n4.right = null;

        preorder(n1);
    }
}
