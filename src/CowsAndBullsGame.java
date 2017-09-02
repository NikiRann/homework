import java.util.Scanner;

public class CowsAndBullsGame {
	
	public static void main(String[] args) {
		// Creating the input scanner 
		Scanner s = new Scanner(System.in);
		// Generation of the computer number 
		
		int[] digits = new int[4]; // Array of all the 4 digits in the number
		
		int generatedDigit = (int) Math.random() * 9; // Creating the variable of the digit we are going to generate 
				
		for (int i = 0; i <= 3; generatedDigit = (int) (Math.random() * 9 + 1)) // Generating random digits untill there are no duplicates
		{
			boolean used = false;
			
			for (int o = 0; o < 3; o ++) // Checking if the digit is used already
			{
				if (generatedDigit == digits[o])
				{
					used = true;
				}
			}
			if (!used)
			{
				
				digits[i] = generatedDigit;
				
				i ++;
			}
		}
		
		// Creating the computer number from the digits 
		
		int computerNumber = digits[0] * 1000 + digits[1] * 100 + digits[2] * 10 + digits[3];
		
		
		// Getting the player input
		
		String playerInput;
		
		int playerNumber;
		
		// The game
		
		while (true)
		{
			playerInput = s.nextLine();
			playerNumber = Integer.parseInt(playerInput);
			char[] playerCharInput = playerInput.toCharArray();
			if (playerNumber != computerNumber)
			{
				boolean[] bulls = new boolean[4];
				int foundBulls = 0;
				int foundCows = 0;
				// Checking for bulls
				for (int i = 0; i <= 3; i ++)
				{
					if (playerCharInput[i] == (char)(digits[i] + '0'))
					{
						bulls[i] = true;
						foundBulls ++;
					}
				}
				
				// Checking for cows
				
				for (int i = 0; i <= 3; i ++)
				{
					// Checking if there was a bull on this integer
					if (bulls[i] != true)
					{
						
						for (int o = 0; o <= 3; o ++)
						{
							if (playerCharInput[i] == (char)(digits[o] + '0'))
							{
								foundCows ++;
							}
						}
					}
				}
				System.out.println("Bulls: " + foundBulls + " Cows: " + foundCows);
			}
			else
			{
				break;
			}
		}
		
		System.out.println("Good Job! You defeated me!");
	}
}