//quick sort
import java.util.*;

public class Sort_4 {

	public static void quickSort(int[] arr, int start, int end) {
		if(start >= end)
			return;
		int pivot = start;
		int left = start + 1;
		int right = end;
		while (left <= right) {
			while(left <= end && arr[left] <= arr[pivot])
				left++;
			while(right > start && arr[right] >= arr[pivot])
				right--;
			if(left > right) {
				int temp = arr[right];
				arr[right] = arr[pivot];
				arr[pivot] = temp;
			}
			else {
				int temp = arr[left];
				arr[left] = arr[right];
				arr[right] = temp;
			}
		}
		quickSort(arr, start, right - 1);
		quickSort(arr, right + 1, end);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {5,7,9,0,3,1,6,2,4,8};
		
		quickSort(arr, 0, arr.length-1);
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
