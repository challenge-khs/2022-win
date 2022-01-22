package implement;

import java.util.*;

public class Implement_4 {
	public static int n, m, a, b, d;
	
	public static void turn() {
		if (d == 0)
			d = 3;
		else 
			d--;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt();
		m = sc.nextInt();
		a = sc.nextInt();
		b = sc.nextInt();
		d = sc.nextInt();
		
		int map[][]   = new int[n][m];
		int visit[][] = new int[n][m];
		int cnt = 1;
		int turn_cnt = 0;
		
		visit[a][b] = 1;
		
		int dx[] = {-1, 0, 1, 0};
		int dy[] = {0, 1, 0, -1};
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
				map[i][j] = sc.nextInt();
			}
		}
		
		while (true) {
			turn();
			int nx = a + dx[d];
			int ny = b + dy[d];
			
			if(map[nx][ny] == 0 && visit[nx][ny] == 0) {
				visit[nx][ny] = 1;
				a = nx;
				b = ny;
				cnt++;
				turn_cnt = 0;
				continue;
			}
			else
				turn_cnt++;
			if(turn_cnt == 4) {
				nx = a - dx[d];
				ny = b - dy[d];
				if(map[nx][ny] == 0) {
					a = nx;
					b = ny;
					turn_cnt = 0;
				}
				else
					break;
			}
			
		}
		
		
		System.out.println(cnt);
	}
}
