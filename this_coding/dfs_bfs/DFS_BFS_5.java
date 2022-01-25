public class DFS_BFS_5 {

	public static int factorial_iter(int n) {
		int result = 1;
		for(int i = 1; i <= n; i++) {
			result *= i;
		}
		return result;
	}
	
	public static int factorial_recur(int n) {
		if(n <= 1)
			return 1;
		return n * factorial_recur(n-1);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("반복 iter: " + factorial_iter(5));
		System.out.println("재귀 recur: " + factorial_recur(5));
		
	}

}
