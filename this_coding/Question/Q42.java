import java.util.Scanner;

public class Q42 {
    public static int g;
    public static int p;
    public static int[] parent = new int[10001];

    public static int findParent(int x) {
        if(x == parent[x])
            return x;
        else
            return parent[x] = findParent(parent[x]);
    }

    public static void unionParent(int a, int b) {
        a = findParent(a);
        b = findParent(b);
        if(a < b)
            parent[b] = a;
        else
            parent[a] = b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        g = sc.nextInt();
        p = sc.nextInt();

        for(int i = 1; i <= g; i++) {
            parent[i] = i;
        }

        int result = 0;
        for(int i = 0 ; i < p; i++) {
            int x = sc.nextInt();
            int root = findParent(x);
            if(root == 0)
                break;
            unionParent(root, root - 1);
            result++;
        }
        System.out.println(result);
    }
}
