package javabase.deng;

class Node{
    public int value;
    protected Node next;

    public Node(int value) {
        this.value = value;
    }
}

public class LinkedList {

    public static int get_list_length(Node list){
        Node p = list;
        int length = 0;
        while ( p!= null){
            ++length;
            p = p.next;
        }
        return length;
    }

    public static Node find_common_node(Node list1, Node list2){
        int length1 = get_list_length(list1);
        int length2 = get_list_length(list2);
        Node long_list = list1;
        Node short_list = list2;
        if(length2 > length1){
            long_list = list2;
            short_list = list1;
        }
        int offset = Math.abs(length1 - length2);
        Node p1 = relocate_first_node(long_list, offset);
        Node p2 = short_list;
        while (p1 != null){
            if(p1 == p2){
                return p1;
            }
            p1 = p1.next;
            p2 = p2.next;
        }
        return null;
    }

    public static Node relocate_first_node(Node list, int offset){
        Node p = list;
        int i;
        for (i = 0; i < offset; i++){
            p = p.next;
        }
        return p;
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
        n6.next = null;
        n7.next = n4;

        Node list1 = n1;
        Node list2 = n7;

        System.out.println(get_list_length(list1));
        System.out.println(get_list_length(list2));

        Node common = find_common_node(list1, list2);
        System.out.println("commmon node: "+common.value);
    }
}
