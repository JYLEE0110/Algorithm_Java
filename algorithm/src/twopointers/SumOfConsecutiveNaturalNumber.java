package twopointers;

/*����

N�Է����� ���� ���� N�� �ԷµǸ� 2�� �̻��� ���ӵ� �ڿ����� ������ ���� N�� ǥ���ϴ� ����� �������� ����ϴ� ���α׷��� �ۼ��ϼ���.

���� N=15�̸�

7+8=15

4+5+6=15

1+2+3+4+5=15

�� ���� �� 3������ ��찡 �����Ѵ�.


�Է�
ù ��° �ٿ� ���� ���� N(7<=N<1000)�� �־����ϴ�.


���
ù �ٿ� �� ������ ����մϴ�.*/

import java.util.Arrays;
import java.util.Scanner;

public class SumOfConsecutiveNaturalNumber {
	
	static int solution(int n, int[] arr, int m) {
		
		int lt = 0;
		int rt = 0;
		int sum = 0;
		int cnt = 0;
		
		for(;rt < m; rt++) {
			
			sum += arr[rt];
			
			while(sum > n) {
				
				sum -= arr[lt];
				lt++;
			}
			if(sum == n) {
				cnt++;
			}
			
		}
		return cnt;
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		// �־��� n���� n/2+1 ������ ���� �ȴ�.
		// n�� 15�� �� 8���� ������. => 9���ʹ� 15�� �ʰ��Ѵ�.
		int m = n/2 + 1;
		
		for(int i = 0; i < m; i++) {
			
			arr[i] = i+1;
			
		}
		
		System.out.println(SumOfConsecutiveNaturalNumber.solution(n, arr, m));
		
	}

}
