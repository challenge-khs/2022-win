package greedy;

import java.util.*;

public class Greedy_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n, k, m, result = 0;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		k = sc.nextInt();
		
		ArrayList<Integer> arr = new ArrayList<Integer>();
		
		for(int i = 0; i < n; i++) {
			int temp = sc.nextInt();
			arr.add(temp);
		}
		
		Collections.sort(arr, Collections.reverseOrder());
		
		/*for(int i = 0; i < n; i++) {
			System.out.println(arr.get(i));
		}*/
		
		int first = arr.get(0);
		int second = arr.get(1);
		
		for(int i = 1; i <= m; i++) {
			if(k % i == 0) {
				result += second;
				i++;
			}
			result += first;
		}
		System.out.println(result);
	}

}
