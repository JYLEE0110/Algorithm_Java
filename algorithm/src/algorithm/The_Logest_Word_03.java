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
		
		for(String w : spWord) {
			
			result = w.length() > result.length() ? w : result;
			
		}
		
		return result;
		
	}

	public static void main(String[] args) {
		
		The_Logest_Word_03 t = new The_Logest_Word_03();
		
		Scanner sc = new Scanner(System.in);
		
		String word = sc.nextLine();
		
		System.out.println(t.solution(word));
		

	}

}
