import java.util.*;

class Node17 implements Comparable<Node17> {
    private int x;
    private int y;
    private int index;
    private int second;

    public Node17(int x, int y, int index, int second) {
        this.x = x;
        this.y = y;
        this.index = index;
        this.second = second;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getIndex() {
        return index;
    }

    public int getSecond() {
        return second;
    }

    @Override
    public int compareTo(Node17 o) {
        if(this.index > o.index)
            return 1;
        else
            return -1;
    }
}

public class Q17 {
    public static int n, k, s, x, y;
    public static int[][] map = new int[201][201];
    public static ArrayList<Node17> virus = new ArrayList<Node17>();
    public static int[] dx = {-1, 1, 0, 0};
    public static int[] dy = {0, 0, -1, 1};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        k = sc.nextInt();

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                map[i][j] = sc.nextInt();
                if(map[i][j] != 0) {
                    virus.add(new Node17(i, j, map[i][j], 0));
                }
            }
        }

        s = sc.nextInt();
        x = sc.nextInt();
        y = sc.nextInt();

        Collections.sort(virus);
        Queue<Node17> q = new LinkedList<Node17>();
        for(int i = 0; i < virus.size(); i++) {
            q.offer(virus.get(i));
        }

        while(!q.isEmpty()) {
            Node17 temp = q.poll();
            if(temp.getSecond() == s)
                break;
            for(int i = 0; i < 4; i++) {
                int nx = temp.getX() + dx[i];
                int ny = temp.getY() + dy[i];
                if(nx >= 0 && nx < n && ny >= 0 && ny < n) {
                    if(map[nx][ny] == 0) {
                        map[nx][ny] = temp.getIndex();
                        q.offer(new Node17(nx, ny, temp.getIndex(), temp.getSecond() + 1));
                    }
                }
            }
        }
        System.out.println(map[x-1][y-1]);
    }
}
