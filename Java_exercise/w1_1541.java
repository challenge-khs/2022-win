import java.util.*;

public class w1_1541 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] str;
		int answer;
		Scanner sc = new Scanner(System.in);
		
		answer = Integer.MAX_VALUE;
		str = sc.next().split("-");
		
		for(int i = 0; i < str.length; i++) {
			int temp = 0;
			String cal[] = str[i].split("\\+");
			
			for(int j = 0; j < cal.length; j++) {
				temp += Integer.parseInt(cal[j]);
			}
			if(answer == Integer.MAX_VALUE)
				answer = temp;
			else
				answer -= temp;
		}
		System.out.println(answer);
	}

}
