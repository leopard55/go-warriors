package javabase.deng;

/**
* @Author:         lz
* @CreateDate:     2019-06-21 16:21
 *
 * 选择排序
*/


public class SelectionSort {
    public static int findMaxPos(int arr[], int n){
        int max = arr[0];
        int pos = 0;
        for (int i = 0; i < n; i++) {
            if(arr[i] > max){
                max = arr[i];
                pos = i;
            }
        }
        return pos;
    }

    public static void selectionSort(int arr[], int n){
        while(n > 1){
            int pos = findMaxPos(arr, n);
            int temp = arr[pos];
            arr[pos] = arr[n-1];
            arr[n-1] = temp;
            n--;
        }
    }
    public static void main(String[] args) {
        int arr[] = {6,5,1,2,3,9,8,4,7};
        selectionSort(arr, 9);
        for (int i = 0; i < 9; i++) {
            System.out.print(arr[i]);
        }
    }
}
