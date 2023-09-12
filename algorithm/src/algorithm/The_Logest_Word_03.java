package algorithm;

//설명
//
//한 개의 문장이 주어지면 그 문장 속에서 가장 긴 단어를 출력하는 프로그램을 작성하세요.
//
//문장속의 각 단어는 공백으로 구분됩니다.
//
//
//입력
//첫 줄에 길이가 100을 넘지 않는 한 개의 문장이 주어집니다. 문장은 영어 알파벳으로만 구성되어 있습니다.
//
//
//출력
//첫 줄에 가장 긴 단어를 출력한다. 가장 길이가 긴 단어가 여러개일 경우 문장속에서 가장 앞쪽에 위치한

import java.util.Scanner;

public class The_Logest_Word_03 {

	public String solution(String word) {

		String result = "";

		String[] spWord = word.split(" ");

		for (String w : spWord) {

			result = w.length() > result.length() ? w : result;

		}

		return result;

	}

	public String solution2(String word) {

		String result = " ";

		int m = Integer.MIN_VALUE, pos;

		// 입력받은 문장에 공백이 없을 경우 while문 실행 X
		// 공백이 있을 경우 몇번째인지 pos에 저장한다.
		while ((pos = word.indexOf(" ")) != -1) {

			// 0부터 pos까지 잘라낸 문장을 tmp에 저장
			String tmp = word.substring(0, pos);

			// tmp의 길이가 m보다 클때 result = tmp가 된다. => subString으로 잘라 계속해서 반복
			if (tmp.length() > m) {

				m = tmp.length();
				result = tmp;

			}
			// 처음 공백 제거 후 새로운 문장을 만들어 내서 계속해서 반복
			word = word.substring(pos + 1);
			
			// 마지막 문장은 공백이없으므로 if문으로 단어의 길이로 비교
			if (word.length() > m) {
				result = word;
			}

		}
		return result;

	}

	public static void main(String[] args) {

		The_Logest_Word_03 t = new The_Logest_Word_03();

		Scanner sc = new Scanner(System.in);

		String word = sc.nextLine();

		System.out.println(t.solution2(word));

	}

}
