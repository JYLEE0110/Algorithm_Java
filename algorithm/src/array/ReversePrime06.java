package array;

import java.util.ArrayList;
import java.util.Scanner;

public class ReversePrime06 {
	
	static ArrayList<Integer> solution(int n, ArrayList<String> list){
		
		ArrayList<Integer> result = new ArrayList<>();
		
		for(String num : list) {
			
			int cnt = 0;
			num = new StringBuilder(num).reverse().toString(); // 변환한 문자열을 StringBuffer로 변환 후 reverse 메소드 사용
			
			int checkNum = Integer.parseInt(num); // 숫자로 변환 
			
			// n의 제곱근 까지 검사
			for(int i = 2; i*i<=checkNum; i++) {
				
				// 나머지가 0이면 약수가 있으니 소수가 X cnt를 증가 시킨다.
				if((checkNum%i == 0)) {
					
					cnt++;
					
				}
				
			}
			
			// cnt가 0이면 소수 / 1을 제외하고 ArrayList에 추가한다.
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
