package algorithm;


//����
//
//�ҹ��ڷ� �� �Ѱ��� ���ڿ��� �ԷµǸ� �ߺ��� ���ڸ� �����ϰ� ����ϴ� ���α׷��� �ۼ��ϼ���.
//
//�ߺ��� ���ŵ� ���ڿ��� �� ���ڴ� ���� ���ڿ��� ������ �����մϴ�.
//
//
//�Է�
//ù �ٿ� ���ڿ��� �Էµ˴ϴ�. ���ڿ��� ���̴� 100�� ���� �ʴ´�.
//
//
//���
//ù �ٿ� �ߺ����ڰ� ���ŵ� ���ڿ��� ����մϴ�.




import java.util.ArrayList;
import java.util.Scanner;

public class Remove_Duplicate_Char_06 {

	public String solution(String str) {

		String result = "";

		for (int i = 0; i < str.length(); i++) {

			// str.charAt(i) => i��°�� ���� 1���� ����
			// str.indexOf() => ������ index ��ȣ ����
			// i�� �� => �ߺ� �� ��� str.indexOf�� i�� �ٸ���.
 			if (i == str.indexOf(str.charAt(i))) {

				result += str.charAt(i);

			}

		}

		return result;

	}

	public static void main(String[] args) {

		Remove_Duplicate_Char_06 t = new Remove_Duplicate_Char_06();

		Scanner sc = new Scanner(System.in);

		String str = sc.nextLine();

		System.out.println(t.solution(str));

	}

}
