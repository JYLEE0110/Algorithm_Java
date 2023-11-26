package slidingwindow;

/*설명

N개의 수로 이루어진 수열이 주어집니다.

이 수열에서 연속부분수열의 합이 특정숫자 M이 되는 경우가 몇 번 있는지 구하는 프로그램을 작성하세요.

만약 N=8, M=6이고 수열이 다음과 같다면

1 2 1 3 1 1 1 2

합이 6이 되는 연속부분수열은 {2, 1, 3}, {1, 3, 1, 1}, {3, 1, 1, 1}로 총 3가지입니다.


입력
첫째 줄에 N(1≤N≤100,000), M(1≤M≤100,000,000)이 주어진다.

수열의 원소값은 1,000을 넘지 않는 자연수이다.


출력
첫째 줄에 경우의 수를 출력한다.*/

import java.util.Scanner;

public class ContinuosPartialSequence {

	static int solution(int n, int m, int[] arr) {
		
		int lt = 0;
		int rt = 0;
		int cnt = 0;
		int sum = 0;
		
		 
		for(; rt < n; rt++) {
			
			// lt ~ rt를 더한 값이 sum
			sum = sum + arr[rt];
			
			// sum이 주어진 M이라면 cnt를 증가
			// sum과 m이 같을 시 에는 그대로 rt를 증가 시킨다 => 다음 for문에서 무조건 sum > m에 걸림
			if(sum == m) {
				cnt++;
			}
			
			// sum이 주어진 M보다 클 시 sum에서 lt를 빼고 lt를 증가
			// sum이 M보다 작아질때까지 반복
			while(sum > m) {
				sum = sum - arr[lt];
				lt++;
				
				// 만약 lt를 증가 시키고난 후의 sum값이 M과 같다면 cnt 증가
				if(sum == m) {
					cnt++;
				}
				
			}
			
		}
		
		return cnt;
	}
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		int[] arr = new int[n];
		
		for(int i = 0; i < n; i++) {
			
			arr[i] = sc.nextInt();
			
		}
		
		System.out.println(ContinuosPartialSequence.solution(n, m, arr));
		
	}

}
