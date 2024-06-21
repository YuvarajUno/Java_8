package javaBasic;

import java.util.HashMap;
import java.util.Map;

public class FindCharacterSize 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		String str = "aravindarunachalam";
		char[] name = str.toCharArray();
		
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		
		for(char n :name)
		{
			if(map.containsKey(n))
			{
				map.put(n, map.get(n)+1);
			}
			else
			{
				map.put(n, 1);
			}
		}
		
		System.out.println(map);

	}

}
