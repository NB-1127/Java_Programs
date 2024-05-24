package com.Pyramid;

public class NumPyramid {

	public static void main(String[] args) {
		int i,j;
        for(i=1; i<=5; i++){
            for(j=1; j<=i; j++){
                System.out.print(j);// IT is for the different values like 1 12 123 1234 12345                     
            }
            System.out.println();
        }

        int k,p;
        for(k=1; k<=5; k++){
            for(p=1; p<=k; p++){
                System.out.print(k);// IT is for the same values like 1 22 333 4444 55555                    
            }
            System.out.println();
        }

        int s,r;
        for(s=5; s>=1; s--){
            for(r=5; r>=s; r--){
                System.out.print(r);// IT is for the different values but in desc 5 54 543 5432 54321                      
            }
            System.out.println();
        }

       
        int d,f;
        for(d=1; d<=5; d++){
            for(f=5; f>=d; f--){
                System.out.print(f);// IT is for the same values 54321 5432 543 54 5                     
            }
            System.out.println();
        }
        int n,m;
        for(n=5; n>=1; n--){
            for(m=1; m<=n; m++){
                System.out.print(n);// IT is for the same values like 55555 4444 333 22 1                   
            }
            System.out.println();
        }

	}

}
