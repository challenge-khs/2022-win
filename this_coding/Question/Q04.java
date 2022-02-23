import java.util.Arrays;
import java.util.Scanner;

public class Q04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int target = 1;
        int[] coin = new int[n];

        for(int i = 0; i < n; i++) {
            coin[i] = sc.nextInt();
        }

        Arrays.sort(coin);

        for(int i = 0; i < n; i++) {
            if(target < coin[i])
                break;
            target += coin[i];
        }
        System.out.println(target);
    }
}
