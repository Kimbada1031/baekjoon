package backjoon;

import java.util.Scanner;
import java.util.stream.Stream;

public class bj_25 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1[] = new int[3];
		int cnt = 0;
		
		for(int i = 0; i < 3; i++) {
			num1[i] = sc.nextInt();
		}
		
		int[] num2 = Stream.of(String.valueOf(num1[0]*num1[1]*num1[2]).split("")).mapToInt(Integer::parseInt).toArray();
		
		for(int i = 0; i < 10; i++) {
			for(int j = 0; j < num2.length; j++) {
				if(num2[j] == i) {
					cnt++;
				}
			}
			System.out.println(cnt);
			cnt = 0;
		}

	}

}
