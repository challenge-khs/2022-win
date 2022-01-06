import java.util.*;

public class w1_2 {

	static public class Member {
		char s;
		int a;
		int b;
		Member(char s, int a, int b) {
			this.s = s;
			this.a = a;
			this.b = b;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num, i;
		int male[] = new int[366];
		int female[] = new int[366];
		int day[] = new int[366];
		
		Scanner sc = new Scanner(System.in);
		
		num = sc.nextInt();
		
		Member[] list = new Member[num];
		
		for(i = 0; i < num; i++){
			char s = sc.next().charAt(0);
			int a = sc.nextInt();
			int b = sc.nextInt();
			list[i] = new Member(s, a, b);
		}
		
		for(i = 0; i < num; i++){
			for(int j = list[i].a-1; j<list[i].b; j++) {
				if(list[i].s == 'M'){
					male[j]++;
					if(male[j] < female[j])
						day[j] = male[j];
					else
						day[j] = female[j];
				}
				else {
					female[j]++;
					if(male[j] < female[j])
						day[j] = male[j];
					else
						day[j] = female[j];
				}
			}
		}
		
		int max = 0;
		for(i = 0; i < 366; i++){
			if(max < day[i])
				max = day[i];
		}
		System.out.println();
		System.out.println(max*2);
	}
}
