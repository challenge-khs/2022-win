import java.util.*;

public class w1_1717 {
	public static int arr[] = new int[1000001];
	public static int n, m, o, a, b;
	
	public static int find(int i) {
		if(arr[i] == i)
			return i;
		else
			return arr[i] = find(arr[i]);
	}
	
	public static void uni(int f, int s) {
		int firstParent = find(f);
		int secondParent = find(s);
		if (firstParent != secondParent)
			arr[firstParent] = secondParent;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		
		for(int i = 0; i <= n; i++) {
			arr[i] = i;
		}
		
		for(int i = 0; i < m; i++) {
			o = sc.nextInt();
			a = sc.nextInt();
			b = sc.nextInt();
			if(o == 0)
				uni(a,b);
			else {
				if(find(a) == find(b))
					System.out.println("YES");
				else
					System.out.println("NO");
			}
		}
	}

}
