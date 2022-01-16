import java.util.*;

public class w2_1193 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x, i;
		Scanner sc = new Scanner(System.in);
		
		x = sc.nextInt();
		
		for(i = 1; x > 0; i++) {
			x = x - i;
		}
		
		if(i%2 == 0)
			System.out.println((1 - x) + "/" + (i + x - 1));
		else
			System.out.println((i + x - 1) + "/" + (1 - x));
			
	}

}
