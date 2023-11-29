package twopointers;

//����
//
//0�� 1�� ������ ���̰� N�� ������ �־����ϴ�. �������� �� �������� �ִ� k���� 0�� 1�� ������ �� �ֽ��ϴ�. �������� �ִ� k���� ������ ���� �� �������� 1�θ� ������ �ִ� ������ ���Ӻκм����� ã�� ���α׷��� �ۼ��ϼ���.
//
//���� ���̰� ���̰� 14�� ������ ���� ������ �־����� k=2���
//
//1 1 0 0 1 1 0 1 1 0 1 1 0 1
//
//�������� ���� �� �ִ� 1�� ���ӵ� ���Ӻκм�����
//
//Image1.jpg
//
//�̸� �� ���̴� 8�Դϴ�.
//
//
//�Է�
//ù ��° �ٿ� ������ ������ �ڿ��� N(5<=N<100,000)�� �־����ϴ�.
//
//�� ��° �ٿ� N������ 0�� 1�� ������ ������ �־����ϴ�.
//
//
//���
//ù �ٿ� �ִ� ���̸� ����ϼ���.

import java.util.Scanner;

public class MaximumLengthSequence {
	
	static int solution(int n, int k, int[] arr) {
		
		int lt = 0;
		int rt = 0;
		int result = 0;
		int cnt = 0;
		
		// rt�� n �����ϴ� ���� for���� ����.
		for(; rt < n; rt++) {
			
			// ���� 0�� ������ cnt�� ���� ��Ų��.
			// �־��� k���� cnt�� Ŀ�� �ϴ� ���� ��Ų��. => while������ �ɸ�
			if(arr[rt] == 0) {
				cnt++;
			}
			
			// 1. cnt�� �־��� k���� Ŭ�� 
			while(cnt > k) {
				// 3. lt�� ��� �������� 0�϶� cnt�� ���� ��Ų��.
				if(arr[lt] == 0 ) {
					cnt--;
				}
				// 2. lt�� ��� ������Ų��.
				lt++;
			}
			// ���� �� ���̸� ��ȯ �Ѵ�.
			result = result > rt-lt+1 ? result : rt-lt+1;
			
		}
		
		return result;
		
	}
		

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int k = sc.nextInt();
		
		int[] arr = new int[n];
		
		for(int i = 0; i < n; i++) {
			
			arr[i] = sc.nextInt();
			
		}
		
		System.out.println(MaximumLengthSequence.solution(n, k, arr));

	}

}
