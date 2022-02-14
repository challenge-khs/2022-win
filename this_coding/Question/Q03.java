import java.util.*;

public class Q03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String input;
		int count0 = 0;	// 0으로 바꾸는 경우
		int count1 = 0; // 1로 바꾸는 경우
		int answer = 0;
		
		input = sc.next();

		if(input.charAt(0) == '0') // 0으로 시작 (0에서 1로 바꾸기 때문에 count1 증가)
			count1 ++;
		else if(input.charAt(0) == '1') // 1로 시작 (1에서 0로 바꾸기 때문에 count0 증가)
			count0 ++;
		
		for(int i = 0; i < input.length() - 1; i++) {
			if(input.charAt(i) != input.charAt(i + 1)) {	// 뒤의 글자가 바뀐다면
				if(input.charAt(i + 1) == '1')
					count0 ++;
				else if(input.charAt(i + 1) == '0')
					count1 ++;
			}
		}
		
		answer = Math.min(count0, count1);
		System.out.println(answer);
	}

}
