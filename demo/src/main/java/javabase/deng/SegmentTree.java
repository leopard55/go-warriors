package javabase.deng;

/**
* @Author:         lz
* @CreateDate:     2019-07-01 20:29
 *
 * 线段树
*/

public class SegmentTree {
    public static final int MAX_LEN = 1000;

    public static int query_tree(int arr[], int tree[], int node, int start, int end, int L, int R) {
        System.out.println("start = "+start);
        System.out.println("end = "+end);
        System.out.println();
        if (R < start || L > end) {
            return 0;
        }else if(L <= start && end <=R){
            return tree[node];
        }else if (start == end){
            return tree[node];
        }
        else{
            int mid =(start + end)/2;
            int left_node =2 * node + 1;
            int right_node =2 * node + 2;
            int sum_left = query_tree(arr, tree, left_node, start, mid, L, R);
            int sum_right = query_tree(arr, tree, right_node, mid+1, end, L, R);
            return sum_left + sum_right;
        }
    }

    public static void update_tree(int arr[], int tree[], int node, int start, int end, int idx, int val){
        if(start == end){
            arr[idx] = val;
            tree[node]= arr[start];
        }else{
            int mid =(start + end)/2;
            int left_node = 2 * node +1;
            int right_node = 2 * node + 2;
            if(idx >= start && idx <= mid){
                build_tree(arr, tree, left_node, start, mid);
            }else{
                build_tree(arr, tree, right_node, mid+1, end);
            }
            tree[node]= tree[left_node] + tree[right_node];
        }
    }

    public static void build_tree(int arr[], int tree[], int node, int start, int end){
        if (start == end) {
            tree[node] = arr[start];
        }else{
            int mid =(start + end)/2;
            int left_node = 2*node + 1;
            int right_node = 2*node + 2;

            build_tree(arr, tree, left_node, start, mid);
            build_tree(arr, tree, right_node, mid+1, end);
            tree[node]= tree[left_node] + tree[right_node];
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9, 11};
        int size = 6;
        int[] tree = new int[MAX_LEN];
        build_tree(arr, tree, 0, 0, size-1);
        for (int i = 0; i < 15; i++) {
            System.out.println("tree["+i+"] = "+tree[i]);
        }

        update_tree(arr, tree, 0, 0,size-1,4,6);

        System.out.println();
        for (int j = 0; j < 15; j++) {
            System.out.println("tree["+j+"] = "+tree[j]);
        }

        System.out.println();
        int s = query_tree(arr, tree, 0, 0, size-1, 2,5);
        System.out.println("s = "+s);
    }
}