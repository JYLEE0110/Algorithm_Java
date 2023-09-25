package string;

//설명
//
//앞에서 읽을 때나 뒤에서 읽을 때나 같은 문자열을 회문 문자열이라고 합니다.
//
//문자열이 입력되면 해당 문자열이 회문 문자열이면 "YES", 회문 문자열이 아니면 “NO"를 출력하는 프로그램을 작성하세요.
//
//단 회문을 검사할 때 대소문자를 구분하지 않습니다.
//
//
//입력
//첫 줄에 길이 100을 넘지 않는 공백이 없는 문자열이 주어집니다.
//
//
//출력
//첫 번째 줄에 회문 문자열인지의 결과를 YES 또는 NO로 출력합니다.

import java.util.Scanner;

public class Palindrome_String_07 {

	public String solution(String str) {

		String newStr = str.toUpperCase();

		char[] ch = newStr.toCharArray();

		int lt = 0;
		int rt = str.length() - 1;
		int cnt = 0;
		String result = "";

		while (lt < rt) {

			if (ch[lt] != ch[rt]) {
				cnt++;
			}
			lt++;
			rt--;
		}
		result = cnt == 0 ? "YES" : "NO";

		return result;

	}
	
	public String solution2(String str) {
		
		str = str.toUpperCase();
		int len = str.length();
		
		for(int i = 0; i < len / 2; i++) {
			
			if(str.charAt(i) != str.charAt(len-i-1)) {
				
				return "NO";
				
			}
			
		}
		return "YES";
		
	}

	public static void main(String[] args) {

		Palindrome_String_07 t = new Palindrome_String_07();

		Scanner sc = new Scanner(System.in);

		String str = sc.nextLine();

		System.out.println(t.solution2(str));

	}

}
