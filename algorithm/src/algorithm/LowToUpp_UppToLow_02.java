package algorithm;


//����
//�빮�ڿ� �ҹ��ڰ� ���� �����ϴ� ���ڿ��� �Է¹޾� �빮�ڴ� �ҹ��ڷ� �ҹ��ڴ� �빮�ڷ� ��ȯ�Ͽ� ����ϴ� ���α׷��� �ۼ��ϼ���.
//
//
//�Է�
//ù �ٿ� ���ڿ��� �Էµȴ�. ���ڿ��� ���̴� 100�� ���� �ʽ��ϴ�.
//���ڿ��� ���� ���ĺ����θ� �����Ǿ� �ֽ��ϴ�.
//
//
//���
//ù �ٿ� �빮�ڴ� �ҹ��ڷ�, �ҹ��ڴ� �빮�ڷ� ��ȯ�� ���ڿ��� ����մϴ�.

import java.util.Scanner;

public class LowToUpp_UppToLow_02 {

	public String solution(String str){
		
		String newStr = "";
		
		if(str.length() > 100) {
			return "�Է��� ���ڱ��̴� 100�ڰ� �ִ��Դϴ�.";
		}
		
		for(char result : str.toCharArray()) {
			// ���׿����ڷ� ���� 1���� ���Ͽ� newStr�� �߰��Ͽ� ��ȯ�Ѵ�.
			result = Character.isLowerCase(result) ? Character.toUpperCase(result) : Character.toLowerCase(result);
			newStr += result;
		}
		
		return newStr;
		
	}
	
	public static void main(String[] args) {
		
		LowToUpp_UppToLow_02 result = new LowToUpp_UppToLow_02();
		
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		
		System.out.println(result.solution(str));

	}

}
