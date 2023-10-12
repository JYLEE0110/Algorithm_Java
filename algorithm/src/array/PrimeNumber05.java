package array;

//설명
//
//자연수 N이 입력되면 1부터 N까지의 소수의 개수를 출력하는 프로그램을 작성하세요.
//
//만약 20이 입력되면 1부터 20까지의 소수는 2, 3, 5, 7, 11, 13, 17, 19로 총 8개입니다.
//
//
//입력
//첫 줄에 자연수의 개수 N(2<=N<=200,000)이 주어집니다.
//
//
//출력
//첫 줄에 소수의 개수를 출력하시오.


import java.util.Scanner;

public class PrimeNumber05 {

	static int solution(int n) {
		
		int cnt = 0;
		
		int[] num = new int[n+1];
		
		for(int i = 2; i<=n; i++) {
			
			if(num[i] == 0) {
				
				cnt++;
				for(int j = i; j<=n;j+=i) {
					num[j] = 1;
				}
				
			}
			
		}
		
		return cnt;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		System.out.println(PrimeNumber05.solution(n));

	}

}
