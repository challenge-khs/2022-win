import java.util.*;

public class Implement_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		sc.nextLine();
		String[] input = sc.nextLine().split(" ");
		
		int   dx[] = { 0 ,  0 , -1 ,  1 };
		int   dy[] = { -1,  1 ,  0 ,  0 };
		String d[] = {"L", "R", "U", "D"};
		
		int x = 1;
		int y = 1;
		
		/*
		for(int i = 0; i < input.length; i++) {
			System.out.println(input[i]);
		}
		*/
		
		for(int i = 0; i < input.length; i++) {
			int nx = -1;
			int ny = -1;
			for(int j = 0; j < 4; j++) {
				if(input[i].equals(d[j])) {
					nx = x + dx[j];
					ny = y + dy[j];
				}
			}
			if(nx < 1 || ny < 1 || nx > n || ny > n)
				continue;
			x = nx;
			y = ny;
		}
		
		System.out.println(x + " " + y);
	}

}
