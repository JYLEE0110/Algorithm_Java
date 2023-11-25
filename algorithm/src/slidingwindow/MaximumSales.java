package slidingwindow;


/*����

������ �ƺ��� �������� ��մϴ�. ���� �ƺ��� �������� N�� ������ �������� �ְ� ���ӵ� K�� ������ �ִ� ������� ������ ���϶�� �߽��ϴ�.

���� N=10�̰� 10�� ���� �������� �Ʒ��� �����ϴ�. �̶� K=3�̸�

12 1511 20 2510 20 19 13 15

���ӵ� 3�ϰ��� �ִ� ������� 11+20+25=56�����Դϴ�.

�������� ������ �����ּ���.


�Է�
ù �ٿ� N(5<=N<=100,000)�� K(2<=K<=N)�� �־����ϴ�.

�� ��° �ٿ� N���� ���ڿ��� �־����ϴ�. �� ���ڴ� 500������ ���� �ƴ� �����Դϴ�.


���
ù �ٿ� �ִ� ������� ����մϴ�.*/

import java.util.Scanner;

public class MaximumSales {
	
	static int solution(int n, int k, int[] arr) {
		
		int p1 = 1;
		int sum = 0;
		int max = 0;
		
		for(int i = 0; i < k; i++) {
			
			sum += arr[i];
			
		}
		
		// ���� ���� max�� ����
		max = sum;
		
		// ���� p[0] + p[1] + p[2] .... �� ����
		// p[1] + p[2] ... ����
		while(p1 < n-k+1) {
			
			sum = sum - arr[p1-1] + arr[p1+k-1] ;
			p1++;
			max = max > sum ? max : sum;
			
		}
		
		return max;
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] arr = new int[n];
		
		
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println(MaximumSales.solution(n, k, arr));

	}

}
