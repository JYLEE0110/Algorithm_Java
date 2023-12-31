package twopointers;

//설명
//
//0과 1로 구성된 길이가 N인 수열이 주어집니다. 여러분은 이 수열에서 최대 k번을 0을 1로 변경할 수 있습니다. 여러분이 최대 k번의 변경을 통해 이 수열에서 1로만 구성된 최대 길이의 연속부분수열을 찾는 프로그램을 작성하세요.
//
//만약 길이가 길이가 14인 다음과 같은 수열이 주어지고 k=2라면
//
//1 1 0 0 1 1 0 1 1 0 1 1 0 1
//
//여러분이 만들 수 있는 1이 연속된 연속부분수열은
//
//Image1.jpg
//
//이며 그 길이는 8입니다.
//
//
//입력
//첫 번째 줄에 수열의 길이인 자연수 N(5<=N<100,000)이 주어집니다.
//
//두 번째 줄에 N길이의 0과 1로 구성된 수열이 주어집니다.
//
//
//출력
//첫 줄에 최대 길이를 출력하세요.

import java.util.Scanner;

public class MaximumLengthSequence {
	
	static int solution(int n, int k, int[] arr) {
		
		int lt = 0;
		int rt = 0;
		int result = 0;
		int cnt = 0;
		
		// rt가 n 까지일대 까지 for문을 돈다.
		for(; rt < n; rt++) {
			
			// 만약 0을 만나면 cnt를 증가 시킨다.
			// 주어진 k보다 cnt가 커도 일단 증가 시킨다. => while문에서 걸림
			if(arr[rt] == 0) {
				cnt++;
			}
			
			// 1. cnt가 주어진 k보다 클때 
			while(cnt > k) {
				// 3. lt를 계속 증가시켜 0일때 cnt를 감소 시킨다.
				if(arr[lt] == 0 ) {
					cnt--;
				}
				// 2. lt를 계속 증가시킨다.
				lt++;
			}
			// 제일 긴 길이를 반환 한다.
			result = result > rt-lt+1 ? result : rt-lt+1;
			
		}
		
		return result;
		
	}
		

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int k = sc.nextInt();
		
		int[] arr = new int[n];
		
		for(int i = 0; i < n; i++) {
			
			arr[i] = sc.nextInt();
			
		}
		
		System.out.println(MaximumLengthSequence.solution(n, k, arr));

	}

}
