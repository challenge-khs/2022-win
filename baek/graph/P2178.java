import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Maze {
    private int x;
    private int y;

    public Maze(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}

public class P2178 {
    public static int n, m;
    public static int[][] map = new int[100][100];
    public static boolean[][] visited = new boolean[100][100];
    public static int dx[] = {-1, 1, 0, 0};
    public static int dy[] = {0, 0, -1, 1};


    public static void bfs(int x, int y) {
        Queue<Maze> q = new LinkedList<>();
        q.offer(new Maze(x, y));
        while (!q.isEmpty()) {
            Maze temp = q.poll();
            for(int i = 0; i < 4; i++) {
                int nx = temp.getX() + dx[i];
                int ny = temp.getY() + dy[i];
                if(nx < 0 || nx >= n || ny < 0 || ny >= m || visited[nx][ny] == true || map[nx][ny] == 0)
                    continue;
                q.offer(new Maze(nx, ny));
                map[nx][ny] = map[temp.getX()][temp.getY()] + 1;
                visited[nx][ny] = true;
            }
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        sc.nextLine();

        for(int i = 0; i < n; i++) {
            String str = sc.nextLine();
            for(int j = 0; j < m; j++) {
                map[i][j] = str.charAt(j) - '0';
                visited[i][j] = false;
            }
        }

        bfs(0, 0);

        System.out.println(map[n - 1][m - 1]);
    }
}
