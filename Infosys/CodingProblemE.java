/*Bob has some problems with n topics, he will give you all the problems as an array A with length N. It is given that A[i] denotes the number of problems on ith topic tht he wrote.

Bob asks you to organise the maximum possible number of contests using these two problems such that
i) Each contest has distinct problems(no two or more problems with the same topic).
ii)Each contest(except the first one) has more problems than the previous contest.

Find the maximum number of contests you can organise using problems given by bob.

Input Format:
The first line contains integer N,denoting number of elements in A.
Each line i of the N subsequent lines(0<=i<N) contains an integer describing A[i].

Constraints:
1<=N<=10^5
1<=A[i]<=10^5

Sample Input 1:
3
1
1
4
Sample output 1:
2
Explanation:
N=3, A={1,1,4}. In the first contest you can make a question on topic 0.In the second contest make 2 problems, 1 on topic 1 and 1 on topic 2.Now Bob cant make third contest because he needs to make 3 questions in 3rd contest and he does not have problems remaining on topic 0 and 1. so the answer is 2.

Sample Input 2:
4
7
8
10
13
Sample output 2:
4
Explanation:
The first contest has topic 3 the second contest has topics 2 and 1 the third contest has topic 1,2 and 3 the fourth contest has topics 0,1,2 and 3.
Result: The total number of contests organized is contestCount - 1 because the last increment happens without forming a valid new contest due to topic constraint.*/

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

/**
 * CodingProblemE
 */
public class CodingProblemE {

    public static int maxcountContest(int A[]){

        Arrays.sort(A);//inbuild function to sort the array which optimize the code

        PriorityQueue<Integer> pq=new PriorityQueue<>(); // we use priority queue for the elemet are process according to priority it require comparator for the sorting
        int countOfContest=0;// it count how many elements in array and which one is added

       for(int problem : A){ // temparary stored the element in problem
        if (!pq.isEmpty() && pq.peek() < countOfContest+1) {//peek function is use for get the element at top in array
            pq.poll();// poll it means the removing the element
            
        }
        pq.add(problem);// to add the element 
        countOfContest++;
       }
       return countOfContest-1; 
    }


    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter a Element or range of the array:");
        int n=sc.nextInt();

        int A[]=new int[n];
        
        for (int i = 0; i <n; i++) {
            A[i]=sc.nextInt();
        }
        System.out.println("MAX_CountOfContest is := " + maxcountContest(A));
    }

}