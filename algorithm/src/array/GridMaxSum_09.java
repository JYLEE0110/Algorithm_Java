package array;

//5*5 격자판에 아래롸 같이 숫자가 적혀있습니다.
//
//Image1.jpg
//
//N*N의 격자판이 주어지면 각 행의 합, 각 열의 합, 두 대각선의 합 중 가 장 큰 합을 출력합니다.
//
//
//입력
//첫 줄에 자연수 N이 주어진다.(2<=N<=50)
//
//두 번째 줄부터 N줄에 걸쳐 각 줄에 N개의 자연수가 주어진다. 각 자연수는 100을 넘지 않는다.
//
//
//출력
//최대합을 출력합니다.

import java.util.Arrays;
import java.util.Scanner;

public class GridMaxSum_09 {
	
	static int solution(int n, int[][] arr) {
		
		int sumCro = 0;
		int sumRevCro = 0;
		int tmp = 0;
		int tmp2 = 0;
		int result = 0;
		
		for(int i = 0; i < n; i++) {
			
			// 행과 열 반복문이 끝날때 마다 0으로 초기화
			int sumRow = 0;
			int sumCol = 0;
			
			for(int j = 0; j<n; j++) {
				
				// 행과 열의 각각의 합
				sumRow += arr[i][j];
				sumCol += arr[j][i];
				
				if(i == j) {
					sumCro+=arr[i][j];
				}
				if(i+j == n-1) {
					sumRevCro += arr[i][j];
				}
			}
			
			// 각각의 행과 열의 합을 비교 하여 큰 값을 tmp에 대입
			tmp = sumRow > sumCol ? sumRow : sumCol;
			// 이전 행과 열의 비교 값 과 
			// 현재 행과 열의 비교 합 중 더 큰 값을 tmp2에 대입
			tmp2 = tmp > tmp2 ? tmp : tmp2;
			
		}
		
		// 두 대각선 중 더 큰값을 result에 대입
		result = sumCro > sumRevCro ? sumCro : sumRevCro;
		// 모든 행과 열의 비교 값 중 제일 큰 값과 두 대각 선중 더 큰 값과 비교
		result = result > tmp2 ? result : tmp2;
		
		return result;
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int arr[][] = new int[n][n];
		
		for(int i = 0; i<n; i++) {
			
			for(int j = 0; j<n; j++) {
				
				arr[i][j] = sc.nextInt();
				
			}
			
		}
		System.out.println(GridMaxSum_09.solution(n, arr));
		
	}

}
