package slidingwindow;


/*설명

현수의 아빠는 제과점을 운영합니다. 현수 아빠는 현수에게 N일 동안의 매출기록을 주고 연속된 K일 동안의 최대 매출액이 얼마인지 구하라고 했습니다.

만약 N=10이고 10일 간의 매출기록이 아래와 같습니다. 이때 K=3이면

12 1511 20 2510 20 19 13 15

연속된 3일간의 최대 매출액은 11+20+25=56만원입니다.

여러분이 현수를 도와주세요.


입력
첫 줄에 N(5<=N<=100,000)과 K(2<=K<=N)가 주어집니다.

두 번째 줄에 N개의 숫자열이 주어집니다. 각 숫자는 500이하의 음이 아닌 정수입니다.


출력
첫 줄에 최대 매출액을 출력합니다.*/

import java.util.Scanner;

public class MaximumSales {
	
	static int solution(int n, int k, int[] arr) {
		
		int p1 = 1;
		int sum = 0;
		int max = 0;
		
		for(int i = 0; i < k; i++) {
			
			sum += arr[i];
			
		}
		
		// 최초 값을 max에 대입
		max = sum;
		
		// 최초 p[0] + p[1] + p[2] .... 값 제외
		// p[1] + p[2] ... 부터
		while(p1 < n-k+1) {
			
			sum = sum - arr[p1-1] + arr[p1+k-1] ;
			p1++;
			max = max > sum ? max : sum;
			
		}
		
		return max;
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] arr = new int[n];
		
		
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println(MaximumSales.solution(n, k, arr));

	}

}
