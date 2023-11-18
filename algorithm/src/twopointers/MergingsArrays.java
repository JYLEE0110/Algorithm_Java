package twopointers;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MergingsArrays {

	static ArrayList<Integer> solution(int n, int m, int[] arr, int[] arr2) {

		ArrayList<Integer> list = new ArrayList<>();

		int p1 = 0;
		int p2 = 0;

		while (p1<n && p2 <m) {

			if (arr[p1] < arr2[p2]) {
				list.add(arr[p1]);
				p1++;
			} else {
				list.add(arr2[p2]);
				p2++;
			}
		}
		
		while(p1<n) {
			list.add(arr[p1]);
			p1++;
		}
		while(p2<m) {
			list.add(arr2[p2]);
			p2++;
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
		int[] arr2 = new int[m];

		for (int i = 0; i < m; i++) {

			arr2[i] = sc.nextInt();

		}

		for (int result : MergingsArrays.solution(n, m, arr, arr2)) {
			System.out.print(result + " ");
		}

	}

}
