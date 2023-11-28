package twopointers;

/*설명

N입력으로 양의 정수 N이 입력되면 2개 이상의 연속된 자연수의 합으로 정수 N을 표현하는 방법의 가짓수를 출력하는 프로그램을 작성하세요.

만약 N=15이면

7+8=15

4+5+6=15

1+2+3+4+5=15

와 같이 총 3가지의 경우가 존재한다.


입력
첫 번째 줄에 양의 정수 N(7<=N<1000)이 주어집니다.


출력
첫 줄에 총 경우수를 출력합니다.*/

import java.util.Arrays;
import java.util.Scanner;

public class SumOfConsecutiveNaturalNumber {
	
	static int solution(int n, int[] arr, int m) {
		
		int lt = 0;
		int rt = 0;
		int sum = 0;
		int cnt = 0;
		
		for(;rt < m; rt++) {
			
			sum += arr[rt];
			
			while(sum > n) {
				
				sum -= arr[lt];
				lt++;
			}
			if(sum == n) {
				cnt++;
			}
			
		}
		return cnt;
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		// 주어진 n에서 n/2+1 까지만 보면 된다.
		// n이 15일 시 8까지 보본다. => 9부터는 15를 초과한다.
		int m = n/2 + 1;
		
		for(int i = 0; i < m; i++) {
			
			arr[i] = i+1;
			
		}
		
		System.out.println(SumOfConsecutiveNaturalNumber.solution(n, arr, m));
		
	}

}
