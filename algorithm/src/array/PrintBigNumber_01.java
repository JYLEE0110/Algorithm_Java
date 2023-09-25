package array;

import java.util.Scanner;

public class PrintBigNumber_01 {

	public int[] solution(int[] num) {
		
		for(int i = 0; i<num.length-1; i++) {
			
			if(num[i] > num[i+1]) {
				System.out.print(num[i]);
			}else {
				System.out.print(num[i+1]);
			}
			
		}
		
		return null;
		
	}
	
	public static void main(String[] args) {

		PrintBigNumber_01 t = new PrintBigNumber_01();
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] num = new int[n];
		
		for(int i = 0; i<n; i++) {
			
			num[i]= sc.nextInt();
			
		}
		for(int result : t.solution(num)) {
			System.out.print(result);
		}
		
	}

}
