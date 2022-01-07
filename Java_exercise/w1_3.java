import java.util.*;

public class w1_3 {

	public static void main(String[] args){
		int n, m;
		char s[][] = new char[50][50];
		String temp;
		char ch;
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt();
		m = sc.nextInt();
		
		for(int i = 0; i < n; i++) {
			temp = sc.next();
			s[i] = temp.toCharArray();
		}
		
		for (int k = 0; k <= n / 2; k++)
		{
			for (int i = 0; i < n - 1; i++)
			{
				for (int j = 0; j < m; j++)
				{
					if (s[i + 1][j] == '_')
					{
						s[i + 1][j] = s[i][j];
						s[i][j] = '_';
					}
				}
			}
		}

		for (int k = 0; k <= n / 2; k++)
		{
			for (int i = 0; i < n - 1; i++)
			{
				for (int j = 0; j < m; j++)
				{
					if (s[i + 1][j] == s[i][j])
					{
						s[i + 1][j] = '_';
						s[i][j] = '_';
					}
					else if (s[i + 1][j] == '_')
					{
						s[i + 1][j] = s[i][j];
						s[i][j] = '_';
					}
				}
			}
		}
		for(int i = 0; i < n; i++){
			for(int j = 0; j < m; j++) {
				System.out.print(s[i][j]);
			}
			System.out.println();
		}
		
	}
}
