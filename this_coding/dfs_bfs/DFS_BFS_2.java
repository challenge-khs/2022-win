import java.util.*;

public class DFS_BFS_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Integer> q = new LinkedList<>();
		q.add(5);
		q.add(2);
		q.add(3);
		q.add(7);
		q.poll();
		q.add(1);
		q.add(4);
		q.poll();
		System.out.println(q);
	}

}
