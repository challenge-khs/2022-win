import java.util.*;

public class Q15 {
	public static int n, m, k, x;
	public static ArrayList<ArrayList<Integer>> graph = new ArrayList<ArrayList<Integer>>();
	public static int[] d = new int[300001];
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		boolean flag = false;
		
		n = sc.nextInt();
		m = sc.nextInt();
		k = sc.nextInt();
		x = sc.nextInt();
		
		for(int i = 0; i <= n; i++) {
			graph.add(new ArrayList<Integer>());
			d[i] = -1;
		}
		
		for(int i = 0; i < m; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			graph.get(a).add(b);
		}
		
		d[x] = 0; // 시작점의 거리는 0
		
		Queue<Integer> q = new LinkedList<Integer>();
		q.offer(x);
		while(!q.isEmpty()) {
			int now = q.poll();
			for(int i = 0; i < graph.get(now).size(); i++) {
				int next = graph.get(now).get(i);
				if(d[next] == -1) {
					q.offer(next);
					d[next] = d[now] + 1;
				}
			}
		}
		
		for(int i = 1; i <= n; i++) {
			if(d[i] == k) {
				System.out.println(i);
				flag = true;
			}
		}
		if(!flag)
			System.out.println(-1);
	}
}
