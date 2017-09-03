import java.util.Scanner;

public class CowsAndBullsGame {
	
	public static void main(String[] args) {
		// Creating the input scanner 
		Scanner s = new Scanner(System.in);
		GeneratedNumber number = new GeneratedNumber(3);
		// Generation of the computer number 
		
		// Creating the computer number from the digits 
		
		int computerNumber = number.get_number();
		
		int digits[] = number.get_digits();
		
		System.out.println(computerNumber);
		
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
				
				
				result answer = counter.detect(playerCharInput, digits, digits.length);
				
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