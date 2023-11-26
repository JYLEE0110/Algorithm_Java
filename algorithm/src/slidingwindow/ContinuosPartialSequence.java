package slidingwindow;

/*����

N���� ���� �̷���� ������ �־����ϴ�.

�� �������� ���Ӻκм����� ���� Ư������ M�� �Ǵ� ��찡 �� �� �ִ��� ���ϴ� ���α׷��� �ۼ��ϼ���.

���� N=8, M=6�̰� ������ ������ ���ٸ�

1 2 1 3 1 1 1 2

���� 6�� �Ǵ� ���Ӻκм����� {2, 1, 3}, {1, 3, 1, 1}, {3, 1, 1, 1}�� �� 3�����Դϴ�.


�Է�
ù° �ٿ� N(1��N��100,000), M(1��M��100,000,000)�� �־�����.

������ ���Ұ��� 1,000�� ���� �ʴ� �ڿ����̴�.


���
ù° �ٿ� ����� ���� ����Ѵ�.*/

import java.util.Scanner;

public class ContinuosPartialSequence {

	static int solution(int n, int m, int[] arr) {
		
		int lt = 0;
		int rt = 0;
		int cnt = 0;
		int sum = 0;
		
		 
		for(; rt < n; rt++) {
			
			// lt ~ rt�� ���� ���� sum
			sum = sum + arr[rt];
			
			// sum�� �־��� M�̶�� cnt�� ����
			// sum�� m�� ���� �� ���� �״�� rt�� ���� ��Ų�� => ���� for������ ������ sum > m�� �ɸ�
			if(sum == m) {
				cnt++;
			}
			
			// sum�� �־��� M���� Ŭ �� sum���� lt�� ���� lt�� ����
			// sum�� M���� �۾��������� �ݺ�
			while(sum > m) {
				sum = sum - arr[lt];
				lt++;
				
				// ���� lt�� ���� ��Ű�� ���� sum���� M�� ���ٸ� cnt ����
				if(sum == m) {
					cnt++;
				}
				
			}
			
		}
		
		return cnt;
	}
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		int[] arr = new int[n];
		
		for(int i = 0; i < n; i++) {
			
			arr[i] = sc.nextInt();
			
		}
		
		System.out.println(ContinuosPartialSequence.solution(n, m, arr));
		
	}

}
