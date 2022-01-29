import java.util.*;

public class Search_5 {

	public static int binarySearch(int[] arr, int target, int start, int end) {
		if(start > end)
			return -1;
		int mid = (start + end) / 2;
		if(arr[mid] == target)
			return mid;
		else if(arr[mid] > target)
			return binarySearch(arr, target, start, mid - 1);
		else
			return binarySearch(arr, target, mid + 1, end);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		for(int i = 0; i < n; i++)
			a[i] = sc.nextInt();
		
		Arrays.sort(a); // 정렬 필수
		
		int m = sc.nextInt();
		int b[] = new int[m];
		for(int i = 0; i < m; i++)
			b[i] = sc.nextInt();
		
		for(int i = 0; i < m; i++) {
			int result = binarySearch(a, b[i], 0, n - 1);
			if(result == -1)
				System.out.print("no ");
			else
				System.out.print("yes ");
		}
	}

}
