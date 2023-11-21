package twopointers;

//����
//
//A, B �� ���� ������ �־����� �� ������ ���� ���Ҹ� �����Ͽ� ������������ ����ϴ� ���α׷��� �ۼ��ϼ���.
//
//
//�Է�
//ù ��° �ٿ� ���� A�� ũ�� N(1<=N<=30,000)�� �־����ϴ�.
//
//�� ��° �ٿ� N���� ���Ұ� �־����ϴ�. ���Ұ� �ߺ��Ǿ� �־����� �ʽ��ϴ�.
//
//�� ��° �ٿ� ���� B�� ũ�� M(1<=M<=30,000)�� �־����ϴ�.
//
//�� ��° �ٿ� M���� ���Ұ� �־����ϴ�. ���Ұ� �ߺ��Ǿ� �־����� �ʽ��ϴ�.
//
//�� ������ ���Ҵ� 1,000,000,000������ �ڿ����Դϴ�.
//
//
//���
//�� ������ ������Ҹ� �������� �����Ͽ� ����մϴ�.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class CommonElements {

	static ArrayList<Integer> solution(int n, int m, int[] arr, int[] arr2) {

		ArrayList<Integer> list = new ArrayList<>();

		Arrays.sort(arr);
		Arrays.sort(arr2);

		int p1 = 0;
		int p2 = 0;

		while (p1 < n && p2 < m) {

			if (arr[p1] == arr2[p2]) {
				list.add(arr[p1]);
				p1++;
				p2++;
			} else if (arr[p1] < arr2[p2]) {
				p1++;
			} else {
				p2++;
			}

		}
		return list;

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {

			arr[i] = sc.nextInt();

		}

		int m = sc.nextInt();
		int[] arr2 = new int[n];

		for (int i = 0; i < m; i++) {

			arr2[i] = sc.nextInt();

		}

		for (int result : CommonElements.solution(n, m, arr, arr2)) {
			System.out.print(result + " ");
		}
	}

}
