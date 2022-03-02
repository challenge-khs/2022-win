import java.util.Scanner;
import java.util.Stack;

public class P9012 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t > 0) {
            String input = sc.next();
            boolean flag = false;
            Stack<Character> st = new Stack<>();

            for(int i = 0; i < input.length(); i++) {
                char temp = input.charAt(i);
                if(temp == '(') {
                    st.push(temp);
                }
                else if (st.isEmpty()){
                    flag = true;
                    break;
                }
                else if(temp == ')')
                    st.pop();
            }

            if(st.isEmpty()) {
                if(flag == true)
                    System.out.println("NO");
                else
                    System.out.println("YES");
            }
            else
                System.out.println("NO");
            
            t--;
        }
    }
}
