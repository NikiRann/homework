import java.util.Scanner;

public class CowsAndBullsGame {
	
	public static void main(String[] args) {
		// Creating the input scanner 
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter with how many numeral digits you want to play: ");
		
		String numberOfDigits = s.nextLine();
		
		// Generation of the computer number
		
		GeneratedNumber number = new GeneratedNumber(Integer.parseInt(numberOfDigits));
		
		// Creating the computer number from the digits 
		
		int computerNumber = number.get_number();
		
		int digits[] = number.get_digits();
		
		// Getting the player input
		
		String playerInput;
		
		int playerNumber;
		
		// The game
		
		BullsAndCowsCounter counter = new BullsAndCowsCounter();
		
		while (true)
		{
			playerInput = s.nextLine();
			playerNumber = Integer.parseInt(playerInput);
			
			char[] playerCharInput = playerInput.toCharArray();
			
			if (playerNumber != computerNumber)
			{
				result answer = counter.detect(playerCharInput, digits, digits.length - 1);
				
				System.out.println("Bulls: " + answer.returnfirstparameter() + " Cows: " + answer.returnsecondparameter());
			}
			else
			{
				break;
			}
		}
		
		System.out.println("Good Job! You defeated me!");
	}
}