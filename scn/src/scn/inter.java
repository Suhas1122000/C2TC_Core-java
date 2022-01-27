package scn;

public class inter {

	public static void main(String[] args) {
	int arr[][]= {{1, 2, 3},
			      {4, 5, 6},
			      {7, 8, 9}};
	
	int a = arr.length;
	int b=0,c=0;
	for (int i=0;i<arr.length;i++)
	{
	     if (i==0)
	        {
	    //	 int temp = arr[0][i];
	    // arr[0][i]= arr[a-1][i];
	    //	 arr[a-1][i]=temp;
        	  a=arr[0][0];
              b=arr[0][1];
		      c=arr[0][2];
	      	}
	     if(i==2)
	     	{
	 		arr[0][0]=arr[2][0];
	 		arr[0][1]=arr[2][1];
	 		arr[0][2]=arr[2][2];
	 		System.out.println(" ");
	 		arr[2][0]=a;
	 		arr[2][1]=b;
	 		arr[2][2]=c;
	 	}
	}
	for(int i = 0;i<arr.length;i++)
	{
		for(int j=0;j<arr.length;j++)
		{
			System.out.print(arr[i][j]+" ");
		}
	}
	System.out.println(" ");
		
	}

}
