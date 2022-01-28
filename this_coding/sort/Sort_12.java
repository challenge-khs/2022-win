import java.util.*;

public class Sort_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n, k, sum;
		int a[], b[];
		
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt();
		k = sc.nextInt();
		sum = 0;
		
		a = new int[n];
		b = new int[n];
		
		for(int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		for(int i = 0; i < n; i++) {
			b[i] = sc.nextInt();
		}
		
		Arrays.sort(a);
		Arrays.sort(b);

		for(int i = 0; i < k; i++) {
			int temp = a[i];
			a[i] = b[n-1-i];
			b[n-1-i] = temp;
		}

		for(int i = 0; i < n; i++) {
			sum += a[i];
		}
		
		System.out.println(sum);
	}

}
