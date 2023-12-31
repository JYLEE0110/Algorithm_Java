package string;

//설명
//
//한 개의 문자열을 입력받고, 특정 문자를 입력받아 해당 특정문자가 입력받은 문자열에 몇 개 존재하는지 알아내는 프로그램을 작성하세요.
//
//대소문자를 구분하지 않습니다.문자열의 길이는 100을 넘지 않습니다.
//
//
//입력
//첫 줄에 문자열이 주어지고, 두 번째 줄에 문자가 주어진다.
//
//문자열은 영어 알파벳으로만 구성되어 있습니다.


import java.util.Scanner;

public class FindString_01 {

	private int count = 0;

	public int solution(String inputStr, char inputCh) {
		
		if(inputStr.length() > 100) {
			System.out.println("Error : 문자열의 최대 길이는 100입니다.");
			return -1;
		}

		inputStr = inputStr.toUpperCase();
		inputCh = Character.toUpperCase(inputCh);

		for (int i = 0; i < inputStr.length(); i++) {

			if (inputStr.charAt(i) == inputCh) {
				count++;
			}
		}

		return count;

	}

	public static void main(String[] args) {

		FindString_01 findString = new FindString_01();

		String inputStr;
		char inputCh;

		Scanner sc = new Scanner(System.in);

		inputStr = sc.nextLine();
		inputCh = sc.next().charAt(0);
		
		int result = findString.solution(inputStr, inputCh);
		System.out.println(result);

	}

}
