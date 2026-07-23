import java.util.Scanner;
public class UserInput {

	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		System.out.println("Enter you'r Name: ");
		String name = userInput.nextLine();
		System.out.println("Enter you'r Age: ");
		int userAge = userInput.nextInt();
		System.out.printf("Hi %s and you'r age is %d.",name,userAge);
		userInput.close();
	}

}
