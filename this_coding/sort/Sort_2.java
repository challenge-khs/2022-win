//swap
public class Sort_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {3, 5};
		int temp  = arr[0];
		arr[0] = arr[1];
		arr[1] = temp;
		
		System.out.println(arr[0] + " " + arr[1]);
	}

}
