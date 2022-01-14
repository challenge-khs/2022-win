import java.util.*;

public class w1_1929 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m, n;
		int num[] = new int[1000001];
		Scanner sc = new Scanner(System.in);
		
		m = sc.nextInt();
		n = sc.nextInt();
		num[1] = 1;
		
		for(int i = 2; i <= n; i++) {
			if(num[i] == 0) {
				for(int j = 2; n >= i * j; j++) {
					num[i * j] = 1;
				}
			}
		}
		for(int i = m; i <= n; i++) {
			if(num[i] == 0)
				System.out.println(i);
		}
	}
}
