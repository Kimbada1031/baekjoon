package backjoon;
import java.util.Scanner;
public class bj_1076 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
	
		String n1 = new String();
		
		int[] n4 = {1, 10, 100, 1000, 10000, 100000, 1000000, 10000000, 100000000, 1000000000};
		int[] n5 = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
		
		long result = 0;
		String colors[] = {"black", "brown", "red", "orange", "yellow", "green", "blue", "violet", "grey", "white"};
		String[] get_cls = new String[3];
		
		for(int j = 0; j < 3; j++) {
			get_cls[j] = sc.nextLine();
		}
		
		
		for(int i = 0; i < 2; i++) {
			for(int j = 0; j < 10; j++) {
				if(get_cls[i].equals(colors[j])) {
					n1 += Integer.toString(n5[j]);				
				}
				if(get_cls[2].equals(colors[j])) {
					result = n4[j];
				}
			}
			
		}
		result = result * Integer.parseInt(n1);
		System.out.println(result);
	}
}

