package com.loop;

public class WhileAmstrongEx {

	public static void main(String[] args) {
		
		int i=1;int n,sum,d;
		while(i<100) {
			n=i;
			sum=0;
			
		while(n>0) {
			d=n%10;
			sum=sum+(d*d*d);
			n=n/10;
		}
		if(sum==i) 
			System.out.println(i);
			i++;

		}
	}

}
