package greedy;

import java.util.*;

public class Greedy_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n, k, count = 0;
		
		
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt();
		k = sc.nextInt();
		
		while(true) {
			if (n == 1) 
				break;
			if(n % k == 0) 
				n /= k;
			else 
				n--;
			count++;
		}
		System.out.println(count);
	}

}
