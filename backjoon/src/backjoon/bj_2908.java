package backjoon;

import java.util.Scanner;

public class bj_2908 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num[] = new int[2];
		int nums[][] = new int[2][3];
		
		for(int i = 0; i < 2; i++) {
			num[i] = sc.nextInt();
			nums[i][0] = num[i] % 10;
			nums[i][2] = num[i] / 100;
			num[i] = num[i] % 100;
			nums[i][1] = num[i] / 10;
			num[i] = nums[i][0]*100 + nums[i][1]*10 + nums[i][2];
		}
		
		if(num[0] < num[1]) {
			System.out.println(num[1]);
		} else {
			System.out.println(num[0]);
		}
		
		
	}

}
