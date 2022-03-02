import java.util.Scanner;
import java.util.Stack;

public class P10773 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int k = sc.nextInt();
        int sum = 0;
        Stack<Integer> s = new Stack<>();

        for (int i = 0; i < k; i++) {
            int input = sc.nextInt();
            if(input == 0)
                s.pop();
            else
                s.add(input);
        }

        for(int i = 0; i < s.size(); i++) {
            sum += s.get(i);
        }

        System.out.println(sum);
    }
}
