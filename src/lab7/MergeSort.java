package lab7;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class MergeSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner p = new Scanner(System.in);
		Scanner r = new Scanner(System.in);
		int size= p.nextInt();
		int[] a=new int[size];
		String elements= r.nextLine();
		String[] values= elements.split(" ");
		for(int i=0; i<values.length;i++){
			a[i]=Integer.parseInt(values[i]);
		}
		mergeSort(a, 0, size-1);
		for(int i=0 ; i<a.length ; i++){
			System.out.print(a[i] + " ");
		}
	}

	public static void mergeSort(int arr[], int low, int high)
	{
	    int middle;
	    if(low<high)
	    {
	        middle = (low+high)/2;
	        mergeSort(arr,low,middle);
	        mergeSort(arr,middle+1,high);
	        merge(arr,low,middle,high);
	    }
	}
	public static void merge(int arr[], int low, int middle, int high)
	{
	    Queue<Integer>half1 = new LinkedList<Integer>();
	    Queue<Integer>half2 = new LinkedList<Integer>();

	    for(int j = low; j<=middle;j++)
	        {               
	            half1.add(arr[j]);
	        }
	    for(int j= middle+1 ; j<=high ; j++)
	        {
	            half2.add(arr[j]);
	        }
	    int i = low;
	    while(!(half1.isEmpty() || half2.isEmpty()))
	    {
	        if(half1.peek() <= half2.peek())
	        {
	            arr[i++] = half1.poll();

	        }
	        else {arr[i++] = half2.poll();}
	    }

	    while(!half1.isEmpty())
	    {
	        arr[i++] = half1.poll();
	    }
	    while(!half2.isEmpty())
	    {
	        arr[i++] = half2.poll();
	    }
	}
}
