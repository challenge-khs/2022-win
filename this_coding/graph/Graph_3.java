// cycle 
import java.util.Scanner;

public class Graph_3 {
	public static int v, e;
	public static int[] parent = new int[100001];
	
	public static int findParent(int x) {
		if(x == parent[x])
			return x;
		return parent[x] = findParent(parent[x]);
	}
	
	public static void unionParent(int a, int b) {
		a = findParent(a);
		b = findParent(b);
		if(a < b) parent[b] = a;
		else parent[a] = b;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		boolean cycle = false;
		v = sc.nextInt();
		e = sc.nextInt();
		
		for(int i = 1; i <= v; i++) {
			parent[i] = i;
		}
		
		for(int i = 0; i < e; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			if(findParent(a) == findParent(b)) {
				cycle = true;
				break;
			}
			else
				unionParent(a, b);
		}
		
		if(cycle) {
			System.out.println("사이클 발생");
		}
		else {
			System.out.println("사이클 발생X");
		}
	}

}
