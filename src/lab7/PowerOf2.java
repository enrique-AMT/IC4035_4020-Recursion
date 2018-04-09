package lab7;

import java.util.Scanner;

public class PowerOf2 {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		long b = in.nextLong();
		if(isPowerOf2(b)) System.out.print("yes");
		else System.out.print("no");
		in.close();
	}

	public static boolean isPowerOf2(long b){
		if (b == 1) {
			return true;
		} 
		else if (b % 2 != 0 || b == 0) {
			return false;
		} 
		else {
			return isPowerOf2(b / 2);
		}
	}
}
