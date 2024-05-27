package com.Nested_Loop;

public class PrintFact1div1facttosum1div10fact {

	public static void main(String[] args) {
		double i,n,j,fact;double sum=0;
		
		for(i=1; i<=10; i++) {
			n=i;
			fact=1;
			
			for(j=1;j<=n; j++) {
				
				fact=fact*j;
			}
				sum=i/fact+sum;
				
			}
		
			System.out.println(sum);
		}
		
	}


