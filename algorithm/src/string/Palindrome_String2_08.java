package string;

//설명
//
//앞에서 읽을 때나 뒤에서 읽을 때나 같은 문자열을 팰린드롬이라고 합니다.
//
//문자열이 입력되면 해당 문자열이 팰린드롬이면 "YES", 아니면 “NO"를 출력하는 프로그램을 작성하세요.
//
//단 회문을 검사할 때 알파벳만 가지고 회문을 검사하며, 대소문자를 구분하지 않습니다.
//
//알파벳 이외의 문자들의 무시합니다.
//
//
//입력
//첫 줄에 길이 100을 넘지 않는 공백이 없는 문자열이 주어집니다.
//
//
//출력
//첫 번째 줄에 팰린드롬인지의 결과를 YES 또는 NO로 출력합니다.

import java.util.Scanner;

public class Palindrome_String2_08 {

	public String solution(String str) {
		
		str = str.toUpperCase();
		
		int len = str.length();
		String result = "YES";
		
		int lt = 0;
		int rt = len - 1;
		
		while(lt < rt) {
			
			if(!Character.isAlphabetic(str.charAt(lt))) {
				lt ++;
			}else if(!Character.isAlphabetic(str.charAt(rt))) {
				rt --;
			}else {
				if(str.charAt(lt) != str.charAt(rt)) {
					return "NO";
				}
				lt++;
				rt--;
			}
			
		}
		
		return result;
		
	}
	
	public String solution2(String str) {
		
		// 정규 표현식으로 알파벳이 아닌 문자들을 처리
		// replaceAll만 정규 표현식 사용 가능
		str = str.replaceAll("[^A-Za-z]", "");
		
		String result = "YES";
		
		// StringBuilder로 문자열을 뒤집는다.
		String tmp = new StringBuilder(str).reverse().toString();
		
		// 대 소문자 구별안하고 비교
		if(!str.equalsIgnoreCase(tmp)) {
			result = "NO";
		}
		
		return result;
		
	}
	
	public static void main(String[] args) {

		Palindrome_String2_08 t = new Palindrome_String2_08();
		
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		
		System.out.println(t.solution2(str));
		
	}

}
