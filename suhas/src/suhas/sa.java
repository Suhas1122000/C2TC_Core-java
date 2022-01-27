package suhas;

import java.util.Scanner;

public class sa {

	public static void main(String[] args) {
	int c,n,search,arry[];
	Scanner in=new Scanner (System.in);
			System.out.println("Enter no of elements");
			n=in.nextInt();
			arry=new int [n];
			System.out.println("enter those"+n+"elements");
			for(c=0;c<n;c++)
			{
				arry[c]=in.nextInt();
				
			}
			System.out.println("enter value to find");
			search=in.nextInt();
			for (c=0;c<n;c++)
			{
				if (arry[c]==search) 
				{
					System.out.println(search+"is present");
					break;
				}
				
					
			}
			if(c==n)
				System.out.println(search+"is not present");
	}

}
