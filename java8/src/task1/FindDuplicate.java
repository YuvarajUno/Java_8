package task1;

public class FindDuplicate 
{

	public static void main(String[] args) 
	{
		int[] num = {1,2,2,5,4,7,8,7,4,5,1};
		
		for(int i = 0; i <= num.length-1; i++)
		{
			for(int j = i+1; j <= num.length-1; j++)
			{
				if(num[i] == num[j])
				{
					System.out.print(num[i]);
				}
			}
		}

	}

}
