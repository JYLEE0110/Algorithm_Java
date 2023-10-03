package array;

//����
//
//1) �Ǻ���Ű ������ ����Ѵ�. �Ǻ���ġ �����̶� ���� 2���� ���� ���Ͽ� ���� ���ڰ� �Ǵ� �����̴�.
//
//2) �Է��� �Ǻ���ġ ������ �� ���� �� �̴�. ���� 7�� �ԷµǸ� 1 1 2 3 5 8 13�� ����ϸ� �ȴ�.
//
//
//�Է�
//ù �ٿ� �� �׼� N(3<=N<=45)�� �Էµȴ�.
//
//
//���
//ù �ٿ� �Ǻ���ġ ������ ����մϴ�.

import java.util.ArrayList;
import java.util.Scanner;

public class FibonacciSequence_04 {
	
	public ArrayList<Integer> solution(int n){

		ArrayList<Integer> result = new ArrayList<>();
		
		result.add(1);
		result.add(1);
		
		
		for(int i=2; i<n; i++) {
			
			int next = result.get(i-2) + result.get(i-1);
			
			result.add(next);
			
		}
		
		return result;
	}

	public static void main(String[] args) {
		
		FibonacciSequence_04 t = new FibonacciSequence_04();
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for(int x : t.solution(n)) {
			
			System.out.print(x + " ");
			
		}
		

	}

}
