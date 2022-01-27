package scn;

import java.util.Scanner;

public class large {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the arry size: ");
		int ars=sc.nextInt();
		int arr[]= new int[ars];
		int a;
		int b=0;
		System.out.println("enter the elements");
		for(a=0;a<ars;a++)
		{
			
			arr[a]=sc.nextInt();
			{
			if(arr[a]>b) 
			{
				b=arr[a];
		    }
		}

	} 
		System.out.println("largest no is:"+b);
	}
}

