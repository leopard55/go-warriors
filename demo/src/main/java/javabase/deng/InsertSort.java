package javabase.deng;

/**
* @Author:         lz
* @CreateDate:     2019-07-01 20:29
 * 插入排序
*/


public class InsertSort {

    public static void insert(int arr[], int n ){
        int key = arr[n];
        int i = n;
        while (arr[i-1] > key){
            arr[i] = arr[i - 1];
            i--;
            if(i == 0){
                break;
            }
        }
        arr[i] = key;
    }

    public static void insertionSrot(int arr[], int n){
        for (int i = 1; i < n; i++) {
            insert(arr, i);
        }
    }

    public static void main(String[] args) {
        int arr[] = {6,5,1,2,3,9,8,4,7};
        insertionSrot(arr, 9);
        for (int i = 0; i < 9; i++) {
            System.out.print(arr[i]);
        }
    }
}
