package com.loop;

public class PalindromWhileEx {

	public static void main(String[] arg) {
		
		
		int i=1;int n,sum,d;
		while(i<100) {
			n=i;
			sum=0;
			
		while(n>0) {
			d=n%10;
			sum=sum*10+d;
			n=n/10;
		}
		if(sum==i) 
			System.out.println(i);
			i++;

		}
	
}
}