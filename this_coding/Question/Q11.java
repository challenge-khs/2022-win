import java.util.*;

class Node11 {
    private int time;
    private char direction;

    public Node11(int time, char direction) {
        this.time = time;
        this.direction = direction;
    }

    public int getTime() {
        return time;
    }

    public char getDirection() {
        return direction;
    }
}

class Position {
    private int x, y;

    public Position(int x, int y) {
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

public class Q11 {
    public static int n, k, l;
    public static int[][] board = new int[101][101];
    public static ArrayList<Node11> info = new ArrayList<>();

    public static int dx[] = {0, 1, 0, -1};
    public static int dy[] = {1, 0, -1, 0};

    public static int turn(int direction, char c) {
        if(c == 'L') {
            if(direction == 0)
                direction = 3;
            else
                direction--;
        }
        else {
            if(direction == 3)
                direction = 0;
            else
                direction++;
        }
        return direction;
    }

    public static int simulate() {
        int x =1, y = 1;
        board[x][y] = 2;
        int direction = 0;
        int time = 0;
        int index = 0;

        Queue<Position> q = new LinkedList<>();
        q.offer(new Position(x, y));

        while(true) {
            int nx = x + dx[direction];
            int ny = y + dy[direction];
            if(nx >= 1 && nx <= n && ny >= 1 && ny <= n && board[nx][ny] != 2) {
                if(board[nx][ny] == 0) {
                    board[nx][ny] = 2;
                    q.offer(new Position(nx, ny));
                    Position prev = q.poll();
                    board[prev.getX()][prev.getY()] = 0;
                }

                if(board[nx][ny] == 1) {
                    board[nx][ny] = 2;
                    q.offer(new Position(nx, ny));
                }
            }
            else {
                time++;
                break;
            }

            x = nx;
            y = ny;
            time++;

            if (index < l && time == info.get(index).getTime()) {
                direction = turn(direction, info.get(index).getDirection());
                index++;
            }
        }
        return time;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        k = sc.nextInt();

        for(int i = 0; i < k; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            board[a][b] = 1;
        }

        l = sc.nextInt();
        for(int i = 0; i < l; i++) {
            int x = sc.nextInt();
            char c = sc.next().charAt(0);
            info.add(new Node11(x, c));
        }
        System.out.println(simulate());
    }
}
/*
6
3
3 4
2 5
5 3
3
3 D
15 L
17 D
 */
