package javabase.deng;

public class SingleNumber {

    public static int countLetter(int[] arr, int n, int k){
        int c = 0;
        for (int i = 0; i < n; i++) {
            if(arr[i] == k){
                c++;
            }
        }
        return c;
    }

    public static int singleNumber(int[] nums, int numsSize){
        for (int i = 0; i < numsSize; i++) {
            int count = countLetter(nums,numsSize,nums[i]);
            if(count == 1){
                return nums[i];
            }
        }
        return -1;
    }

    public static int singleNumber1(int[] nums, int numsSize){
        int k = nums[0];
        for (int i = 1; i < numsSize; i++) {
            k = (k ^ nums[i]);
        }
        return k;
    }

    public static void main(String[] args) {
        int[] arr = {2,2,3,5,6,6,5};
        int k = singleNumber1(arr, arr.length);
        System.out.println(k);
    }
}
