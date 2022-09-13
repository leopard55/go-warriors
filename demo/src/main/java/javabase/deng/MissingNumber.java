package javabase.deng;

public class MissingNumber {

    public static int missingNumber(int[] nums, int numsSize){
        boolean[] arr = new boolean[numsSize+1];
        for (int i = 0; i < numsSize+1; i++) {
            arr[i] = false;
        }
        for (int i = 0; i < numsSize; i++) {
            int id = nums[i];
            arr[id] = true;
        }
        for (int i = 0; i < numsSize + 1; i++) {
            if(arr[i] == false){
                return i;
            }
        }
        return 0;
    }

    public static int missingNumber1(int[] nums, int numsSize){
        int sum = numsSize * (numsSize + 1) / 2;
        for (int i = 0; i < numsSize; i++) {
            sum = sum - nums[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] arr = {0,1,3,4};
        System.out.println(missingNumber1(arr,4));

    }
}
