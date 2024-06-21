package task1;

public class Fibonacci 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int x = 0;
		int y = 1;
		
		int num = 10;
		
		for(int i = 0; i <= num; i++)
		{
			int z = x + y;
			System.out.print(x+" ");
			x = y;
			y = z;
		}
		
	}

}
