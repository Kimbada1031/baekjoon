package backjoon;

import java.util.Scanner;

public class bj_8958 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cnt = 0;
		int n = sc.nextInt();
		String str = new String();
		
		int sum[] = new int[n];
		
		for(int i = 0; i < n; i++) {
			cnt = 0;
			str = sc.next();
			String[] st = str.split("");
			
			for(int j = 0; j < st.length; j++){
				if(st[j].equals("O")) {
					cnt += 1;
					sum[i] += cnt;
				} else {
					cnt = 0;
				}
	        }
		}
		
		for(int i = 0; i < n; i++) {
			System.out.println(sum[i]);
		}
	}

}
