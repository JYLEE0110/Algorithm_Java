package array;

import java.util.ArrayList;
import java.util.Scanner;

public class ReversePrime06 {
	
	static ArrayList<Integer> solution(int n, ArrayList<String> list){
		
		ArrayList<Integer> result = new ArrayList<>();
		
		for(String num : list) {
			
			int cnt = 0;
			num = new StringBuilder(num).reverse().toString(); // ��ȯ�� ���ڿ��� StringBuffer�� ��ȯ �� reverse �޼ҵ� ���
			
			int checkNum = Integer.parseInt(num); // ���ڷ� ��ȯ 
			
			// n�� ������ ���� �˻�
			for(int i = 2; i*i<=checkNum; i++) {
				
				// �������� 0�̸� ����� ������ �Ҽ��� X cnt�� ���� ��Ų��.
				if((checkNum%i == 0)) {
					
					cnt++;
					
				}
				
			}
			
			// cnt�� 0�̸� �Ҽ� / 1�� �����ϰ� ArrayList�� �߰��Ѵ�.
			if((cnt == 0)  && (checkNum != 1)) {
				
				result.add(checkNum);
				
			}
			
		}
		
		
		return result;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		ArrayList<String> list = new ArrayList<>();
		
		for(int i = 0; i < n; i++) {
			
			String num = sc.next();
			list.add(num);
			
		}
		
		for(int x : ReversePrime06.solution(n, list)) {
			
			System.out.print(x + " ");
		}
		
	}

}
