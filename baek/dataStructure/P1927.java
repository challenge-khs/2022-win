import java.util.PriorityQueue;
import java.util.Scanner;

public class P1927 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for(int i = 0; i < n; i++) {
            int x = sc.nextInt();
            if(x == 0) {
                if(pq.isEmpty()) {
                    System.out.println("0");
                    continue;
                }
                int temp = pq.poll();
                System.out.println(temp);
            }
            else
                pq.offer(x);
        }
    }
}
