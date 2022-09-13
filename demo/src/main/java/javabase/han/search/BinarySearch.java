package javabase.han.search;


import java.util.ArrayList;
import java.util.List;

//注意：使用二分查找的前提是 该数组是有序的.
public class BinarySearch {
    public static int halfSearch(int[]  arr, int key){
        int l, r, mid;
        l= 0;
        r= arr.length - 1;
        mid = (l+ r) >> 1;
        while(arr[mid] != key){
            if(l > r){
                return -1;
            }
            if(arr[mid] > key){
                r= mid - 1;
            }
            if(arr[mid] < key){
                l= mid + 1;
            }
            mid = (l+ r) >> 1;
        }
        return mid;
    }

    public static int binarySearch(int[] arr, int l, int r, int key) {
        // 当 left > right 时，说明递归整个数组，但是没有找到
        if (l> r) {
            return -1;
        }
        int mid = (l+ r) / 2;
        int midVal = arr[mid];

        if (key > midVal) { // 向 右递归
            return binarySearch(arr, mid + 1, r, key);
        } else if (key< midVal) { // 向左递归
            return binarySearch(arr, l, mid - 1, key);
        } else {
            return mid;
        }
    }

    public static void main(String[] args) {
        //非递归
        int[] arr1 = {1,2,3,4,5};
        int key = 9;
        int result = halfSearch(arr1, key);
        System.out.println("result: " + result);

        //递归
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 , 11, 12, 13,14,15,16,17,18,19,20 };
        int resIndex = binarySearch(arr, 0, arr.length - 1, 1000);
        System.out.println("resIndex=" + resIndex);

        //重复值
        List<Integer> resIndexList = binarySearch2(arr, 0, arr.length - 1, 1);
        System.out.println("resIndexList=" + resIndexList);
    }


    //完成一个课后思考题:
    /*
     * 课后思考题： {1,8, 10, 89, 1000, 1000，1234} 当一个有序数组中，
     * 有多个相同的数值时，如何将所有的数值都查找到，比如这里的 1000
     *
     * 思路分析
     * 1. 在找到mid 索引值，不要马上返回
     * 2. 向mid 索引值的左边扫描，将所有满足 1000， 的元素的下标，加入到集合ArrayList
     * 3. 向mid 索引值的右边扫描，将所有满足 1000， 的元素的下标，加入到集合ArrayList
     * 4. 将Arraylist返回
     */

    public static List<Integer> binarySearch2(int[] arr, int l, int r, int key) {
        // 当 left > right 时，说明递归整个数组，但是没有找到
        if (l > r) {
            return new ArrayList<Integer>();
        }
        int mid = (l + r) / 2;
        int midVal = arr[mid];

        if (key > midVal) { // 向右递归
            return binarySearch2(arr, mid + 1, r, key );
        } else if (key < midVal) { // 向左递归
            return binarySearch2(arr, l, mid - 1, key );
        } else {
            List<Integer> resIndexlist = new ArrayList<Integer>();
            //向mid 索引值的左边扫描，将所有满足 1000， 的元素的下标，加入到集合ArrayList
            int temp = mid - 1;
            while(true) {
                if (temp < 0 || arr[temp] != key ) {//退出
                    break;
                }
                //否则，就temp 放入到 resIndexlist
                resIndexlist.add(temp);
                temp -= 1; //temp左移
            }
            resIndexlist.add(mid);  //

            //向mid 索引值的右边扫描，将所有满足 1000， 的元素的下标，加入到集合ArrayList
            temp = mid + 1;
            while(true) {
                if (temp > arr.length - 1 || arr[temp] != key ) {//退出
                    break;
                }
                //否则，就temp 放入到 resIndexlist
                resIndexlist.add(temp);
                temp += 1; //temp右移
            }

            return resIndexlist;
        }

    }
}


