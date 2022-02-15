import java.util.*;

public class Q08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String input = sc.next();
		String output = "";
		ArrayList<Character> t = new ArrayList<>();
		int sum = 0;
		
		for(int i = 0; i < input.length(); i++) {
			char c = input.charAt(i);
			if(c >= '0' && c <= '9')
				sum += (int)(c - '0');
			else
				t.add(c);
		}
		
		Collections.sort(t);
		
		for(int i = 0; i < t.size(); i++) {
			output += t.get(i);
		}
		
		System.out.println(output+sum);
	}

}
