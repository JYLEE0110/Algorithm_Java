package hash;

//����
//
//�б� ȸ���� �̴µ� �ĺ��� ��ȣ A, B, C, D, E �ĺ��� ����� �߽��ϴ�.
//
//��ǥ�������� �� �л����� �ڱⰡ ������ �ĺ��� ��ȣ(���ĺ�)�� ������ ������ �������� �� ��ȣ�� ��ǥ�ϰ� �ֽ��ϴ�.
//
//�������� ��ǥ�� ���� �� � ��ȣ�� �ĺ��� �б� ȸ���� �Ǿ����� ����ϴ� ���α׷��� �ۼ��ϼ���.
//
//�ݵ�� �� ���� �б�ȸ���� ����ǵ��� ��ǥ����� ���Դٰ� �����մϴ�.
//
//
//�Է�
//ù �ٿ��� �� �л��� N(5<=N<=50)�� �־����ϴ�.
//
//�� ��° �ٿ� N���� ��ǥ������ ������ �ִ� �� �ĺ��� ��ȣ�� �������� ��ǥ�� ������� ���ڿ��� �Էµ˴ϴ�.
//
//
//���
//�б� ȸ������ ���õ� ��ȣ�� ����մϴ�.

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class ClassPresident {

	static char soluction(int n, String st) {

		// Key�� �ĺ� Value�� ��ǥ ��
		HashMap<Character, Integer> map = new HashMap<>();
		char result = ' ';
		int max = 0;

		// �Էµ� ���ڿ� st�� char�� �迭�� ���� x�� �ϳ��� �����´�.
		for (char x : st.toCharArray()) {

			// map�� key �ߺ��� �ȵȴ�. �׷��� ���� �������� �� key�� value�� ����.
			// ������ x(A,B,C,D,E �� �ϳ�) �� HashMap Key�� �ְ�
			// ���� x�� �������� value�� �����Ƿ� getOrDefault�� 0 ���� �ְ� +1 count ���ش�.
			// ���ʰ� �ƴ� �ô� ���� ���� �״�� ������ +1 count���ش�. => ��ǥ ��
			map.put(x, map.getOrDefault(x, 0) + 1);

		}

		// key���� �����ͼ�
		for (char x : map.keySet()) {
			
			// value(��ǥ ��)�� ���Ѵ�.
			// max���� ��ǥ���� ���� �� result�� key(�ĺ�)�� ��ȯ
			if (max < map.get(x)) {
				max = map.get(x);
				result = x;
			}

		}
		return result;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		String st = sc.next();
		System.out.println(ClassPresident.soluction(n, st));

	}

}
