package algorithm;

//����
//
//���ڿ� ���ڰ� �����ִ� ���ڿ��� �־����� �� �� ���ڸ� �����Ͽ� �� ������� �ڿ����� ����ϴ�.
//
//���� ��tge0a1h205er������ ���ڸ� �����ϸ� 0, 1, 2, 0, 5�̰� �̰��� �ڿ����� ����� 1205�� �˴ϴ�.
//
//�����Ͽ� ��������� �ڿ����� 100,000,000�� ���� �ʽ��ϴ�.
//
//
//�Է�
//ù �ٿ� ���ڰ� ���� ���ڿ��� �־����ϴ�. ���ڿ��� ���̴� 100�� ���� �ʽ��ϴ�.
//
//
//���
//ù �ٿ� �ڿ����� ����մϴ�.

import java.util.Scanner;

public class Extract_Number09 {

	public int solution(String str) {
		
		str = str.replaceAll("[^0-9]", "");
		
		int n = Integer.parseInt(str);
		
		return n;
		
	}
	
	
	public static void main(String[] args) {
		
		Extract_Number09 t = new Extract_Number09();
		
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		
		System.out.println(t.solution(str));
		
		
	}

}
