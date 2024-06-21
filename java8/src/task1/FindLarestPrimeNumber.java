package task1;

import java.util.ArrayList;
import java.util.List;

public class FindLarestPrimeNumber {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int [] num = {78,69,55,97,98,99,96};
		int prime;
		List<Integer> list = new  ArrayList();
		int count = 0;
		int val;
		
		for(int i = 0; i <= num.length-1; i++)
		{
			val = num[i];
			for(int j = 2; j <= val-1; j++ )
			{
				if(num[i] % j == 0)
				{
					count++; 
				}
			}
			
			if(count == 0)
			{
			
			System.out.println(num[i]);
			}
		}
		
		
	//	System.out.println(list);

	}

}
