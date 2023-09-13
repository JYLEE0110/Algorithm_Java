package algorithm;


//설명
//
//소문자로 된 한개의 문자열이 입력되면 중복된 문자를 제거하고 출력하는 프로그램을 작성하세요.
//
//중복이 제거된 문자열의 각 문자는 원래 문자열의 순서를 유지합니다.
//
//
//입력
//첫 줄에 문자열이 입력됩니다. 문자열의 길이는 100을 넘지 않는다.
//
//
//출력
//첫 줄에 중복문자가 제거된 문자열을 출력합니다.




import java.util.ArrayList;
import java.util.Scanner;

public class Remove_Duplicate_Char_06 {

	public String solution(String str) {

		String result = "";

		for (int i = 0; i < str.length(); i++) {

			// str.charAt(i) => i번째의 문자 1개를 추출
			// str.indexOf() => 문자의 index 번호 추출
			// i와 비교 => 중복 일 경우 str.indexOf와 i는 다르다.
 			if (i == str.indexOf(str.charAt(i))) {

				result += str.charAt(i);

			}

		}

		return result;

	}

	public static void main(String[] args) {

		Remove_Duplicate_Char_06 t = new Remove_Duplicate_Char_06();

		Scanner sc = new Scanner(System.in);

		String str = sc.nextLine();

		System.out.println(t.solution(str));

	}

}
