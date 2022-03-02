import java.util.PriorityQueue;
import java.util.Scanner;

class Absol implements Comparable<Absol> {
    int num;

    public Absol(int num) {
        this.num = num;
    }

    @Override
    public int compareTo(Absol o) {
        int c1 = Math.abs(this.num);
        int c2 = Math.abs(o.num);

        if(c1 < c2) { // 새로 들어온 것이 더 크면 우선순위가 작다
            return -1;
        }
        else if(c1 == c2) {
            if(this.num < o.num)
                return -1;
            else
                return 1;
        }
        else {
            return 1;
        }
    }
}

public class P11286 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        PriorityQueue<Absol> pq = new PriorityQueue<>();

        for(int i = 0; i < n; i++) {
            int x = sc.nextInt();
            if(x == 0) {
                if(pq.isEmpty()) {
                    System.out.println("0");
                    continue;
                }
                Absol temp = pq.poll();
                System.out.println(temp.num);
            }
            else
                pq.offer(new Absol(x));
        }
    }
}
