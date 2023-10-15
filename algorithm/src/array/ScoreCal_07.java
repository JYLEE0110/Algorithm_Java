package array;

//����
//
//OX ������ �°ų� Ʋ�� �� ����� ���� ������ ������ ���Ѵ�.
//
//���� ���� OX ������ ������� ���迡�� ���������� ���� ������ ��쿡�� �������� �ֱ� ���ؼ� ������ ���� ���� ����� �ϱ�� �Ͽ���.
//
//1�� ������ �´� ��쿡�� 1������ ����Ѵ�. ���� ������ ���ؼ��� ���� Ʋ���ٰ� ���� �´� ó�� ������ 1������ ����Ѵ�.
//
//����, �������� ������ ���� �´� ��쿡�� �� ��° ������ 2��, �� ��° ������ 3��, ..., K��° ������ K������ ����Ѵ�. Ʋ�� ������ 0������ ����Ѵ�.
//
//���� ���, �Ʒ��� ���� 10 ���� OX �������� ���� ���� ������ ��쿡�� 1�� ǥ���ϰ�, Ʋ�� ��쿡�� 0���� ǥ���Ͽ��� ��,
//
//���� ����� �Ʒ� ǥ�� ���� ���Ǿ�, �� ������ 1+1+2+3+1+2=10 ���̴�.
//
//Image1.jpg
//
//���蹮���� ä�� ����� �־����� ��, �� ������ ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
//
//
//�Է�
//ù° �ٿ� ������ ���� N (1 �� N �� 100)�� �־�����. ��° �ٿ��� N�� ������ ä�� ����� ��Ÿ���� 0 Ȥ�� 1�� �� ĭ�� ���̿� �ΰ� �־�����.
//
//0�� ������ ���� Ʋ�� ����̰�, 1�� ������ ���� �´� ����̴�.
//
//
//���
//ù° �ٿ� �Է¿��� �־��� ä�� ����� ���Ͽ� �������� ����� �� ������ ����Ѵ�

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ScoreCal_07 {

	static int solution(ArrayList<Integer> list) {
		
		int score = 0;
		int result = 0;
		
		for(int i = 0; i<list.size(); i++) {
			
			if(list.get(i) == 1) {
				
				score++;
				
			}else {
				score = 0;
			}
			result += score;
			
		}
		
		return result;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); 

		ArrayList<Integer> list = new ArrayList<>(); 
		
		int n = sc.nextInt();
		
		for(int i = 0; i<n; i++) {
			
			int listNum = sc.nextInt();
			
			list.add(listNum);
			
		}
		
		System.out.println(ScoreCal_07.solution(list));
		
	}

}
