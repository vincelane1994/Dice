import java.util.Scanner;

public class RollingDice {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		String ans = "y";
		int numOfSides = 0;
		String sixSides;
		int test = 0;
		boolean isInteger;
		String stringTest;
		

		/* TESTING SYSTEM TO ENSURE AN INT WAS TYPED IN
		System.out.println("number");
		do {
			
			if(scnr.hasNextInt()) {
				test = scnr.nextInt();
				//System.out.println(test);
				isInteger = true;
				scnr.nextLine();
			}else {
				isInteger = false;
				scnr.nextLine();
				System.out.println("That was not a number try again:");
			}
		}while (isInteger == false);
		System.out.println(test);
		*/
		
		
		
		System.out.println("Do your dice each have 6 sides?(y/n)");
		sixSides = scnr.nextLine();
		
		while (ans.equalsIgnoreCase("y")){
			if(sixSides.equalsIgnoreCase("n")) {
				System.out.print("How many sides should each die have?: ");
				
				do {
					
					if(scnr.hasNextInt()) {//IF AN INT WAS TYPED IN THIS WILL AMOUNT TO TRUE
						numOfSides = scnr.nextInt();
						isInteger = true;
						scnr.nextLine();
					}else {//IF ANYTHING BUT AN INT WAS TYPED IN THIS BRANCH WILL RESET THE QUESTION
						isInteger = false;
						scnr.nextLine();
						System.out.println("That was not a number try again:");
					}
					}while (isInteger == false);

				Roll.notSixSidedDice(numOfSides);//METHOD TO ROLL THE DICE
				System.out.println("Would you like to roll again?(y/n): ");
				ans = scnr.nextLine();
				while (Roll.isYesOrNo(ans) != true) {// IF THE USER TYPES ANYTHING BUY "Y" OR "N" IT WILL ASK THEM TO TRY AGAIN
					System.out.println("Please type either a 'y' to continue or an 'n' to end.");
					ans = scnr.nextLine();
				}
			}
			//scnr.nextLine();
			Roll.nameYourRoll(6);
			System.out.println("Would you like to roll again?(y/n): ");
			ans = scnr.nextLine();
			while (Roll.isYesOrNo(ans) != true) {// IF THE USER TYPES ANYTHING BUY "Y" OR "N" IT WILL ASK THEM TO TRY AGAIN
				System.out.println("Please type either a 'y' to continue or an 'n' to end.");
				ans = scnr.nextLine();
				}
			
		}
		System.out.println("Goodbye!");
		}
	}


