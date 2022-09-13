package javabase.deng;

/**
* @Author:         lz
* @CreateDate:     2019-06-21 15:20
 *
 * Permutation
 *
 * 拿数组A的p到q个元素做全排列
*/

public class Perm {

    static int num;

    public static void swap(int A[], int i, int j){
        int temp = A[i];
        A[i] = A[j];
        A[j] = temp;
    }

    public static void printArray(int A[], int n){
        for (int i = 0; i < n; i++) {
            System.out.print(A[i]+" ");
        }
        System.out.println();
    }

    public static void perm(int A[], int p, int q,int[] arr){
        if(p == q){
            judge(A, arr);
        }else{
            for (int i = p; i <= q; i++) {
                swap(A, 0, i);
                perm(A, p+1, q,arr);
                swap(A, 0, i);
            }
        }


    }
    public static void judge(int[] A, int[] arr){
        for (int i = 0; i < A.length-1; i++) {
            if(arr[i] == 1){
                if(A[i] > A[i+1]){
                    num++;
                }
            }
            if(arr[i] == 0){
                if(A[i] < A[i+1]){
                    num++;
                }
            }
        }
    }

    public static void main(String[] args) {
        int A[] = {1,2,3,4,5};
//        perm(A, 0, 4);
    }
}












