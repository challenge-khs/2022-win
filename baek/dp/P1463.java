import java.util.Scanner;

public class P1463 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int count[] = new int[1000001];

        count[1] = 0;
        for (int i = 2; i <= x; i++) {
            count[i] = count[i-1] + 1;
            if(i % 2 == 0)
                count[i] = Math.min(count[i], count[i / 2] + 1);
            if(i % 3 == 0)
                count[i] = Math.min(count[i], count[i / 3] + 1);

        }
        System.out.println(count[x]);
    }
}
