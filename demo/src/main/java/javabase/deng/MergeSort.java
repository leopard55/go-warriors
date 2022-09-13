package javabase.deng;

/**
* @Author:         lz
* @CreateDate:     2019-07-01 20:29
*归并排序
 */


public class MergeSort {
    public static void merge(int arr[], int L, int M, int R){
        int left_size = M-L;
        int right_size = R-M+1;
        int L_arr[] = new int[left_size];
        int R_arr[] = new int[right_size];

        for(int i=L; i<M; i++)
            L_arr[i-L] = arr[i];
        for(int i=M; i<=R; i++)
            R_arr[i-M] = arr[i];

        int i = 0, j = 0, k = L;
        while(i < left_size && j < right_size)
            if(L_arr[i]<R_arr[j])
                arr[k++] = L_arr[i++];
            else
                arr[k++] = R_arr[j++];

        while(i < left_size)
            arr[k++] = L_arr[i++];
        while(j < right_size)
            arr[k++] = R_arr[j++];
    }

    public static void merge_sort(int arr[], int L, int R){
        if(L == R)
            return;
        else
        {
            int M = (L+R)/2;
            merge_sort(arr, L, M);
            merge_sort(arr, M+1, R);
            merge(arr, L, M+1, R);
        }
    }

    public static void print_sort(int arr[], int num)
    {
        for(int i=0; i < num; i++)
            System.out.print(arr[i]+" ");
    }

    public static void main(String[] args) {
        int arr[] = {6, 3, 2, 7, 5, 1, 4, 0, 8, 9};
        merge_sort(arr, 0, 9);
        print_sort(arr, 10);
    }
}



