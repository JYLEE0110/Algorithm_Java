package array;

import java.util.Arrays;
import java.util.Scanner;

public class Mentoring_12 {

	static int solution(int n, int m, int[][] arr) {

		int result = 0;

		// �л� �� n * n ��ŭ ��� �� �� �� üũ�ؾ��Ѵ�. => ����� ��
		// i�� ����, j�� ��Ƽ
		for (int i = 1; i <= n; i++) {
			
			for (int j = 1; j <= n; j++) {
				
				int cnt = 0;
				// �־��� �迭���� i, j �� ����� üũ �ϱ� ���� 2�� for��
				for (int x = 0; x < m; x++) {

					int pi = 0;
					int pj = 0;

					for (int y = 0; y < n; y++) {
						
						// i�� j�� ����� ����
						if (i == arr[x][y]) {
							pi = y;
						}
						if (j == arr[x][y]) {
							pj = y;
						}
					}
					// i�� ��� ����j�� ����� Ŭ ���(i = 3�� j = 4�� �Ͻ� 4�� �� ŭ)
					if (pi < pj) {
						cnt++;
					}
				}

				if (cnt == m) {
					result++;
				}
			}

		}

		return result;

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt();

		int[][] arr = new int[m][n];

		for (int i = 0; i < m; i++) {

			for (int j = 0; j < n; j++) {

				int num = sc.nextInt();

				arr[i][j] = num;

			}

		}
		System.out.println(Mentoring_12.solution(n, m, arr));

	}

}
