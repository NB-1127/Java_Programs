package com.Nested_Loop;

public class AmstrrongNestedLoop1to100 {

	public static void main(String[] args) {
		int i,n,d,sum;
		for(i=1; i<=1000; i++) {
			n=i;
			sum=0;
			while(n>0) {
				d=n%10;
				sum=sum+(d*d*d);
				n=n/10;
				
			}
			if(sum==i) {
				System.out.println(i);
		}
		
		}

	}

}
