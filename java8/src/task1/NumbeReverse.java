package task1;

public class NumbeReverse 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		int num = 123;
		int r;
		int sum = 0;

		while(num > 0)
		{
			r = num % 10;
			sum = (sum * 10)+r;
			num = num/10;
		}
		System.out.println(sum);

	}

}
