package algorithm;

//����
//
//�� ���� ������ �־����� �� ���� �ӿ��� ���� �� �ܾ ����ϴ� ���α׷��� �ۼ��ϼ���.
//
//������� �� �ܾ�� �������� ���е˴ϴ�.
//
//
//�Է�
//ù �ٿ� ���̰� 100�� ���� �ʴ� �� ���� ������ �־����ϴ�. ������ ���� ���ĺ����θ� �����Ǿ� �ֽ��ϴ�.
//
//
//���
//ù �ٿ� ���� �� �ܾ ����Ѵ�. ���� ���̰� �� �ܾ �������� ��� ����ӿ��� ���� ���ʿ� ��ġ��

import java.util.Scanner;

public class The_Logest_Word_03 {

	public String solution(String word) {

		String result = "";

		String[] spWord = word.split(" ");

		for (String w : spWord) {

			result = w.length() > result.length() ? w : result;

		}

		return result;

	}

	public String solution2(String word) {

		String result = " ";

		int m = Integer.MIN_VALUE, pos;

		// �Է¹��� ���忡 ������ ���� ��� while�� ���� X
		// ������ ���� ��� ���°���� pos�� �����Ѵ�.
		while ((pos = word.indexOf(" ")) != -1) {

			// 0���� pos���� �߶� ������ tmp�� ����
			String tmp = word.substring(0, pos);

			// tmp�� ���̰� m���� Ŭ�� result = tmp�� �ȴ�. => subString���� �߶� ����ؼ� �ݺ�
			if (tmp.length() > m) {

				m = tmp.length();
				result = tmp;

			}
			// ó�� ���� ���� �� ���ο� ������ ����� ���� ����ؼ� �ݺ�
			word = word.substring(pos + 1);
			
			// ������ ������ �����̾����Ƿ� if������ �ܾ��� ���̷� ��
			if (word.length() > m) {
				result = word;
			}

		}
		return result;

	}

	public static void main(String[] args) {

		The_Logest_Word_03 t = new The_Logest_Word_03();

		Scanner sc = new Scanner(System.in);

		String word = sc.nextLine();

		System.out.println(t.solution2(word));

	}

}
