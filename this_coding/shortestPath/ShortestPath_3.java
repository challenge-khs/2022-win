import java.util.*;

public class ShortestPath_3 {

	public static final int INF = (int) 1e9;
	public static int n, m;
	public static int[][] graph = new int[501][501];
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt();
		m = sc.nextInt();
		
		for(int i = 0; i < 501; i++) {
			Arrays.fill(graph[i], INF);
		}
		
		for(int a = 1; a <= n; a++){
			for(int b = 1; b <= n; b++) {
				if(a == b)
					graph[a][b] = 0;
			}
		}
		
		for(int i = 0; i < m; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			graph[a][b] = c;
		}
		
		for(int k = 1; k <= n; k++) {
			for(int a = 1; a <= n; a++) {
				for(int b = 1; b <= n; b++) {
					graph[a][b] = Math.min(graph[a][b], graph[a][k] + graph[k][b]);
				}
			}
		}
		
		for(int a = 1; a <= n; a++) {
			for(int b = 1; b <= n; b++) {
				if(graph[a][b] == INF)
					System.out.print("INFINITY ");
				else
					System.out.print(graph[a][b] + " ");
			}
			System.out.println();
		}
	}

}

/*
4
7
1 2 4
1 4 6
2 1 3
2 3 7
3 1 5
3 4 4
4 3 2
*/
