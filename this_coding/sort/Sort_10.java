import java.util.*;

public class Sort_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		int arr[];
		
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt();
		arr = new int[n];
		
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		Arrays.sort(arr);
		
		for(int i = n - 1; i >= 0; i--) {
			System.out.print(arr[i] + " ");
		}
	}
