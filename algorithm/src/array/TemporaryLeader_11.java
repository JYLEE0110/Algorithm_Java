package array;

import java.util.Arrays;
import java.util.Scanner;

public class TemporaryLeader_11 {

	static int solution(int n, int[][] check) {
		
		int[] count = new int[n+1];
		int max = 0;
		
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j< n; j++) {
				for(int z = n-1-j; z > 0; z--) {
					
					if(check[j][i] == check[j+z][i] && (count[j] <= i+1) && (count[j+z] <= i+1)) {
						
						count[j]++;
						count[j+z]++;
						
					}
					
				}
			}
		}
		System.out.println(Arrays.toString(count));
		
		
		for(int i = 0; i < count.length; i++) {
			
			max = count[i] > count[i+1] ? i : i+1;
			
		}
		
		return max;
	}
	
	public static void main(String[] args) {
		
		
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int[][] check = new int[n][5];
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j<5; j++) {
				
				int m = sc.nextInt();
				
				check[i][j] = m;
				
			}
		}
		
		System.out.println(TemporaryLeader_11.solution(n, check));

	}

}
