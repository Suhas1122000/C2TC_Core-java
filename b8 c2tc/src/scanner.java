import java.util.Scanner;

public class scanner {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		char gender = sc.nextLine().charAt(0);
		System.out.println("Name: "+name);
		System.out.println("Gender: "+gender);

	}

}
