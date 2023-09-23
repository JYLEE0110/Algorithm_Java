package algorithm;

import java.util.ArrayList;
import java.util.Scanner;

public class Ascii_12 {

	public ArrayList<String> solution(String str) {
		
		ArrayList<String> result = new ArrayList<>();
		int cnt = 1;
		
		str = str + " ";
		
		System.out.println(str);
		
		for(int i = 0; i<str.length()-1; i++) {
			
			if(str.charAt(i) == str.charAt(i+1)) {
				cnt++;
			}else {
				result.add(String.valueOf(str.charAt(i)));
				if(cnt != 1) {
					result.add(String.valueOf(cnt));
				}
				cnt=1;
			}
			
		}
			return result;
		
	}
	
	public static void main(String[] args) {

		Ascii_12 t = new Ascii_12();
		
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		
		for(String result : t.solution(str)) {
			System.out.print(result);
		}
		
		
	}

}
