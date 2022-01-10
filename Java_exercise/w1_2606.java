import java.util.*;

public class w1_2606 {

	public static int n, m, a, b;
	public static int arr[][] = new int[101][101];
	public static int visit[] = new int[101];
	public static int cnt = 0;
	
	public static void dfs(int now) {
		visit[now] = 1;
		cnt ++;
		for(int i = 1; i <= n; i++) {
			if(arr[now][i] == 1 && visit[i] == 0) {
				dfs(i);
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt();
		m = sc.nextInt();
		
		for(int i = 0; i < m; i++) {
			a = sc.nextInt();
			b = sc.nextInt();
			arr[a][b] = 1;
			arr[b][a] = 1;
		}
		dfs(1);
		System.out.println(cnt-1);
	}
}
