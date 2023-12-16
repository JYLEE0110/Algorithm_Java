package hash;

//����
//
//������ �ƺ��� �������� ��մϴ�. �����ƺ��� �������� N�� ������ �������� �ְ� ���ӵ� K�� ������ ������� ������
//
//�� �������� ���϶�� �߽��ϴ�.
//
//���� N=7�̰� 7�� ���� �������� �Ʒ��� ����, �̶� K=4�̸�
//
//20 12 20 10 23 17 10
//
//�� ���� 4�ϰ��� ������ ����������
//
//ù ��° ������ [20, 12, 20, 10]�� ������� ������ 20, 12, 10���� 3�̴�.
//
//�� ��° ������ [12, 20, 10, 23]�� ������� ������ 4�̴�.
//
//�� ��° ������ [20, 10, 23, 17]�� ������� ������ 4�̴�.
//
//�� ��° ������ [10, 23, 17, 10]�� ������� ������ 3�̴�.
//
//N�ϰ��� �����ϰ� ���ӱ����� ���� K�� �־����� ù ��° �������� �� ������
//
//������� ������ ����ϴ� ���α׷��� �ۼ��ϼ���.
//
//
//�Է�
//ù �ٿ� N(5<=N<=100,000)�� K(2<=K<=N)�� �־����ϴ�.
//
//�� ��° �ٿ� N���� ���ڿ��� �־����ϴ�. �� ���ڴ� 500������ ���� �ƴ� �����Դϴ�.
//
//
//���
//ù �ٿ� �� ������ ����� ������ ������� ����մϴ�.

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Scanner;

public class TypeOfSales {

	static ArrayList<Integer> solution(int n, int k, int[] arr) {
		
		Collection<Integer> set = new HashSet<>();
		Collection<Integer> list = new LinkedList<>();
		ArrayList<Integer> result = new ArrayList<>();		
		int p1 = 1;
		
		for(int i = 0; i < k; i++) {
			
			list.add(arr[i]);
			
		}
		set.addAll(list);
		result.add(set.size());
		
		while(p1 < n-k+1) {
			
			set.clear();
			
			list.remove(arr[p1-1]);
			list.add(arr[p1+k-1]);
			
			set.addAll(list);
			result.add(set.size());
			
			p1++;
			
		}
		
		return result;
		
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] arr = new int[n];
		
		for(int i = 0; i < n; i++) {
			
			arr[i] = sc.nextInt();
			
		}
		for(int x : TypeOfSales.solution(n, k, arr)) {
			System.out.print(x + " ");
		}
	}

}
