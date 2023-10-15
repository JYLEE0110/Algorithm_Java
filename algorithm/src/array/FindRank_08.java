package array;

//����
//
//N���� �л��� ���������� �ԷµǸ� �� �л��� ����� �Էµ� ������� ����ϴ� ���α׷��� �ۼ��ϼ���.
//
//���� ������ �Էµ� ��� ���� ����� ���� ó���Ѵ�.
//
//�� ���� ���� ������ 92���ε� 92���� 3�� �����ϸ� 1���� 3���̰� �� ���� �л��� 4���� �ȴ�.
//
//
//�Է�
//ù �ٿ� N(3<=N<=100)�� �Էµǰ�, �� ��° �ٿ� ���������� �ǹ��ϴ� N���� ������ �Էµȴ�.
//
//
//���
//�Էµ� ������� ����� ����Ѵ�.

import java.util.ArrayList;
import java.util.Scanner;

public class FindRank_08 {

	static ArrayList<Integer> solution(ArrayList<Integer> list){
		
		int rank = 1;
		ArrayList<Integer> result = new ArrayList<>();
		
		for(int i = 0; i<list.size(); i++) {
			
			for(int x : list) {
				
				if(list.get(i) < x) {
					rank++;
				}
				
			}
			result.add(rank);
			rank = 1;
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
		
		for(int x : FindRank_08.solution(list)) {
			
			System.out.print(x + " ");
			
		}
			
	}

}
