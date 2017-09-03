
public class GeneratedNumber {
	int digitscount = 3;
	
	int[] digits = new int[digitscount + 1];
	
	public int get_number()
	{
		return generate(digitscount); 
	}
	public int[] get_digits()
	{
		return digits;
	}
	public GeneratedNumber(int wanteddigits)
	{
		digitscount = wanteddigits;
	}
	
	public int generate(int digitscount)
	{
		 // Array of all the 4 digits in the number
		
		int generatedDigit = (int) Math.random() * 9; // Creating the variable of the digit we are going to generate 
				
		for (int i = 0; i <= digitscount; generatedDigit = (int) (Math.random() * 9 + 1)) // Generating random digits untill there are no duplicates
		{
			boolean used = false;
			
			for (int o = 0; o < digitscount; o ++) // Checking if the digit is used already
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
		int number = 0;
		int multiplier = (int) Math.pow(10, digits.length - 1);
		int counter = 0;
		for (counter = 0; counter < digits.length; counter ++)
		{
			number += (digits[counter] * multiplier);
			multiplier /= 10;
		}
		return number;
	}
	
}
