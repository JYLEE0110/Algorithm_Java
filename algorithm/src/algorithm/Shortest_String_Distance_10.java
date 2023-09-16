package algorithm;


//����
//
//�� ���� ���ڿ� s�� ���� t�� �־����� ���ڿ� s�� �� ���ڰ� ���� t�� ������ �ּҰŸ��� ����ϴ� ���α׷��� �ۼ��ϼ���.
//
//
//�Է�
//ù ��° �ٿ� ���ڿ� s�� ���� t�� �־�����. ���ڿ��� ���ڴ� �ҹ��ڷθ� �־����ϴ�.
//
//���ڿ��� ���̴� 100�� ���� �ʴ´�.
//
//
//���
//ù ��° �ٿ� �� ���ڿ� s�� �� ���ڰ� ���� t�� ������ �Ÿ��� ������� ����Ѵ�.


import java.util.ArrayList;
import java.util.Scanner;

public class Shortest_String_Distance_10 {

	public ArrayList<Integer> solution(String str, char ch) {
		
		ArrayList answer = new ArrayList<Integer>();
		int n = 1000;
		
		// 0���� �־��� str ���� ���� ��ȸ 
		for(int i = 0; i<str.length(); i++) {
			
			if(str.charAt(i) == ch) {
				n = 0;
			}else {
				n++;
			}
			answer.add(n);
			
		}
		n=1000;
		// �����ʺ��� ��ȸ �ϸ鼭 ���� 0���� ��ȸ�� ������ ���� ��� set 
		for(int i = str.length()-1; i>=0; i--) {
			
			if(str.charAt(i) == ch) {
				n = 0;
			}else {
				n++;
				if((int)answer.get(i) > n) {
					answer.set(i, n);
				}
			}
			
		}
		
		return answer;
		
	}
	
	public static void main(String[] args) {
		
		Shortest_String_Distance_10 t 
			= new Shortest_String_Distance_10();
		
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		char ch = sc.next().charAt(0);
		
		// solution �޼ҵ� ��ȯ���� Integer���� �ڵ����� int�� �� ��ȯ�ȴ�.
		for(int n : t.solution(str, ch)) {
			System.out.print(n + " ");
		}

	}

}
