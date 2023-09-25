package string;

//����
//
//�տ��� ���� ���� �ڿ��� ���� ���� ���� ���ڿ��� �Ӹ�����̶�� �մϴ�.
//
//���ڿ��� �ԷµǸ� �ش� ���ڿ��� �Ӹ�����̸� "YES", �ƴϸ� ��NO"�� ����ϴ� ���α׷��� �ۼ��ϼ���.
//
//�� ȸ���� �˻��� �� ���ĺ��� ������ ȸ���� �˻��ϸ�, ��ҹ��ڸ� �������� �ʽ��ϴ�.
//
//���ĺ� �̿��� ���ڵ��� �����մϴ�.
//
//
//�Է�
//ù �ٿ� ���� 100�� ���� �ʴ� ������ ���� ���ڿ��� �־����ϴ�.
//
//
//���
//ù ��° �ٿ� �Ӹ���������� ����� YES �Ǵ� NO�� ����մϴ�.

import java.util.Scanner;

public class Palindrome_String2_08 {

	public String solution(String str) {
		
		str = str.toUpperCase();
		
		int len = str.length();
		String result = "YES";
		
		int lt = 0;
		int rt = len - 1;
		
		while(lt < rt) {
			
			if(!Character.isAlphabetic(str.charAt(lt))) {
				lt ++;
			}else if(!Character.isAlphabetic(str.charAt(rt))) {
				rt --;
			}else {
				if(str.charAt(lt) != str.charAt(rt)) {
					return "NO";
				}
				lt++;
				rt--;
			}
			
		}
		
		return result;
		
	}
	
	public String solution2(String str) {
		
		// ���� ǥ�������� ���ĺ��� �ƴ� ���ڵ��� ó��
		// replaceAll�� ���� ǥ���� ��� ����
		str = str.replaceAll("[^A-Za-z]", "");
		
		String result = "YES";
		
		// StringBuilder�� ���ڿ��� �����´�.
		String tmp = new StringBuilder(str).reverse().toString();
		
		// �� �ҹ��� �������ϰ� ��
		if(!str.equalsIgnoreCase(tmp)) {
			result = "NO";
		}
		
		return result;
		
	}
	
	public static void main(String[] args) {

		Palindrome_String2_08 t = new Palindrome_String2_08();
		
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		
		System.out.println(t.solution2(str));
		
	}

}
