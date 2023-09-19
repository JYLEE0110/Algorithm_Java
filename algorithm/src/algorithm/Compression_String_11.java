package algorithm;

//설명
//
//알파벳 대문자로 이루어진 문자열을 입력받아 같은 문자가 연속으로 반복되는 경우 반복되는
//
//문자 바로 오른쪽에 반복 횟수를 표기하는 방법으로 문자열을 압축하는 프로그램을 작성하시오.
//
//단 반복횟수가 1인 경우 생략합니다.
//
//
//입력
//첫 줄에 문자열이 주어진다. 문자열의 길이는 100을 넘지 않는다.
//
//
//출력
//첫 줄에 압축된 문자열을 출력한다.

import java.util.ArrayList;
import java.util.Scanner;

public class Compression_String_11 {

	public ArrayList<String> solution(String str) {

		str = str + " ";

		ArrayList<String> list = new ArrayList<>();

		int cnt = 1;

		for (int i = 0; i < str.length() - 1; i++) {

			if (str.charAt(i) == str.charAt(i + 1)) {
				cnt++;
			} else {
				list.add(String.valueOf(str.charAt(i)));
				if (cnt > 1) {

					list.add(Integer.toString(cnt));
				}
				cnt = 1;
			}

		}

		return list;
	}

	public static void main(String[] args) {

		Compression_String_11 t = new Compression_String_11();

		Scanner sc = new Scanner(System.in);

		String str = sc.nextLine();

		for(String result : t.solution(str)) {
			System.out.print(result);
		}
	}

}
