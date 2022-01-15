import java.util.*;

public class w1_4949 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input;
		int flag = 0, size;
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			Stack<Character> s = new Stack<>();
			input = sc.nextLine();
			
			if(input == ".")
				break;
			
			size = input.length();
			for(int i = 0; i < size; i++) {
				flag = 0;
				if(input.charAt(i) == '[' || input.charAt(i) == '(') {
					s.push(input.charAt(i));
				} 
				else if(input.charAt(i) == ')') {
					if(!s.empty() && s.peek() == '(') {
						s.pop();
					}
					else {
						flag = 1;
						break;
					}
				} 
				else if(input.charAt(i) == ']') {
					if(!s.empty() && s.peek() == '[') {
						s.pop();
					}
					else {
						flag = 1;
						break;
					}
				}
			}
			if(flag == 0 && s.empty())
				System.out.println("yes");
			else
				System.out.println("no");
		}

	}

}
