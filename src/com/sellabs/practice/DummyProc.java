/**
 * 
 */
package com.sellabs.practice;


/**
 * @author Lenovo-PC
 *
 */
public class DummyProc {

	
	void ops() {  //Creating a method
		
		int count; //Initializing some variable
		
		for (int i=2;i<=23;i++)   //Prime number starts with 2 so we can't assign to lesser number
		{
			count=0;
			
			for (int j=2;j<i;j++) {
				
				if (i%j==0) { //Checking the number is divisible by any number and if remainder is 0 it is not a prime number
					count++;
					break;
					
				}
			}
		if (count==0) 
		{
			System.out.println(i);//printing the prime numbers 
		}
		
		
		}
		
		
}
	
	public static void main(String[] args) {
		DummyProc ps=new DummyProc();//Creating a object and calling the method
		ps.ops();
	}

}
