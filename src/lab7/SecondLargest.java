package lab7;

import java.util.Scanner;

public class SecondLargest {
	public static void main (String[] args){
		String elements="";
		Scanner p = new Scanner(System.in);
		Scanner r = new Scanner(System.in);
		int size= p.nextInt();
		int[] a=new int[size];
		if(r.hasNextLine())
			elements= r.nextLine();
		String[] values= elements.split(" ");
		for(int i=0; i<values.length;i++){
			a[i]=Integer.parseInt(values[i]);
		}
		System.out.println(secondLargest(a, 0,0, 0));
	}
	
	static int secondLargest(int[] arr, int index, int largest, int secondLargest) {
	    if(index == arr.length) {
	        return secondLargest;
	    }
	    int element = arr[index];
	    if(element > secondLargest) {
	        if(element > largest) {
	            return secondLargest(arr, index + 1, element, largest);
	        } else {
	            return secondLargest(arr, index + 1, largest, element);
	        }
	    }
	    return secondLargest(arr, index + 1, largest, secondLargest);
	}
}
