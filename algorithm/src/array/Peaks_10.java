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

		int[] dx = {-1,0,1,0};
		int[] dy = {0,1,0,-1};
		
		int cnt = 0;
		
		for(int i = 0; i<n; i++) {
			
			for(int j = 0; j<n; j++) {
				
				boolean isPeak = true;

				for(int z = 0; z<4; z++) {
					
					int nx = i + dx[z];
					int ny = j + dy[z];
					
					// nx�� 0�̻� n�̸� / ny�� 0�̻�  n�̸� �϶� �˻� => �����ڸ��� �� ���ϰ� ���� z ��
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
