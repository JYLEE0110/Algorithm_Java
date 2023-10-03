package array;

//설명
//
//1) 피보나키 수열을 출력한다. 피보나치 수열이란 앞의 2개의 수를 합하여 다음 숫자가 되는 수열이다.
//
//2) 입력은 피보나치 수열의 총 항의 수 이다. 만약 7이 입력되면 1 1 2 3 5 8 13을 출력하면 된다.
//
//
//입력
//첫 줄에 총 항수 N(3<=N<=45)이 입력된다.
//
//
//출력
//첫 줄에 피보나치 수열을 출력합니다.

import java.util.ArrayList;
import java.util.Scanner;

public class FibonacciSequence_04 {
	
	public ArrayList<Integer> solution(int n){

		ArrayList<Integer> result = new ArrayList<>();
		
		result.add(1);
		result.add(1);
		
		
		for(int i=2; i<n; i++) {
			
			int next = result.get(i-2) + result.get(i-1);
			
			result.add(next);
			
		}
		
		return result;
	}

	public static void main(String[] args) {
		
		FibonacciSequence_04 t = new FibonacciSequence_04();
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for(int x : t.solution(n)) {
			
			System.out.print(x + " ");
			
		}
		

	}

}
