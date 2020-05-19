package br.com.java8;

public class MediaArrays {

	public static void main(String[] args) {
	
		double nums[] = {1.0,2.1,3.1,4.1,5.1,6.1,7.1,8.1,9.1,10.1};
		double sum = 0;
		
		
		for (int i=0; i < nums.length; i++)
			sum =sum + nums[i];
			
		System.out.println("Média " + sum / nums.length);
			
				
				
		
		
	}

}
