package javabase.han.sort;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

public class QuickSort {

	public static void main(String[] args) {
		int[] arr = {-9,78,0,23,-567,70, -1,900, 4561};

		//测试快排的执行速度 .创建要给80000个的随机的数组
//		int[] arr = new int[8000000];
//		for (int i = 0; i < 8000000; i++) {
//			arr[i] = (int) (Math.random() * 8000000); // 生成一个[0, 8000000) 数
//		}


		Date data1 = new Date();  //Mon Aug 12 10:56:32 CST 2019
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String date1Str = simpleDateFormat.format(data1);
		System.out.println("排序前的时间是=" + date1Str);
		System.out.println("arr=" + Arrays.toString(arr));

		quickSort(arr, 0, arr.length-1);

		Date data2 = new Date();
		String date2Str = simpleDateFormat.format(data2);
		System.out.println("排序前的时间是=" + date2Str);
		System.out.println("arr=" + Arrays.toString(arr));
	}

	public static void quickSort(int[] arr,int l, int r) {
		if (l < r) {
			int i,j,temp;

			i = l;
			j = r;
			temp = arr[i];
			while (i < j) {
				while(i < j && arr[j] > temp)
					j--; // 从右向左找第一个小于x的数
				if(i < j)
					arr[i++] = arr[j];
				while(i < j && arr[i] < temp)
					i++; // 从左向右找第一个大于x的数
				if(i < j)
					arr[j--] = arr[i];
			}
			arr[i] = temp;
			quickSort(arr, l, i-1); /* 递归调用 */
			quickSort(arr, i+1, r); /* 递归调用 */
		}
	}
}
