package array;

//����
//
//A, B �� ����� ���������� ������ �մϴ�. �� N���� ������ �Ͽ� A�� �̱�� A�� ����ϰ�, B�� �̱�� B�� ����մϴ�. ��� ��쿡�� D�� ����մϴ�.
//
//����, ����, ���� ������ 1:����, 2:����, 3:���� ���ϰڽ��ϴ�.
//
//�� ����� �� ȸ�� ����, ����, �� ������ �־����� �� ȸ�� ���� �̰���� ����ϴ� ���α׷��� �ۼ��ϼ���.
//
//
//�Է�
//ù ��° �ٿ� ���� Ƚ���� �ڿ��� N(1<=N<=100)�� �־����ϴ�.
//
//�� ��° �ٿ��� A�� �� ����, ����, �� ������ N�� �־����ϴ�.
//
//�� ��° �ٿ��� B�� �� ����, ����, �� ������ N�� �־����ϴ�.
//
//
//���
//�� �ٿ� �� ȸ�� ���ڸ� ����մϴ�. ����� ���� D�� ����մϴ�.

import java.util.ArrayList;
import java.util.Scanner;

public class RockPaperScissors_03 {
	
	public ArrayList<Character> solution(int a[], int b[]){
		
		ArrayList<Character> result = new ArrayList<>();
		
		for(int i = 0; i<a.length; i++) {
			
			if(a[i] - b[i] == 1) {
				result.add('A');
			}else if(a[i] - b[i] == 2) {
				result.add('B');
			}else if(b[i] - a[i] == 1) {
				result.add('B');
			}else if(b[i] - a[i] == 2) {
				result.add('A');
			}else {
				result.add('D');
			}
			
		}
		
		return result;
	}

	public static void main(String[] args) {
		
		RockPaperScissors_03 t = new RockPaperScissors_03();
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int a[] = new int[n];
		int b[] = new int[n];
		
		for(int i = 0; i < n; i++) {
			
			a[i] = sc.nextInt();
			
		}
		for(int i = 0; i < n; i++) {
			
			b[i] = sc.nextInt();
			
		}
		
		for(char result : t.solution(a, b)) {
			System.out.println(result);
		}
		

	}

}
