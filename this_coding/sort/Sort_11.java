import java.util.*;

class Student implements Comparable<Student> {
	private String name;
	private int score;
	
	public Student(String name, int score) {
		this.name = name;
		this.score = score;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getScore() {
		return this.score;
	}
	
	@Override
	public int compareTo(Student other) {
		if(this.score < other.score) {
			return -1;
		}
		return 1;
	}
}

public class Sort_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		ArrayList<Student> s = new ArrayList<>();
		
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		
		for(int i = 0; i < n; i++) {
			String name = sc.next();
			int score = sc.nextInt();
			s.add(new Student(name, score));
		}
		
		Collections.sort(s);
		
		for(int i = 0; i < n; i++) {
			System.out.print(s.get(i).getName()+" ");
		}
	}

}
