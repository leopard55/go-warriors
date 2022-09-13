package javabase.han.linkedlist;

import java.util.Stack;

class Node {
    public int value;
    protected Node next;

    public Node(int value) {
        this.value = value;
    }
}

public class LinkedList {


    /**
     * 获取到单链表的节点的个数(如果是带头结点的链表， 需求不统计头节点)
     *
     * @param head 链表的头节点
     * @return 返回的就是有效节点的个数
     */
    public static int getLength(Node head) {
        if (head.next == null) { //空链表
            return 0;
        }
        int length = 0; //定义一个辅助的变量, 这里我们没有统计头节点
        Node cur = head.next;
        while (cur != null) {

            length++;

            cur = cur.next; //遍历
        }
        return length;
    }

    //查找单链表中的倒数第 k 个结点 【新浪面试题】
    //思路
    // 1. 编写一个方法，接收 head 节点，同时接收一个 index
    // 2. index 表示是倒数第 index 个节点
    // 3. 先把链表从头到尾遍历，得到链表的总的长度 getLength
    // 4. 得到 size 后，我们从链表的第一个开始遍历 (size-index)个， 就可以得到
    // 5. 如果找到了，则返回该节点，否则返回 nulll
    public static Node findLastIndexNode(Node head, int index) {

        //判断如果链表为空， 返回 null

        if (head.next == null) {

            return null;//没有找到

        }
        //第一个遍历得到链表的长度(节点个数)
        int size = getLength(head);
        //第二次遍历 size-index 位置，就是我们倒数的第 K 个节点
        // 先做一个 index 的校验
        if (index <= 0 || index > size) {
            return null;
        }

        //定义给辅助变量， for 循环定位到倒数的index
        Node cur = head.next; // 3 // 3 - 1 = 2
        for (int i = 0; i < size - index; i++) {
            cur = cur.next;
        }
        return cur;

    }


    //将单链表反转

    public static void reversetList(Node head) {
        //如果当前链表为空，或者只有一个节点，无需反转，直接返回
        if (head.next == null || head.next.next == null) {
            return;
        }

        //定义一个辅助的指针(变量)，帮助我们遍历原来的链表

        Node cur = head.next;
        Node next = null;// 指向当前节点[cur]的下一个节点
        Node reverseHead = new Node(0);
        //遍历原来的链表，每遍历一个节点，就将其取出，并放在新的链表 reverseHead 的最前端
        // 动脑筋
        while (cur != null) {
            next = cur.next;//先暂时保存当前节点的下一个节点，因为后面需要使用
            cur.next = reverseHead.next;//将 cur 的下一个节点指向新的链表的最前端
            reverseHead.next = cur; //将 cur 连接到新的链表上 cur = next;//让 cur 后移

        }
        //将 head.next 指向 reverseHead.next , 实现单链表的反转
        head.next = reverseHead.next;
        do {
            System.out.println(head.value + ", ");
            head = head.next;
        } while (head != null);
    }


    //从尾到头打印单链表  1:反向遍历，先反转再遍历 2：Stack栈

    public static void reversePrint(Node head) {
        if (head.next == null) {
            return;//空链表， 不能打印
        }

        //创建要给一个栈，将各个节点压入栈
        Stack<Node> stack = new Stack<Node>();
        Node cur = head.next; //将链表的所有节点压入栈
        while (cur != null) {

            stack.push(cur);

            cur = cur.next;//cur 后移，这样就可以压入下一个节点
        }
        //将栈中的节点进行打印,pop 出栈
        while (stack.size() > 0) {

            System.out.println(stack.pop()); //stack 的特点是先进后出
        }

    }


    public static void main(String[] args) {
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);
        Node n5 = new Node(5);
        Node n6 = new Node(6);
        Node n7 = new Node(7);

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = n6;
        n6.next = n7;
        n7.next = null;

        Node head = new Node('0');
        head.next = n1;

        findLastIndexNode(head, 1);

        reversetList(head);

    }
}
