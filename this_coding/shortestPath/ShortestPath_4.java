import java.util.*;

public class ShortestPath_4 {

	public static final int INF = (int)1e9;
	public static int n, m, x, k;
	public static int[][] graph = new int[101][101];
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		
		for(int i = 0; i < 101; i++) {
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
			graph[a][b] = 1;
			graph[b][a] = 1;
		}
		
		x = sc.nextInt();
		k = sc.nextInt();
		
		for(int t = 1; t <= n; t++) {
			for(int a = 1; a <= n; a++) {
				for(int b = 1; b <= n; b++) {
					graph[a][b] = Math.min(graph[a][b], graph[a][t] + graph[t][b]);
				}
			}
		}
		
		int distance = graph[1][k] + graph[k][x];
		
		if(distance >= INF) 
			System.out.println(-1);
		else
			System.out.println(distance);
		}

}
/*
5 7
1 2
1 3
1 4
2 4
3 4
3 5
4 5
4 5
*/
