package javabase.deng;

/**
* @Author:         lz
* @CreateDate:     2019-07-01 20:30
 *
 * 冒泡排序
*/


public class BubbleSort {
    public static void bubble(int arr[], int n){
        int temp;
        for (int i = 0; i < n-1; i++) {
            if(arr[i] > arr[i+1]){
                temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }
        }
    }

    public static void bubbleSort(int arr[], int n){
        for (int i = n; i > 1; i--) {
            bubble(arr, i);
        }
    }
    public static void main(String[] args) {
        int arr[] = {6,5,1,2,3,9,8,4,7};
        bubbleSort(arr, 9);
        for (int i = 0; i < 9; i++) {
            System.out.print(arr[i]);
        }

        int i = 5;
        int s = (i++) + (++i) + (i--) + (--i);
        System.out.println("i:"+i);
        System.out.println("s:"+s);

//        int i = 1;
//        i = i++;
//        int j = i++;
//        int k = i + i++*++i;
//        System.out.println("t:"+k);

    }
}
