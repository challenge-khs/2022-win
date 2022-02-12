import java.util.*;

public class Q01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n, result = 0, count = 0;
		ArrayList<Integer> arr = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt();
		for(int i = 0; i < n; i++) {
			int temp = sc.nextInt();
			arr.add(temp);
		}
		
		Collections.sort(arr);
		
		for(int i = 0; i < n; i++) {
			count++;
			if(count >= arr.get(i)) {
				result++;
				count = 0;
			}
		}
		
		System.out.println(result);
	}

}
