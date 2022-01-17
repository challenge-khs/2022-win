package greedy;

public class Greedy_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 1260;
		int count = 0;
		
		int[] coin_types = {500, 100, 50, 10};
		
		for(int coin : coin_types){
			count += n / coin;
			n %= coin;
		}
		
		System.out.println(count);
	}

}
