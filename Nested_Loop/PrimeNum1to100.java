package com.Nested_Loop;

public class PrimeNum1to100 {

	public static void main(String[] args) {
		int i,n,j,count;
		
		for(i=1; i<=100; i++) {
			count=0;
			n=i;
			for(j=1; j<=n; j++) {
				//n is goes to the 1 to 100 number
				//n%j :1%1==0
				if(n%j==0) {
					count++;
				}
			}
					
				if(count==2) 
					System.out.println(i);
				}
				
			}
			
	}
	


