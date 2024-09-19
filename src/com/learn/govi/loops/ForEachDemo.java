package com.learn.govi.loops;

public class ForEachDemo {

	public static void main(String args[]) {
		
		int arr[] = {2,4,6};
		
		int sum = 0;
		for (int i : arr) {
			sum+=i;
			
			System.out.println("i =="+i);
		}
		System.out.println("sum =="+sum);
		
		
		String[] arr2 = {"hi", "hello", "how are you "};
		
		for(String str: arr2) {
			System.out.println(str);
		}
	}
}
