import java.util.*;

public class Q07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String input;
		String sub1, sub2;
		int v1, v2, cnt1 = 0, cnt2 = 0;
		
		input = sc.next();
		
		sub1 = input.substring(0, (input.length() / 2));
		sub2 = input.substring((input.length() / 2), input.length());
		
		v1 = Integer.parseInt(sub1);
		v2 = Integer.parseInt(sub2);
		
		while(v1 >= 1) {
			cnt1 += (v1 % 10);
			v1 /= 10;
		}
		while(v2 >= 1) {
			cnt2 += (v2 % 10);
			v2 /= 10;
		}
		
		if(cnt1 == cnt2)
			System.out.println("LUCKY");
		else
			System.out.println("READY");
	}

}
