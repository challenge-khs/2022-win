import java.util.*;

public class DP_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int[] d = new int[30001];
		int n = sc.nextInt();

		for(int i = 2; i <= n; i++) {
			d[i] = d[i-1] + 1;
			if(i % 2 == 0)
				d[i] = Math.min(d[i], d[i/2] + 1);
			if(i % 3 == 0)
				d[i] = Math.min(d[i], d[i/3] + 1);
			if(i % 5 == 0)
				d[i] = Math.min(d[i], d[i/5] + 1);
		}
		System.out.println(d[n]);
	}

}
