package slidingwindow;

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
