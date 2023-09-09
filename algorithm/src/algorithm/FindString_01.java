package algorithm;

//����
//
//�� ���� ���ڿ��� �Է¹ް�, Ư�� ���ڸ� �Է¹޾� �ش� Ư�����ڰ� �Է¹��� ���ڿ��� �� �� �����ϴ��� �˾Ƴ��� ���α׷��� �ۼ��ϼ���.
//
//��ҹ��ڸ� �������� �ʽ��ϴ�.���ڿ��� ���̴� 100�� ���� �ʽ��ϴ�.
//
//
//�Է�
//ù �ٿ� ���ڿ��� �־�����, �� ��° �ٿ� ���ڰ� �־�����.
//
//���ڿ��� ���� ���ĺ����θ� �����Ǿ� �ֽ��ϴ�.


import java.util.Scanner;

public class FindString_01 {

	private int count = 0;

	public int solution(String inputStr, char inputCh) {
		
		if(inputStr.length() > 100) {
			System.out.println("Error : ���ڿ��� �ִ� ���̴� 100�Դϴ�.");
			return -1;
		}

		inputStr = inputStr.toUpperCase();
		inputCh = Character.toUpperCase(inputCh);

		for (int i = 0; i < inputStr.length(); i++) {

			if (inputStr.charAt(i) == inputCh) {
				count++;
			}
		}

		return count;

	}

	public static void main(String[] args) {

		FindString_01 findString = new FindString_01();

		String inputStr;
		char inputCh;

		Scanner sc = new Scanner(System.in);

		inputStr = sc.nextLine();
		inputCh = sc.next().charAt(0);
		
		int result = findString.solution(inputStr, inputCh);
		System.out.println(result);

	}

}
