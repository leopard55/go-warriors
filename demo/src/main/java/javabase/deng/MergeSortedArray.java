package javabase.deng;

public class MergeSortedArray {

    public static int[] merge(int[] nums1, int m, int[] nums2, int n ){
        int[] arr = new int[m+n];
        int i = 0;
        int j = 0;
        int k = 0;
        while(i < m && j < n){
            if(nums1[i] < nums2[j]){
                arr[k] = nums1[i];
                i++;
            }else{
                arr[k] = nums2[j];
                j++;
            }
            k++;
        }

        while(i < m){
            arr[k] = nums1[i];
            i++;k++;
        }

        while(j < n){
            arr[k] = nums1[j];
            j++;k++;
        }

        for (i = 0; i < k; i++) {
            nums1[i]  = arr[i];
        }

        return nums1;
    }

    public static void printArray(int[] nums){
        for (int i = 0; i < 9; i++) {
            System.out.println(nums[i]+" ");
        }
    }

    public static void main(String[] args) {
        int[] nums1 = new int[100];
        nums1[0] = 3;
        nums1[1] = 5;
        nums1[2] = 7;
        nums1[3] = 11;
        nums1[4] = 23;
        int[] nums2 = {1,4,9,10};
        nums1 = merge(nums1,5,nums2,4);
        printArray(nums1);
    }
}
