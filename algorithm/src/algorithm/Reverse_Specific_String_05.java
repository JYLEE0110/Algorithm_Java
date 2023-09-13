package algorithm;

//����
//
//���� ���ĺ��� Ư�����ڷ� ������ ���ڿ��� �־����� ���� ���ĺ��� ������,
//
//Ư�����ڴ� �ڱ� �ڸ��� �״�� �ִ� ���ڿ��� ����� ����ϴ� ���α׷��� �ۼ��ϼ���.
//
//
//�Է�
//ù �ٿ� ���̰� 100�� ���� �ʴ� ���ڿ��� �־����ϴ�.
//
//
//���


import java.util.Scanner;

public class Reverse_Specific_String_05 {
	
	public String solution(String str) {
		
		char[] newStr = str.toCharArray();
		
		// �ܾ��� ù��° index
		int lt = 0;
		
		// �ܾ��� ��������° index
		int rt = str.length()-1;
		
		// index�� lt�� ������ ���� �ݺ�
		while(lt<rt) {
			
			// ���� ���� ���ĺ��� �ƴҰ�� lt�� ����
			if(!Character.isAlphabetic(newStr[lt])) {
				lt++;
			// ���� ���� ��Ұ� ���ĺ��� �ƴҰ�� rt�� ����
			}else if(!Character.isAlphabetic(newStr[rt])) {
				rt--;
			// ���� ���� �Ѵ� ���ĺ��� ��� Swap �� lt���� rt����
			}else {
				char tmp = newStr[lt];
				newStr[lt] = newStr[rt];
				newStr[rt] = tmp;
				lt++;
				rt--;
			}
			
		}
		
		// char�� String����  ��ȯ
		return String.valueOf(newStr);
		
	}


	public static void main(String[] args) {
		
		Reverse_Specific_String_05 t = new Reverse_Specific_String_05();
		
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		
		System.out.println(t.solution(str));
		
	}

}
