package task1;

public class Task2 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		String str = "a2b3c4";
		
		
		for(int i = 0; i <= str.length()-1; i++)
		{
			if(i%2 == 1)
			{
				int num = str.charAt(i) - '0';
				
				for(int j = 1; j <= num; j++)
				{
					System.out.print(str.charAt(i-1));
				}
			}
			
		}
		

	}

}
