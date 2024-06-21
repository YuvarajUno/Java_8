package task1;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] num = {1,2,2,5,4,7,8,7,4,5,1};
		
		Set <Integer> set = new HashSet();
		
		for(Integer x : num)
		{
			set.add(x);
		}
		System.out.println(set);
		
		
//		
	}

}


//for(int i = 0; i <= num.length-1; i++)
//	{
//		for(int j = i+1; j <= num.length-1; j++)
//		{
//			if(num[i] == num[j])
//			{
//				
//			}
//			else
//			{
//				System.out.println(num[j]);
//			}
//		}
//	}
