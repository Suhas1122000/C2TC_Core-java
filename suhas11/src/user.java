import java.util.Scanner;
class InvaliddirectionException extends Exception{
	InvaliddirectionException(String messag){
		                   super(messag);
	}
}
class Map
       {
	static void Checkdirection(String houselocation,String gpsdirection) 
    		  throws InvaliddirectionException
      {
    	  if(houselocation.equals(gpsdirection) ) {
    		  System.out.println("you are going in correct direction");
    	  }
    	  else {
    		 throw new InvaliddirectionException("you are in wrong direction");
    	  }
      }
       }
public class user {

	public static void main(String[] args) {
		Scanner c= new Scanner(System.in);
		String houselocation=c.nextLine();
		String gpsdirection=c.nextLine();
		Map n=new Map();
		try {
			n.Checkdirection(houselocation,gpsdirection);
		}
       catch(Exception e){
    	 System.out.println(e);
       }
	}

}
