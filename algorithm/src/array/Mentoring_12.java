package array;

import java.util.Arrays;
import java.util.Scanner;

public class Mentoring_12 {

	static int solution(int n, int m, int[][] arr) {

		int result = 0;

		// 학생 수 n * n 만큼 경우 의 수 를 체크해야한다. => 경우의 수
		// i는 멘토, j는 멘티
		for (int i = 1; i <= n; i++) {
			
			for (int j = 1; j <= n; j++) {
				
				int cnt = 0;
				// 주어진 배열에서 i, j 의 등수를 체크 하기 위한 2주 for문
				for (int x = 0; x < m; x++) {

					int pi = 0;
					int pj = 0;

					for (int y = 0; y < n; y++) {
						
						// i와 j의 등수를 구함
						if (i == arr[x][y]) {
							pi = y;
						}
						if (j == arr[x][y]) {
							pj = y;
						}
					}
					// i의 등수 보다j의 등수가 클 경우(i = 3등 j = 4등 일시 4가 더 큼)
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
