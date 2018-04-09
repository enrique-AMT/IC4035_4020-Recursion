package lab7;

import java.util.Scanner;

public class FibNumbers {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int fib=in.nextInt();
		System.out.println(fib(fib));
		in.close();
	}
	
	public static long fib(int n){
		if(n<2) return 1;
		return fib(n-1)+fib(n-2);
	}
}
