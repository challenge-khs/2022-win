import java.util.*;

class Node1 {
	int x;
	int y;
	
	public Node1(int x, int y)
	{
		this.x = x;
		this.y = y;
	}
}

public class DFS_BFS_11 {

	public static int n, m, count;
	public static int map[][] = new int[201][201];
	public static int dx[] = {-1, 1, 0, 0};
	public static int dy[] = {0, 0, -1, 1};
	
	public static void bfs(int x, int y) {
		Queue<Node1> q = new LinkedList<>();
		q.offer(new Node1(x, y));
		map[x][y] = 0;
		count = 1;
		
		while(!q.isEmpty()){
			Node1 temp = q.poll();
			x = temp.x;
			y = temp.y;
			map[x][y] = 0;
			//System.out.println(x + " " +y);
			for(int i = 0; i < 4; i++) {
				int nx = x + dx[i];
				int ny = y + dy[i];
				if(nx < 0 || nx >= n || ny < 0 || ny >= m)
					continue;
				if(map[nx][ny] == 1 && (nx > x || ny > y)) {
					System.out.println(nx + " " + ny);
					count ++;
					q.offer(new Node1(nx, ny));
				}
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		sc.nextLine();

		for(int i = 0; i < n; i++) {
			String input = sc.nextLine();
			for(int j = 0; j < m; j++) {
				map[i][j] = input.charAt(j) - '0';
			}
		}
		bfs(0, 0);
		System.out.println(count);
	}

}
