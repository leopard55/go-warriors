package javabase.deng;

public class MajorityElement {

    public static int majorityElement(int[] nums){
        int[] stack = new int[nums.length];
        int top = -1;
        for (int i = 0; i < nums.length; i++) {
            if(top == -1){
                stack[++top] = nums[i];
            }else if(stack[top] == nums[i]){
                stack[++top] = nums[i];
            }else{
                top--;
            }
        }
        return stack[0];
    }

    public static int majorityElement1(int[] nums){
        int cand = 0;
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if(count == 0){
                cand = nums[i];
                count++;
            }else if(cand == nums[i]){
                count++;
            }else{
                count--;
            }
        }
        return cand;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,1,2,3,4,5,2,3,3,3,1};
        System.out.println(majorityElement1(nums));
    }
}
