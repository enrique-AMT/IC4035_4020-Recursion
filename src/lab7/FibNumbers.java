package lab7;

import java.util.Scanner;

public class FibNumbers {
	private static long[] cache= new long[1024]; //to avoid size constraints
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int fib=in.nextInt();
		System.out.println(fib(fib));
		in.close();
	}
	
	public static long fib(int term){
		 if(term<2){
			 cache[0]=1;
			 return 1;
		 }
		 long prev= cache[term-1];
		 cache[term-1]=prev;
		 return fib(term - 1)+ fib(term-2);
	}
}
