import java.util.*;

class Student implements Comparable<Student> {
	private String name;
	private int kor;
	private int eng;
	private int mat;
	
	public Student(String name, int kor, int eng, int mat) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
	}
	
	public String getName() {
		return this.name;
	}
	
	@Override
	public int compareTo(Student other) {
		if(this.kor < other.kor)
			return 1;
		else if(this.kor == other.kor) {
			if(this.eng > other.eng) 
				return 1;
			else if(this.eng == other.eng) {
				if(this.mat < other.mat)
					return 1;
				else if(this.mat == other.mat) {
					if(this.name.compareTo(other.name) > 0)
						return 1;
				}
			}
		}
		return -1;
	}
}

public class Q23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		ArrayList<Student> s = new ArrayList<>();
		int n = sc.nextInt();
		
		for(int i = 0; i < n; i++) {
			String name = sc.next();
			int kor = sc.nextInt();
			int eng = sc.nextInt();
			int mat = sc.nextInt();
			s.add(new Student(name, kor, eng, mat));
		}
		
		Collections.sort(s);
		
		for(int i = 0; i < n; i++) {
			System.out.println(s.get(i).getName());
		}
	}

}
