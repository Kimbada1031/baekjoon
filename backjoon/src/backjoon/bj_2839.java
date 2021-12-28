package backjoon;

import java.util.Scanner;

public class bj_2839 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int cnt = 0;
		
		
		/*if(num > 10 || num % 3 != 0) {
			cnt += num / 5;
			num %= 5;
			
			if(num >= 3) {
				cnt = cnt + num / 3;
				num %= 3;
				if(num != 0) {
					cnt = -1;
				}
			}
		} else {
			cnt += num / 3;
			num %= 3;
			if(num != 0) {
				cnt = -1;
			}
		} */
		
		while(true) {
			if(num % 5 == 0) {
				cnt += num / 5;
				System.out.println(cnt);
				break;
			} else {
				num -= 3;
				cnt++;
			}
			
			if(num < 0) {
				cnt = -1;
				System.out.println(cnt);
				break;
			}
		}
	}
}
