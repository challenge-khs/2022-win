// selection sort
public class Sort_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {7,5,9,0,3,1,6,2,4,8};
		
		for(int i = 0; i < arr.length; i++) {
			int min_index = i;
			for(int j = i+1; j < arr.length; j++) {
				if(arr[min_index] > arr[j])
					min_index = j;
			}
			int temp = arr[i];
			arr[i] = arr[min_index];
			arr[min_index] = temp;
		}
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
