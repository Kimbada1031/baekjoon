package backjoon;

import java.util.Scanner;

public class bj_2675 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i = 0; i < n; i++) {
			int m = sc.nextInt();
			String str = sc.next();
			String[] st = new String[m];
			
			for(int j = 0; j < str.length(); j++) {
				st = str.split("");
				for(int k = 0; k < m; k++) {
					System.out.print(st[j]);
				}
			}
			System.out.print('\n');
		}
		
	}

}
