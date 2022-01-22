import java.util.*;

public class Implement_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		
		int y = input.charAt(1) - '1' + 1;
		int x = input.charAt(0) - 'a' + 1;
		int cnt = 0;
		
		//System.out.println(n + " " + m);
		
		int dx[] = {-2, -1, 1, 2, -2, -1, 1, 2};
		int dy[] = {-1, -2, -2, -1, 1, 2, 2, 1};
		
		for(int i = 0; i < 8; i++) {
			int nx = x + dx[i];
			int ny = y + dy[i];
			if(nx > 0 && ny > 0 && nx <= 8 && ny <= 8)
				cnt ++;
		}
		System.out.println(cnt);
	}

}
