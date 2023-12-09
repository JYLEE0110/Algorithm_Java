package hash;

import java.util.HashMap;
import java.util.Scanner;

public class Anagram {

	public static String solution(String str, String str2) {
		
		String result = "YES";
		
		HashMap<Character, Integer> map = new HashMap<>();
		
		for(char ch : str.toCharArray()) {
			map.put(ch, map.getOrDefault(ch, 0)+1);
		}
		for(char ch : str2.toCharArray()) {
			map.put(ch, map.getOrDefault(ch, 0)-1);
		}
		
		for(char ch : map.keySet()) {
		
			if(map.get(ch) != 0) {
				result = "NO";
				break;
			}
			
		}
		
		return result;
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		String str2 = sc.next();
		
		System.out.println(Anagram.solution(str, str2));
		
	}

}
