package scn;

import java.util.Scanner;

public class arr {
	public static void main(String args[]) 
	{
		int i,search;
		int count=0;
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the size of arry");
	    int arr1=sc.nextInt();
		
		int arr2[]= new int [arr1];
		System.out.println("enter those elements");
	
		for(i=0;i<arr1;i++)
		{
			arr2[i]=sc.nextInt();
		}
		System.out.println("enter search ");
		search=sc.nextInt();
		for (i=0;i<arr1;i++)
		{
		  if (arr2[i]==search)
					{
				   count++;
				    
					}
		}
		System.out.println(count);
			}
			
		
		     }

		


