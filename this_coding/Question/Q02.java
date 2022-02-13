import java.util.*;

public class Q02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Integer> arr = new ArrayList<>();
		String input;
		int len;
		int result;
		
		input = sc.nextLine();
		len = input.length();
		
		for(int i = 0; i < len; i++) {
			arr.add(Character.getNumericValue(input.charAt(i)));
		}
		
		result = arr.get(0);
		
		for(int i = 1; i < len; i++) {
			if(arr.get(i) <= 1 || result <= 1) {
				result += arr.get(i);
			}
			else
				result *= arr.get(i);
		}
		
		System.out.println(result);
	}

}
