import java.util.Scanner;

public class P4963 {
    public static int w, h;
    public static int map[][];
    public static boolean[][] visited;
    public static int dx[] = {-1, 0, 1, -1, 1, -1, 0, 1};
    public static int dy[] = {-1, -1, -1, 0, 0, 1, 1, 1};

    public static void dfs(int x, int y) {
        visited[x][y] = true;

        for(int i = 0; i < 8; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if(nx < 0 || nx >= h || ny < 0 || ny >= w)
                continue;
            if(map[nx][ny] == 1 && visited[nx][ny] == false)
                dfs(nx, ny);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true) {
            int count = 0;
            w = sc.nextInt();
            h = sc.nextInt();
            if(w == 0 && h == 0)
                break;

            map = new int[h][w];
            visited = new boolean[h][w];
            for(int i = 0; i < h; i++) {
                for(int j = 0; j < w; j++) {
                    map[i][j] = sc.nextInt();
                }
            }

            for(int i = 0; i < h; i++) {
                for(int j = 0; j < w; j++) {
                    if(map[i][j] == 1 && visited[i][j] == false) {
                        dfs(i, j);
                        count++;
                    }
                }
            }

            System.out.println(count);
        }
    }
}
