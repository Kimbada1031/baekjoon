package backjoon;

import java.util.Scanner;

public class bj_11720 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String arr = sc.next();
		int arr_sum = 0;
		
		for(int i = 0; i < n; i++) {
			arr_sum += Integer.parseInt(arr.substring(i, i+1));
		}
		
		System.out.println(arr_sum);
	}

}
