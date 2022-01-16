import java.util.*;

public class w2_11399 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Vector<Integer> p = new Vector<>();
		int n, cnt = 0, temp = 0;
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt();
		
		for(int i = 0; i < n; i++) {
			int t;
			t = sc.nextInt();
			p.add(t);
		}
		
		Collections.sort(p);
		
		for(int i = 0; i < n; i++) {
			temp = temp + p.get(i);
			cnt = cnt + temp;
		}
		System.out.println(cnt);
	}
}
