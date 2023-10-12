package array;

//����
//
//�ڿ��� N�� �ԷµǸ� 1���� N������ �Ҽ��� ������ ����ϴ� ���α׷��� �ۼ��ϼ���.
//
//���� 20�� �ԷµǸ� 1���� 20������ �Ҽ��� 2, 3, 5, 7, 11, 13, 17, 19�� �� 8���Դϴ�.
//
//
//�Է�
//ù �ٿ� �ڿ����� ���� N(2<=N<=200,000)�� �־����ϴ�.
//
//
//���
//ù �ٿ� �Ҽ��� ������ ����Ͻÿ�.


import java.util.Scanner;

public class PrimeNumber05 {

	static int solution(int n) {
		
		int cnt = 0;
		
		int[] num = new int[n+1];
		
		for(int i = 2; i<=n; i++) {
			
			if(num[i] == 0) {
				
				cnt++;
				for(int j = i; j<=n;j+=i) {
					num[j] = 1;
				}
				
			}
			
		}
		
		return cnt;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		System.out.println(PrimeNumber05.solution(n));

	}

}
