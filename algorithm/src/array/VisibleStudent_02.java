package array;

//����
//
//�������� N���� �л��� �Ϸķ� �������ϴ�. �Ϸķ� �� �ִ� �л��� Ű�� �տ������� ������� �־��� ��, �� �տ� �� �ִ�
//
//�������� �� �� �ִ� �л��� ���� ���ϴ� ���α׷��� �ۼ��ϼ���. (�տ� �� �ִ� ����麸�� ũ�� ���̰�, �۰ų� ������ ������ �ʽ��ϴ�.)
//
//
//�Է�
//ù �ٿ� ���� N(5<=N<=100,000)�� �Էµȴ�. �� �����ٿ� N���� �л��� Ű�� �տ������� ������� �־�����.
//
//
//���
//�������� �� �� �ִ� �ִ��л����� ����Ѵ�.

import java.util.Scanner;

public class VisibleStudent_02 {
	
	public int solution(int arr[]) {
		
		int cnt = 1;
		int max = arr[0];
		
		for(int i = 1; i<arr.length; i++) {
			
			if(max < arr[i]) {
				cnt++;
				max = arr[i];
			}
			
		}
		
		return cnt;
		
	}

	public static void main(String[] args) {
		
		VisibleStudent_02 t = new VisibleStudent_02();
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int arr[] = new int[num];
		
		for(int i = 0; i < num; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println(t.solution(arr));
		

	}

}
