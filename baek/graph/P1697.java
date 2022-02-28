import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class P1697 {
    public static int n, k;
    public static int[] map =new int[100001];

    static void bfs(int x) {
        Queue<Integer> q = new LinkedList<>();
        q.offer(x);

        while (!q.isEmpty()) {
            int temp = q.poll();
            for(int i = 0; i < 3; i++) {
                int next;
                if(i == 0)
                    next = temp + 1;
                else if(i == 1)
                    next = temp - 1;
                else
                    next = temp * 2;

                if(next < 0 || next > 100000 || map[next] != 0)
                    continue;

                q.offer(next);
                map[next] = map[temp] + 1;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        k = sc.nextInt();

        bfs(n);
        if(n == k)
            System.out.println("0");
        else
            System.out.println(map[k]);
    }
}
