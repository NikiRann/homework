
public class BullsAndCowsCounter {
	public result detect (char[] num1, int[] num2, int length)
	{
		
		
		boolean[] bulls = new boolean[length];
		
		int foundBulls = 0;
		int foundCows = 0;
		
		// Checking for bulls and cows
		
		for (int i = 0; i <= length; i ++)
		{
			
			if (num1[i] != (char)(num2[i] + '0'))
			{
				for (int o = 0; o <= length; o ++)
				{
					if (num1[i] == (char)(num2[o] + '0'))
					{
						foundCows ++;
					}
				}
			}
			else
			{
				foundBulls ++;
			}
		}
		
		result answer = new result(foundBulls, foundCows);
		return answer;
	}
}
