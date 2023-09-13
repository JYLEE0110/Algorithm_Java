package algorithm;

//설명
//
//영어 알파벳과 특수문자로 구성된 문자열이 주어지면 영어 알파벳만 뒤집고,
//
//특수문자는 자기 자리에 그대로 있는 문자열을 만들어 출력하는 프로그램을 작성하세요.
//
//
//입력
//첫 줄에 길이가 100을 넘지 않는 문자열이 주어집니다.
//
//
//출력


import java.util.Scanner;

public class Reverse_Specific_String_05 {
	
	public String solution(String str) {
		
		char[] newStr = str.toCharArray();
		
		// 단어의 첫번째 index
		int lt = 0;
		
		// 단어의 마지막번째 index
		int rt = str.length()-1;
		
		// index가 lt가 작을때 까지 반복
		while(lt<rt) {
			
			// 좌측 부터 알파벳이 아닐경우 lt를 증가
			if(!Character.isAlphabetic(newStr[lt])) {
				lt++;
			// 우측 부터 요소가 알파벳이 아닐경우 rt를 감소
			}else if(!Character.isAlphabetic(newStr[rt])) {
				rt--;
			// 좌측 우측 둘다 알파벳일 경우 Swap 후 lt증가 rt감소
			}else {
				char tmp = newStr[lt];
				newStr[lt] = newStr[rt];
				newStr[rt] = tmp;
				lt++;
				rt--;
			}
			
		}
		
		// char를 String으로  반환
		return String.valueOf(newStr);
		
	}


	public static void main(String[] args) {
		
		Reverse_Specific_String_05 t = new Reverse_Specific_String_05();
		
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		
		System.out.println(t.solution(str));
		
	}

}
