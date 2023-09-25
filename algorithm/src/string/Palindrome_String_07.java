package string;

//����
//
//�տ��� ���� ���� �ڿ��� ���� ���� ���� ���ڿ��� ȸ�� ���ڿ��̶�� �մϴ�.
//
//���ڿ��� �ԷµǸ� �ش� ���ڿ��� ȸ�� ���ڿ��̸� "YES", ȸ�� ���ڿ��� �ƴϸ� ��NO"�� ����ϴ� ���α׷��� �ۼ��ϼ���.
//
//�� ȸ���� �˻��� �� ��ҹ��ڸ� �������� �ʽ��ϴ�.
//
//
//�Է�
//ù �ٿ� ���� 100�� ���� �ʴ� ������ ���� ���ڿ��� �־����ϴ�.
//
//
//���
//ù ��° �ٿ� ȸ�� ���ڿ������� ����� YES �Ǵ� NO�� ����մϴ�.

import java.util.Scanner;

public class Palindrome_String_07 {

	public String solution(String str) {

		String newStr = str.toUpperCase();

		char[] ch = newStr.toCharArray();

		int lt = 0;
		int rt = str.length() - 1;
		int cnt = 0;
		String result = "";

		while (lt < rt) {

			if (ch[lt] != ch[rt]) {
				cnt++;
			}
			lt++;
			rt--;
		}
		result = cnt == 0 ? "YES" : "NO";

		return result;

	}
	
	public String solution2(String str) {
		
		str = str.toUpperCase();
		int len = str.length();
		
		for(int i = 0; i < len / 2; i++) {
			
			if(str.charAt(i) != str.charAt(len-i-1)) {
				
				return "NO";
				
			}
			
		}
		return "YES";
		
	}

	public static void main(String[] args) {

		Palindrome_String_07 t = new Palindrome_String_07();

		Scanner sc = new Scanner(System.in);

		String str = sc.nextLine();

		System.out.println(t.solution2(str));

	}

}
