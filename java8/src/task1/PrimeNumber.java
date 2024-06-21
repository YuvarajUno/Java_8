package task1;

public class PrimeNumber {

	public static void main(String[] args) 
	{
		int num = 29;
		int count = 0;
		
		for(int i = 2;  i <= num-1; i++)
		{
			if(num % i == 0)
			{
				count++;
			}
		}
		System.out.println(count);
		
		if(count == 0)
		{
			System.out.println(" primeNumber");
		}
		else
		{
			System.out.println("non");
		}

	}

}
