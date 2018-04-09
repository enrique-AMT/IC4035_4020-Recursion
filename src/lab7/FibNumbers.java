package lab7;

import java.util.HashMap;
import java.util.Scanner;

public class FibNumbers {
	private static HashMap<Integer, Long> computed= new HashMap<>();
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int fib=in.nextInt();
		System.out.println(fib(fib));
		in.close();
	}
	
	public static long fib(int n){
		if(computed.containsKey(n)){
			return computed.get(n).longValue();
		}
		 if(n<2){
			 return 1;
		 }
		 long presentFib= fib(n-1)+ fib(n-2);
		 computed.put(n, presentFib);
		 return presentFib;
	}
}
