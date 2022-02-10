import java.util.*;

public class Graph_6 {

	public static int n, m;
	public static int[] parent = new int[100001];
	
	public static int findParent(int x) {
		if(x == parent[x])
			return x;
		return parent[x] = findParent(parent[x]);
	}
	
	public static void unionParent(int a, int b) {
		a = findParent(a);
		b = findParent(b);
		if(a < b)
			parent[b] = a;
		else
			parent[a] = b;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt();
		m = sc.nextInt();
		
		for(int i = 0; i < m; i++) {
			parent[i] = i;
		}
		
		for(int i = 0; i < m; i++) {
			int op = sc.nextInt();
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			if(op == 0) {
				unionParent(a, b);
			}
			else if(op == 1) {
				if(findParent(a) == findParent(b)) {
					System.out.println("YES");
				}
				else {
					System.out.println("No");
				}
					
			}
		}

	}

}

/*7 8
0 1 3
1 1 7
0 7 6
1 7 1
0 3 7
0 4 2
0 1 1
1 1 1
*/
