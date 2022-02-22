import java.util.*;

public class Q41 {
	
	public static int n, m;
	public static int[] parent = new int[501];
	public static int[] plan = new int[501];
	
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
		boolean result = true;
		
		n = sc.nextInt();
		m = sc.nextInt();
		
		for(int i = 1; i <= n; i++) {
			parent[i] = i;
		}
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				int x = sc.nextInt();
				if(x == 1)
					unionParent(i + 1, j + 1);
			}
		}
		
		for(int i = 0; i < m; i++) {
			plan[i] = sc.nextInt();
		}
		
		for(int i = 1; i < m; i++) {
			if(findParent(plan[i-1]) != findParent(plan[i])) {
				result = false;
				break;
			}
		}
		
		if(result)
			System.out.println("YES");
		else
			System.out.println("NO");
	}

}
