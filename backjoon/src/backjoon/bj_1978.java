package backjoon;
import java.util.Scanner;

public class bj_1978 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int nums[] = new int[n];
		int cnt = 0;
		int sCnt = 0;
		
		for(int i = 0; i < n; i++) {
			cnt = 0;
			nums[i] = sc.nextInt();

			for(int j = 1; j <= nums[i]; j++) {
				if(nums[i] % j == 0) {
					cnt += 1;
				}
			}
			if(cnt == 2) {
				sCnt += 1;
			}
		}
		System.out.println(sCnt);

	}

}
