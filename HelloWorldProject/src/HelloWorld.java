//Katherine Andrade, 9/10/25, period 7, basic user input and output program
//Yes, I know the file name should be something like ReviewProgram - working on it!
import java.util.Scanner;
public class HelloWorld {

	public static void main(String[] args) {
		//TODO: Implement Program Requirements Here

		Scanner input = new Scanner(System.in);
		System.out.print("\nEnter your name: ");
		String userName = input.nextLine();

		int lenName = userName.length();

		for(int i=0; i<=lenName; i++){
			if(userName.charAt(i) >= 33 && userName.charAt(i) <=64){
				System.out.print("Enter a legal name: ");
				userName=input.nextLine();
				lenName = userName.length();
			} //end if
		}	//end for loop

		System.out.print("Enter your age: ");
		int age = input.nextInt();
		input.nextLine();

		System.out.print("Enter your favorite 3 digit number: ");
		int favNum = input.nextInt();

		System.out.print("Enter your GPA: ");
		double userGPA = input.nextDouble();


		//output
		System.out.println("\nWelcome " + userName + "!");

		if(age > 18)
			System.out.println("Congratulation you can vote!");
		if(age < 18)
			System.out.println("You have " + (18-age) + " years till you can vote!");

		if(userGPA >= 4.5)
			System.out.println("Your hard work is paying off! Keep up the great work!");
		else if(userGPA >= 4 && userGPA <=4.49)
			System.out.println("Keep up the great work!");
		else if( userGPA >=3.5 && userGPA <=3.99)
			System.out.println("Continue trying!");
		else if(userGPA >=3 && userGPA <=3.49)
			System.out.println("Keep studying!");
		else
			System.out.println("Ask for help from your teachers and change your study methods. You can do anything you set your mind to.");

		int userNameLen =  userName.length();

		for(int x =userNameLen; x<=favNum; x+=userNameLen){
			System.out.print(x);
			if((x+userNameLen) <=favNum)
				System.out.print(",");
		}//end loop

		
	}//end main

}//end class
