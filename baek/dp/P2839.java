import java.util.Scanner;

public class P2839 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        boolean flag = true;

        while(n >= 0) {
            if(n % 5 == 0) {
                count += n / 5;
                flag = false;
                break;
            }
            n -= 3;
            count++;
        }
        if(flag)
            System.out.println("-1");
        else
            System.out.println(count);
    }
}
