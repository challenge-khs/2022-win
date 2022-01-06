import java.util.*;

public class w1_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n;
		int t1 = 0, t2 = 0, t3 = 0;
		int arr[] = new int[100];
		Scanner sc = new Scanner(System.in);

		n = sc.nextInt();
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		for(int i = 0; i < n - 1; i++) {
			if(i == 0) {
				while(arr[i] != 0){
					t1 += arr[i] % 10;
					arr[i] /= 10;
				}
			}
			t3 = 0;
			if(t1 >= 10){
				while(t1 != 0) {
					t3 += t1 % 10;
					t1 /= 10;
				}
				t1 = t3;
			}
			t2 = 0;
			while(arr[i+1] != 0) {
				t2 += arr[i+1] % 10;
				arr[i+1] /= 10;
			}
			t1 = t1 + t2;
		}
		System.out.println(t1);
	}

}
