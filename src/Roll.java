import java.util.Random;
import java.util.Scanner;

public class Roll {
	
	public static int generateRandomDieRoll(int numOfSides) {
		Random rand = new Random();
		
		int result = rand.nextInt(numOfSides);
		result += 1;
		
		
		return result;
		
	}
	
	public static void nameYourRoll(int numOfSides) {
		
		int firstDie;
		int secondDie;
		int total;
		
		firstDie = generateRandomDieRoll(numOfSides);
		secondDie = generateRandomDieRoll(numOfSides);
		total = firstDie + secondDie;
			
		if(firstDie == 1 && secondDie == 1) {
			System.out.println(firstDie);
			System.out.println(secondDie);
			System.out.println("You rolled snake eyes: 2");
		}else if (firstDie == 6 && secondDie == 6) {
			System.out.println(firstDie);
			System.out.println(secondDie);
			System.out.println("You rolled a boxcar!: 12");
		}else if (firstDie == 2 && secondDie == 2) {
			System.out.println(firstDie);
			System.out.println(secondDie);
			System.out.println("Hard four: 4");
		}else if (firstDie == 3 && secondDie == 3) {
			System.out.println(firstDie);
			System.out.println(secondDie);
			System.out.println("Hard six: 6");
		}else if (firstDie == 4 && secondDie == 4) {
			System.out.println(firstDie);
			System.out.println(secondDie);
			System.out.println("Hard eight: 8");
		}else if (firstDie == 5 && secondDie == 5) {
			System.out.println(firstDie);
			System.out.println(secondDie);
			System.out.println("Hard ten: 10");
		}else {
			System.out.println(firstDie);
			System.out.println(secondDie);
			System.out.println("You rolled a: " + total);
		}
	}
	
	public static void notSixSidedDice(int numOfSides) {
		int firstDie = Roll.generateRandomDieRoll(numOfSides);
		//int secondDie = Roll.generateRandomDieRoll(numOfSides);
		int secondDie = (int)((Math.random()) * numOfSides) + 1;
		int total = firstDie + secondDie;
		System.out.println(firstDie);
		System.out.println(secondDie);
		System.out.println("Total: " + total);
	}
	public static boolean isYesOrNo(String ans) {
		boolean goodAnswer;
		if(ans.equalsIgnoreCase("n") || ans.equalsIgnoreCase("y")) {
			goodAnswer = true;
		}else {
			goodAnswer = false;
			
		}
		return goodAnswer;
		
	}
}