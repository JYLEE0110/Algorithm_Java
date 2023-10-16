package array;

//지도 정보가 N*N 격자판에 주어집니다. 각 격자에는 그 지역의 높이가 쓰여있습니다.
//
//각 격자판의 숫자 중 자신의 상하좌우 숫자보다 큰 숫자는 봉우리 지역입니다. 봉우리 지역이 몇 개 있는 지 알아내는 프로그램을 작성하세요.
//
//격자의 가장자리는 0으로 초기화 되었다고 가정한다.
//
//만약 N=5 이고, 격자판의 숫자가 다음과 같다면 봉우리의 개수는 10개입니다.
//
//Image1.jpg
//
//
//입력
//첫 줄에 자연수 N이 주어진다.(2<=N<=50)
//
//두 번째 줄부터 N줄에 걸쳐 각 줄에 N개의 자연수가 주어진다. 각 자연수는 100을 넘지 않는다.
//
//
//출력
//봉우리의 개수를 출력하세요.

import java.util.Arrays;
import java.util.Scanner;

public class Peaks_10 {

	static int solution(int n, int[][] arr) {
		
		int cnt = 0;
		
		for(int i=1; i <= n; i++) {
			
			for(int j = 1; j <= n; j++) {

				int target = arr[i][j];
				
				// target과 상 하 좌 우 중 큰 값을 찾는 삼항연산자.
				int up = target > arr[i-1][j] ? target : arr[i-1][j];
				int down = target > arr[i+1][j] ? target : arr[i+1][j];
				int left = target > arr[i][j-1] ? target : arr[i][j-1];
				int right = target > arr[i][j+1] ? target : arr[i][j+1];
				
				// 상 하 좌 우 모두 target일 경우 cnt 값 증가
//				if(target == up && target ==down && target == left && target == right) {
//					cnt++;
//				}
				if(target > arr[i-1][j] && target > arr[i+1][j] && target > arr[i][j-1] && target > arr[i][j+1]) {
					cnt++;
				}
				
			}
		}
		
		return cnt;
		
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int[][] arr = new int[n+2][n+2];
		
		for(int i = 1; i <= n; i++) {
			
			for(int j = 1; j <= n; j++) {
				
				int num = sc.nextInt();
				
				arr[i][j] = num;
				
			}
			
		}
		
		System.out.println(Peaks_10.solution(n,arr));

	}

}
