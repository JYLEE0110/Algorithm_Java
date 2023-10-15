package array;

//5*5 �����ǿ� �Ʒ��� ���� ���ڰ� �����ֽ��ϴ�.
//
//Image1.jpg
//
//N*N�� �������� �־����� �� ���� ��, �� ���� ��, �� �밢���� �� �� �� �� ū ���� ����մϴ�.
//
//
//�Է�
//ù �ٿ� �ڿ��� N�� �־�����.(2<=N<=50)
//
//�� ��° �ٺ��� N�ٿ� ���� �� �ٿ� N���� �ڿ����� �־�����. �� �ڿ����� 100�� ���� �ʴ´�.
//
//
//���
//�ִ����� ����մϴ�.

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
			
			// ��� �� �ݺ����� ������ ���� 0���� �ʱ�ȭ
			int sumRow = 0;
			int sumCol = 0;
			
			for(int j = 0; j<n; j++) {
				
				// ��� ���� ������ ��
				sumRow += arr[i][j];
				sumCol += arr[j][i];
				
				if(i == j) {
					sumCro+=arr[i][j];
				}
				if(i+j == n-1) {
					sumRevCro += arr[i][j];
				}
			}
			
			// ������ ��� ���� ���� �� �Ͽ� ū ���� tmp�� ����
			tmp = sumRow > sumCol ? sumRow : sumCol;
			// ���� ��� ���� �� �� �� 
			// ���� ��� ���� �� �� �� �� ū ���� tmp2�� ����
			tmp2 = tmp > tmp2 ? tmp : tmp2;
			
		}
		
		// �� �밢�� �� �� ū���� result�� ����
		result = sumCro > sumRevCro ? sumCro : sumRevCro;
		// ��� ��� ���� �� �� �� ���� ū ���� �� �밢 ���� �� ū ���� ��
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
