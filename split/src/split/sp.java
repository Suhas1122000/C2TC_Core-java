package split;

import java.util.Scanner;
public class sp {
static void splitString(String s){
	 try  {
		 String[] splittedString =s.split("/");	 
	 for(int i=0; i<splittedString.length; i++) {
		 System.out.println("Splitted String at index "+i+" is:"+splittedString[i]);
	          }
	        }
    		catch(Exception e)
    		 {
    			 System.out.println("Exception :" +e);
    		 }

    		 finally {
    			 System.out.println("inside finnaly block");
    		 }		


}
public static void main(String[] args) {
	Scanner sc= new  Scanner(System.in);
	String s=sc.nextLine();
	int t=s.length();
		
        if (t>2)
        	{
        		splitString(s);
	        }
        	else
        	{
        	splitString(null);
        	}
	}

 
	}
