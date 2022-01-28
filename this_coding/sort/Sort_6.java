public class Sort_6 {

	public static final int MAX_VALUE = 9;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {7,5,9,0,3,1,6,2,9,1,4,8,0,5,2};
		int[] count = new int[MAX_VALUE + 1];
		
		for(int i = 0; i < arr.length; i++) {
			count[arr[i]] ++;
		}
		for(int i = 0; i <= MAX_VALUE; i++) {
			for(int j = 0; j < count[i]; j++) {
				System.out.print(i + " ");
			}
		}
	}

}
