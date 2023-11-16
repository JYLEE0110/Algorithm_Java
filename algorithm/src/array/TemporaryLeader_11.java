package array;

import java.util.Arrays;
import java.util.Scanner;

public class TemporaryLeader_11 {

	static int solution(int n, int[][] arr) {
		
		int max = 0;
		int result = 1;
		
		// 처음 for문의 i는 count할 학생 (행)
		// 두번쨰 for문의 j는 count할 학생의 비교 대상 (행)
		// 세번쨰 for문은 학년 (열)
		for(int i = 1; i<=n; i++) {
			
			int cnt = 0;
			
			for(int j = 1; j<=n; j++) {
				
				for(int x = 1; x<=5; x++) {
					
					if(arr[i][x] == arr[j][x]) {
						cnt++;
						break;
					}
					
				}
			}
			// max와 cnt가 같을 때 앞에 학생이 반장이므로 max가 cnt 미만
			if(max < cnt) {
				
				max = cnt;
				result = i;
				
			}
			
		}
		
		return result;
		
	}
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int[][] arr = new int[n+1][6];
		
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j<=5; j++) {
				
				int x = sc.nextInt(); // 1 ~ 5학년 때 몇 반 인지에 대한 입력 값
				arr[i][j] = x;
			}
		}
		System.out.println(TemporaryLeader_11.solution(n, arr));
	}

}
