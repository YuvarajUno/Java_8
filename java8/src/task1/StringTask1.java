package task1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StringTask1 
{

	public static void main(String[] args) 
	{
		String value = " / name = \"Yuvaraj\" / companyName = \"Uniq tech\" / experience = \"3 year\" ";
		String key = null;
		String value1 = null;
		String[] split = value.split(" /");
		
		Map <String, String> map = new HashMap();
		
		for (String s : split)
		{
			System.out.println(s);
			String[] split2 = s.split(" = ");
			
			for(String s2 :split2 )
			{
				if(s2.contains("\""))
						{
							 value1 = s2;
							 System.out.println();
						}
				
				else
				{
					key = s2;
				}
				map.put(key, value1);
			}
				
			}
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter what you want");
		String details = " "+sc.nextLine();
		
		System.out.println(map.get(details));
			
		

	}

}
