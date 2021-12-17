package backjoon;

import java.util.Scanner;

public class bj_2475 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num[] = new int[5];
		int sum = 0;
		
		for(int i = 0; i < 5; i++) {
			num[i] = sc.nextInt();
			sum += num[i] * num[i];
		}
		
		System.out.println(sum%10);
	}

}
