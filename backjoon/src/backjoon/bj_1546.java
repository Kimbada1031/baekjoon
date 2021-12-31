package backjoon;

import java.util.Scanner;

public class bj_1546 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int score[] = new int[n];
		int max = 0;
		
		max = score[0] = sc.nextInt();
		
		double avg = score[0];
		
		for(int i = 1; i < n; i++) {
			score[i] = sc.nextInt();
			avg += score[i];
			if(score[i] > max) max = score[i];
		}
		
		System.out.println((avg / max * 100) / n );
	}

}
