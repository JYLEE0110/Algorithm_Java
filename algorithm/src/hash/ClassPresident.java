package hash;

//설명
//
//학급 회장을 뽑는데 후보로 기호 A, B, C, D, E 후보가 등록을 했습니다.
//
//투표용지에는 반 학생들이 자기가 선택한 후보의 기호(알파벳)가 쓰여져 있으며 선생님은 그 기호를 발표하고 있습니다.
//
//선생님의 발표가 끝난 후 어떤 기호의 후보가 학급 회장이 되었는지 출력하는 프로그램을 작성하세요.
//
//반드시 한 명의 학급회장이 선출되도록 투표결과가 나왔다고 가정합니다.
//
//
//입력
//첫 줄에는 반 학생수 N(5<=N<=50)이 주어집니다.
//
//두 번째 줄에 N개의 투표용지에 쓰여져 있던 각 후보의 기호가 선생님이 발표한 순서대로 문자열로 입력됩니다.
//
//
//출력
//학급 회장으로 선택된 기호를 출력합니다.

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class ClassPresident {

	static char soluction(int n, String st) {

		// Key는 후보 Value는 득표 수
		HashMap<Character, Integer> map = new HashMap<>();
		char result = ' ';
		int max = 0;

		// 입력된 문자열 st를 char형 배열로 만들어서 x로 하나씩 가져온다.
		for (char x : st.toCharArray()) {

			// map은 key 중복이 안된다. 그러나 제일 마지막에 들어간 key의 value로 들어간다.
			// 가져온 x(A,B,C,D,E 중 하나) 를 HashMap Key에 넣고
			// 최초 x를 넣을때는 value가 없으므로 getOrDefault로 0 으로 넣고 +1 count 해준다.
			// 최초가 아닐 시는 기존 값을 그대로 가져와 +1 count해준다. => 득표 수
			map.put(x, map.getOrDefault(x, 0) + 1);

		}

		// key값을 가져와서
		for (char x : map.keySet()) {
			
			// value(득표 수)를 비교한다.
			// max보다 득표수가 많을 시 result를 key(후보)로 반환
			if (max < map.get(x)) {
				max = map.get(x);
				result = x;
			}

		}
		return result;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		String st = sc.next();
		System.out.println(ClassPresident.soluction(n, st));

	}

}
