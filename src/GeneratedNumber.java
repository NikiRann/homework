
public class GeneratedNumber {
	int digitscount;
	
	int[] digits;
	
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
		digits = new int[wanteddigits];
		digitscount = wanteddigits;
	}
	
	public int generate(int digitscount)
	{
		 // Array of all the n digits in the number
		
		int generatedDigit = (int) Math.random() * 9; // Creating the variable of the digit we are going to generate 
		
		boolean[] usedDigits = new boolean[10];
		
		for (int i = 0; i < digitscount; generatedDigit = (int) (Math.random() * 9)) // Generating random digits untill there are no duplicates
		{
			
			if (!usedDigits[generatedDigit] && generatedDigit != 0)
			{
				
				digits[i] = generatedDigit;
				usedDigits[generatedDigit] = true;
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
