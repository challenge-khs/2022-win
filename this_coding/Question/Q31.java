import java.util.*;

public class Q31 {

	public static int t, n, m;
	public static int[][] map = new int[20][20];
	public static int[][] dp = new int[20][20];
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		t = sc.nextInt();
		
		while(t > 0) {
			n = sc.nextInt();
			m = sc.nextInt();
			
			for(int i = 0; i < n; i++) {
				for(int j = 0; j < m; j++) {
					map[i][j] = sc.nextInt();
					dp[i][j] = map[i][j];
				}
			}
			
			for(int j = 1; j < m; j++) {
				for(int i = 0; i < n; i++) {
					int leftUp, leftDown, left;
					if(i == 0)
						leftUp = 0;
					else
						leftUp = dp[i-1][j-1];
					if(i == n - 1)
						leftDown = 0;
					else
						leftDown = dp[i+1][j-1];
					left = dp[i][j-1];
					dp[i][j] = dp[i][j] + Math.max(leftUp, Math.max(leftDown, left));
				}
			}
			int result = 0;
			for(int i = 0; i < n; i++) {
				result = Math.max(result, dp[i][m-1]);
			}
			System.out.println(result);
			t--;
		}
	}

}
/*
2
3 4
1 3 3 2 2 1 4 1 0 6 4 7
4 4
1 3 1 5 2 2 4 1 5 0 2 3 0 6 1 2
*/
