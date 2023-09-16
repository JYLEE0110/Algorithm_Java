package algorithm;


//설명
//
//한 개의 문자열 s와 문자 t가 주어지면 문자열 s의 각 문자가 문자 t와 떨어진 최소거리를 출력하는 프로그램을 작성하세요.
//
//
//입력
//첫 번째 줄에 문자열 s와 문자 t가 주어진다. 문자열과 문자는 소문자로만 주어집니다.
//
//문자열의 길이는 100을 넘지 않는다.
//
//
//출력
//첫 번째 줄에 각 문자열 s의 각 문자가 문자 t와 떨어진 거리를 순서대로 출력한다.


import java.util.ArrayList;
import java.util.Scanner;

public class Shortest_String_Distance_10 {

	public ArrayList<Integer> solution(String str, char ch) {
		
		ArrayList answer = new ArrayList<Integer>();
		int n = 1000;
		
		// 0부터 주어진 str 길이 까지 순회 
		for(int i = 0; i<str.length(); i++) {
			
			if(str.charAt(i) == ch) {
				n = 0;
			}else {
				n++;
			}
			answer.add(n);
			
		}
		n=1000;
		// 오른쪽부터 순회 하면서 기존 0부터 순회한 값보다 작을 경우 set 
		for(int i = str.length()-1; i>=0; i--) {
			
			if(str.charAt(i) == ch) {
				n = 0;
			}else {
				n++;
				if((int)answer.get(i) > n) {
					answer.set(i, n);
				}
			}
			
		}
		
		return answer;
		
	}
	
	public static void main(String[] args) {
		
		Shortest_String_Distance_10 t 
			= new Shortest_String_Distance_10();
		
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		char ch = sc.next().charAt(0);
		
		// solution 메소드 반환값은 Integer지만 자동으로 int로 형 변환된다.
		for(int n : t.solution(str, ch)) {
			System.out.print(n + " ");
		}

	}

}
