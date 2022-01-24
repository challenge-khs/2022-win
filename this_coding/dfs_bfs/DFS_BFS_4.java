public class DFS_BFS_4 {

	public static void recursiveFunc(int i) {
		if (i == 100)
			return;
		System.out.println(i + "번째 재귀 함수에서" + (i + 1) + "번째 재귀 함수 호출");
		recursiveFunc(i + 1);
		System.out.println((i) + "번째 재귀 함수를 종료");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		recursiveFunc(1);
	}

}
