import java.util.*;

public class Q32 {
	public static int n;
	public static int[][] arr = new int[500][500];
	public static int[][] dp = new int[501][501];
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt();
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < i + 1; j++) {
				arr[i][j] = sc.nextInt();
				dp[i][j] = arr[i][j];
			}
		}
		
		for(int i = n - 2; i >= 0; i--) {
			for(int j = 0; j < i + 1; j++) {
				dp[i][j] = dp[i][j] + Math.max(dp[i+1][j], dp[i+1][j+1]);
			}
		}
		
		System.out.println(dp[0][0]);
	}

}

/*
5
7
3 8
8 1 0
2 7 4 4
4 5 2 6 5
*/
