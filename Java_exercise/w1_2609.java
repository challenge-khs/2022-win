import java.util.*;

public class w1_2609 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a, b, t, gcd = 1, lcm;
		Scanner sc = new Scanner(System.in);
		
		a = sc.nextInt();
		b = sc.nextInt();
		
		if(a > b) {
			t = b;
			b = a;
			a = t;
		}
		for(int i = 1; i <= b; i++) {
			if(a % i == 0 && b % i == 0) {
				gcd = i;
			}
		}
		lcm = (a * b) / gcd;
		
		System.out.println(gcd + "\n" + lcm);
	}
}
