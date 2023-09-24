package algorithm;

//����
//
//������ ���񿡰� ���ĺ� �빮�ڷ� ������ ��������� ���� ��ǻ�͸� �̿��� �����ϴ�.
//
//��������� ������ ���� ���� ����� ��ȣ�� �����Ǿ� �ֽ��ϴ�.
//
//��������� ���ĺ� �� ���ڸ��� # �Ǵ� *�� �ϰ� ���� �����Ǿ� �ֽ��ϴ�.
//
//���� ������ ��#*****#������ ������ ���ڸ� ���´ٸ� ����� ������ ����� ��Ģ��� ������ ���� �ؼ��մϴ�.
//
//1. ��#*****#���� �ϰ��ڸ��� �������� �ٲߴϴ�. #�� �������� 1��, *�������� 0���� ��ȯ�մϴ�. ����� ��1000001���� ��ȯ�˴ϴ�.
//
//2. �ٲ� 2������ 10����ȭ �մϴ�. ��1000001���� 10����ȭ �ϸ� 65�� �˴ϴ�.
//
//3. �ƽ�Ű ��ȣ�� 65���ڷ� ��ȯ�մϴ�. �� �ƽ�ũ��ȣ 65�� �빮�� 'A'�Դϴ�.
//
//����� �빮�ڵ��� �ƽ�Ű ��ȣ�� 'A'�� 65��, ��B'�� 66��, ��C'�� 67�� �� ���ʴ�� 1�� �����Ͽ� ��Z'�� 90���Դϴ�.
//
//������ 4���� ���ڸ� ������ ���� ��ȣ�� ���´ٸ�
//
//#****###**#####**#####**##**
//
//�� ��ȣ�� 4���� ���ڽ�ȣ�� �����ϸ�
//
//#****## --> 'C'
//
//#**#### --> 'O'
//
//#**#### --> 'O'
//
//#**##** --> 'L'
//
//���������� ��COOL"�� �ؼ��˴ϴ�.
//
//������ ���� ��ȣ�� �ؼ����ִ� ���α׷��� �ۼ��ؼ� ���� �����ּ���.
//
//
//�Է�
//ù �ٿ��� ���� ������ ����(10�� ���� �Ƚ��ϴ�)�� �Էµȴ�. ���� �ٿ��� ������ ������ �ϰ� �� ��ŭ�� #�Ǵ� * ��ȣ�� �Էµ˴ϴ�.
//
//������ �׻� �빮�ڷ� �ؼ��� �� �ִ� ��ȣ�� �����ٰ� �����մϴ�.
//
//
//���
//���� �ؼ��� ���ڿ��� ����մϴ�.

import java.util.ArrayList;
import java.util.Scanner;

public class Ascii_12 {

	public String solution(int n, String str) {
	
		int len = n * 7;
		String resultStr = "";
		if(str.length() != len) {
			System.out.println("������ ������ �Է� ���ǰ� �����մϴ�.");
		}else {
			
			str = str.replace('#', '1');
			str = str.replace('*', '0');
		}
		for(int i = 0; i < n; i++) {
			String newStr = str.substring(i*7, (i+1)*7);
			int result = 0;
//			System.out.println(newStr);
			for(int j = newStr.length()-1; j>=0; j--) {
				if(newStr.charAt(j) == '1') {
					int jAbs = Math.abs(j-6); 
//					System.out.println(jAbs);
					result += (int)(Math.pow(2, jAbs));
				}
			}
			
//			System.out.println((char)result);
			resultStr += (char)result;
		}
		return resultStr;
		
	}
	
	public static void main(String[] args) {

		Ascii_12 t = new Ascii_12();
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		String str = sc.next();

		System.out.println(t.solution(n, str));
		
	}

}
