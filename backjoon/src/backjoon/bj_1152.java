package backjoon;
import java.util.Scanner;

public class bj_1152 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String get_str = new String();
		
		get_str = sc.nextLine();
		
		String str_arr[] = get_str.split(" ");
		int arr_length = str_arr.length;
		
		if(str_arr[0] == "" || str_arr[arr_length-1] == "") {
			arr_length  = arr_length - 1;
		}
		
		System.out.println(arr_length);
		
	}

}
