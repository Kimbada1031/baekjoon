package backjoon;
import java.util.Scanner;
import java.util.HashSet;

public class bj_3052 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int nums[] = new int[10];
		HashSet<Integer> cnt = new HashSet<Integer>();
		
		for(int i = 0; i < 10; i++) {
			nums[i] = sc.nextInt();
			cnt.add(nums[i] % 42);
		}
		
		
		System.out.println(cnt.size());
	} 

}
