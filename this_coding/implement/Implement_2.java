import java.util.*;

public class Implement_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int cnt = 0;
		
		for(int i = 0; i <= n; i++) {
			for(int j = 0; j < 60; j++) {
				for(int k = 0; k < 60; k++) {
					if(i % 10 == 3 || j % 10 == 3 || k % 10 == 3 || j / 10 == 3 || k / 10 == 3) {
						cnt++;
					}
				}
			}
		}
		System.out.println(cnt);
	}

}
