
public class BullsAndCowsCounter {
	public result detect (char[] num1, int[] num2,int length)
	{
		
		
		boolean[] bulls = new boolean[length];
		
		int foundBulls = 0;
		int foundCows = 0;
		
		// Checking for bulls
		
		for (int i = 0; i <= 3; i ++)
		{
			if (num1[i] == (char)(num2[i] + '0'))
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
					if (num1[i] == (char)(num2[o] + '0'))
					{
						foundCows ++;
					}
				}
			}
		}
		result answer = new result(foundBulls, foundCows);
		return answer;
	}
}
