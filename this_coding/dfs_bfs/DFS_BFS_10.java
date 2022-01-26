import java.util.*;

public class DFS_BFS_10 {

	public static int n, m, cnt;
	public static int map[][] = new int[1000][1000];
	
	public static void dfs(int x, int y) {
		if (x <= -1 || x >= n || y <= -1 || y >= m)
			return;
		
		if (map[x][y] == 0) {
			map[x][y] = 1; 
			dfs(x-1,y);
			dfs(x,y-1);
			dfs(x+1,y);
			dfs(x,y+1);
			return;
		}
		return;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		cnt = 0;
		n = sc.nextInt();
		m = sc.nextInt();
		sc.nextLine();
		
		for(int i = 0; i < n; i++) {
			String input = sc.nextLine();
			for(int j = 0; j < m; j++) {
				map[i][j] = input.charAt(j) - '0';
			}
		}
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
				if(map[i][j] == 0) {
					dfs(i, j);
					cnt++;
				}
			}
		}
		
		System.out.println(cnt);
	}
}
