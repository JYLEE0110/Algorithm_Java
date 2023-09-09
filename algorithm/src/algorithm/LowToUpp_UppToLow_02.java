package algorithm;


//설명
//대문자와 소문자가 같이 존재하는 문자열을 입력받아 대문자는 소문자로 소문자는 대문자로 변환하여 출력하는 프로그램을 작성하세요.
//
//
//입력
//첫 줄에 문자열이 입력된다. 문자열의 길이는 100을 넘지 않습니다.
//문자열은 영어 알파벳으로만 구성되어 있습니다.
//
//
//출력
//첫 줄에 대문자는 소문자로, 소문자는 대문자로 변환된 문자열을 출력합니다.

import java.util.Scanner;

public class LowToUpp_UppToLow_02 {

	public String solution(String str){
		
		String newStr = "";
		
		if(str.length() > 100) {
			return "입력한 문자길이는 100자가 최대입니다.";
		}
		
		for(char result : str.toCharArray()) {
			// 삼항연산자로 문자 1개씩 비교하여 newStr에 추가하여 반환한다.
			result = Character.isLowerCase(result) ? Character.toUpperCase(result) : Character.toLowerCase(result);
			newStr += result;
		}
		
		return newStr;
		
	}
	
	public static void main(String[] args) {
		
		LowToUpp_UppToLow_02 result = new LowToUpp_UppToLow_02();
		
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		
		System.out.println(result.solution(str));

	}

}
