import java.util.*;

public class Q24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ArrayList<Integer> arr = new ArrayList<>();
		
		for(int i = 0; i < n; i++) {
			int temp = sc.nextInt();
			arr.add(temp);
		}
		
		Collections.sort(arr);
		
		System.out.println(arr.get((n-1)/2));
	}

}
