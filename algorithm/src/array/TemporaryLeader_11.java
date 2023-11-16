package array;

import java.util.Arrays;
import java.util.Scanner;

public class TemporaryLeader_11 {

	static int solution(int n, int[][] arr) {
		
		int max = 0;
		int result = 1;
		
		// ó�� for���� i�� count�� �л� (��)
		// �ι��� for���� j�� count�� �л��� �� ��� (��)
		// ������ for���� �г� (��)
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
			// max�� cnt�� ���� �� �տ� �л��� �����̹Ƿ� max�� cnt �̸�
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
				
				int x = sc.nextInt(); // 1 ~ 5�г� �� �� �� ������ ���� �Է� ��
				arr[i][j] = x;
			}
		}
		System.out.println(TemporaryLeader_11.solution(n, arr));
	}

}
