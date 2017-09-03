import java.util.Scanner;

public class patternfinder {
	
	
	public static void main(String[] args) 
	{
		// Getting the input 
		
		Scanner s = new Scanner(System.in);
		String input = s.nextLine();
		
		// Spliting the input into a pattern and a input, in which we are going to check for the pattern
		
		String[] splited = input.split(" ");
		
		char[] k = splited[0].toCharArray();
		
		char[] pattern = splited[1].toCharArray();
		
		// Checking for the pattern
		
		
		boolean complete = false;
		
		int currentlength = 0; // Current length from the pattern
		
		
		int patternlength = 0; // pattern.length, but without the '*' symbol
		
		int firstletter = 0; 
		
		int lastletter = 0;
		
		boolean foundfirstletter = false;
		
		for (int i = 0; i < pattern.length; i ++)
		{
			if (pattern[i] != '*' && pattern[i] != '?' && !foundfirstletter)
			{
				firstletter = i;
				foundfirstletter = true;
			}
			
			if (pattern[i] != '*' )
			{
				patternlength ++;
			}

			if (pattern[i] != '*' && pattern[i] != '?')
			{
				lastletter = i;
			}
		}
		if (patternlength <= k.length) {
		for (int i = 0; i < k.length; i ++)
		{
			if (k[i] == pattern[firstletter]) // Checking if we found the pattern start
			{
				
				currentlength = firstletter;
				for (int o = i; o < k.length - 1; o ++)
				{
					
					if (k[o] == pattern[currentlength] || pattern[currentlength] == '?') // Checking if the pattern continues
					{
						
						currentlength ++;
					}
					else if(pattern[currentlength] == '*') // 2 cases if the symbol is a *
					{

						if (currentlength > lastletter) // If the symbol is the last from the pattern we have found the pattern
						{
							complete = true;
							break;
						}
						else
						{
							
							int nextletter = currentlength + 1;
							
							if (pattern[currentlength + 1] == '*' || pattern[currentlength + 1] == '?')
							{
								
								for (int p = currentlength + 1; p < pattern.length; p ++)
								{
									if (pattern[p] != '*')
									{
										nextletter = i;
										break;
									}
								}
							}
							
							while (k[o] != pattern[nextletter - 1] && o < k.length - 1)
							{
								o ++;
							}
							currentlength = nextletter;
						}
					}
					else
					{
						break;
					}
					if (currentlength + 1 >= patternlength)
					{
						complete = true;
						break;
					}
				}
			}
			if (complete)
			{
				break;
			}
		}
		}
		if (!foundfirstletter && patternlength <= k.length)
		{
			System.out.println(true);
		}
		else
		{
			System.out.println(complete);
		}
			
	}
}