import java.util.*;

public class DP_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int arr[] = new int[n];
		int d[] = new int[n];
		
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		d[0] = arr[0];
		d[1] = Math.max(arr[0], arr[1]);
		
		for(int i = 2; i < n; i++) {
			d[i] = Math.max(d[i-1], d[i-2] + arr[i]);
		}
		
		System.out.println(d[n-1]);
	}

}
