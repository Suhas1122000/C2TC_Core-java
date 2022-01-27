package scn;

import java.util.Scanner;

public class mrk {

	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		System.out.println("enter the input: ");
		int arr1 = sc.nextInt();
		int arr2[]= new int[arr1];
		int b=1;
		int count=0;
		int v=0;
		int a=0;
		for(int i=0;i<arr1;i++)
		{
			arr2[i]=sc.nextInt();
		}
		for(int i=0;i<arr1;i++) 
		{
			if(arr2[i]>=1) 
			{
				count++;
		 //      if(arr2[i]<=0)
		//    {
			//	b=count++;
	//		}
		}
		}
		v= ((count*3));
      System.out.println(v);
	}
}
