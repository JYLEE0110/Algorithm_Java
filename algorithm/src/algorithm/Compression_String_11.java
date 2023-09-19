package algorithm;

//����
//
//���ĺ� �빮�ڷ� �̷���� ���ڿ��� �Է¹޾� ���� ���ڰ� �������� �ݺ��Ǵ� ��� �ݺ��Ǵ�
//
//���� �ٷ� �����ʿ� �ݺ� Ƚ���� ǥ���ϴ� ������� ���ڿ��� �����ϴ� ���α׷��� �ۼ��Ͻÿ�.
//
//�� �ݺ�Ƚ���� 1�� ��� �����մϴ�.
//
//
//�Է�
//ù �ٿ� ���ڿ��� �־�����. ���ڿ��� ���̴� 100�� ���� �ʴ´�.
//
//
//���
//ù �ٿ� ����� ���ڿ��� ����Ѵ�.

import java.util.ArrayList;
import java.util.Scanner;

public class Compression_String_11 {

	public ArrayList<String> solution(String str) {

		str = str + " ";

		ArrayList<String> list = new ArrayList<>();

		int cnt = 1;

		for (int i = 0; i < str.length() - 1; i++) {

			if (str.charAt(i) == str.charAt(i + 1)) {
				cnt++;
			} else {
				list.add(String.valueOf(str.charAt(i)));
				if (cnt > 1) {

					list.add(Integer.toString(cnt));
				}
				cnt = 1;
			}

		}

		return list;
	}

	public static void main(String[] args) {

		Compression_String_11 t = new Compression_String_11();

		Scanner sc = new Scanner(System.in);

		String str = sc.nextLine();

		for(String result : t.solution(str)) {
			System.out.print(result);
		}
	}

}
