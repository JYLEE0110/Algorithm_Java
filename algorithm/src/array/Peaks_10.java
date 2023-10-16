package array;

//���� ������ N*N �����ǿ� �־����ϴ�. �� ���ڿ��� �� ������ ���̰� �����ֽ��ϴ�.
//
//�� �������� ���� �� �ڽ��� �����¿� ���ں��� ū ���ڴ� ���츮 �����Դϴ�. ���츮 ������ �� �� �ִ� �� �˾Ƴ��� ���α׷��� �ۼ��ϼ���.
//
//������ �����ڸ��� 0���� �ʱ�ȭ �Ǿ��ٰ� �����Ѵ�.
//
//���� N=5 �̰�, �������� ���ڰ� ������ ���ٸ� ���츮�� ������ 10���Դϴ�.
//
//Image1.jpg
//
//
//�Է�
//ù �ٿ� �ڿ��� N�� �־�����.(2<=N<=50)
//
//�� ��° �ٺ��� N�ٿ� ���� �� �ٿ� N���� �ڿ����� �־�����. �� �ڿ����� 100�� ���� �ʴ´�.
//
//
//���
//���츮�� ������ ����ϼ���.

import java.util.Arrays;
import java.util.Scanner;

public class Peaks_10 {

	static int solution(int n, int[][] arr) {
		
		int cnt = 0;
		
		for(int i=1; i <= n; i++) {
			
			for(int j = 1; j <= n; j++) {

				int target = arr[i][j];
				
				// target�� �� �� �� �� �� ū ���� ã�� ���׿�����.
				int up = target > arr[i-1][j] ? target : arr[i-1][j];
				int down = target > arr[i+1][j] ? target : arr[i+1][j];
				int left = target > arr[i][j-1] ? target : arr[i][j-1];
				int right = target > arr[i][j+1] ? target : arr[i][j+1];
				
				// �� �� �� �� ��� target�� ��� cnt �� ����
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
