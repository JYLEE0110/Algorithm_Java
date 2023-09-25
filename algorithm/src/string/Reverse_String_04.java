package string;

//����
//
//N���� �ܾ �־����� �� �ܾ ������ ����ϴ� ���α׷��� �ۼ��ϼ���.
//
//
//�Է�
//ù �ٿ� �ڿ��� N(3<=N<=20)�� �־����ϴ�.
//
//�� ��° �ٺ��� N���� �ܾ �� �ٿ� �ϳ��� �־����ϴ�. �ܾ�� ���� ���ĺ����θ� �����Ǿ� �ֽ��ϴ�.
//
//
//���
//N���� �ܾ �Էµ� ������� �� �ٿ� �ϳ��� ����� ����մϴ�.

import java.util.ArrayList;
import java.util.Scanner;

public class Reverse_String_04 {
	
	public ArrayList<String> solution(String[] str){
		
		ArrayList<String> result = new ArrayList<>();
		
		for(String x : str) {
			
			String sb = new StringBuilder(x).reverse().toString();
			
			result.add(sb);
		}
		
		return result;
		
	}

	public static void main(String[] args) {
		
		Reverse_String_04 t = new Reverse_String_04();

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		String[] str = new String[n];
		
		for(int i = 0; i<n; i++) {
			
			String newStr = sc.next();
			
			str[i] = newStr;
			
		}
		for(String x : t.solution(str)) {
			
			System.out.println(x);
			
		}
		
	}

}
