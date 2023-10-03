package array;

import java.util.ArrayList;
import java.util.Scanner;

public class PrintBigNumber_01 {

	public ArrayList<Integer> solution(int arr[]) {
		
		ArrayList<Integer> list = new ArrayList<>();
		
		list.add(arr[0]);
		
		for(int i = 1; i< arr.length; i++) {
			
			if(arr[i-1] < arr[i]) {
				
				list.add(arr[i]);
				
			}
			
		}
		return list;
		
	}
	
	public static void main(String[] args) {
		
		PrintBigNumber_01 result = new PrintBigNumber_01();
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int arr[] = new int[num];
		
		for(int i = 0; i < num; i++) {
			arr[i] = sc.nextInt();
		}

		for(int x : result.solution(arr)) {
			System.out.print(x + " ");
		}
		
	}

}
