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

		int[] dx = {-1,0,1,0};
		int[] dy = {0,1,0,-1};
		
		int cnt = 0;
		
		for(int i = 0; i<n; i++) {
			
			for(int j = 0; j<n; j++) {
				
				boolean isPeak = true;

				for(int z = 0; z<4; z++) {
					
					int nx = i + dx[z];
					int ny = j + dy[z];
					
					// nx가 0이상 n미만 / ny가 0이상  n미만 일때 검사 => 가장자리는 비교 안하고 다음 z 비교
					if( (nx>=0 && nx<n) && (ny>=0 && ny < n) && (arr[nx][ny] >= arr[i][j])) {
						isPeak = false;
						break;
					}
				}
				if(isPeak) {
					cnt++;
				}
				
			}
			
		}
		
		return cnt;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int[][] arr = new int[n][n];

		for (int i = 0; i < n; i++) {

			for (int j = 0; j < n; j++) {

				int num = sc.nextInt();

				arr[i][j] = num;
			}

		}
		System.out.println(Peaks_10.solution(n, arr));

	}

}
