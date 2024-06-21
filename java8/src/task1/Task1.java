package task1;

import java.util.HashMap;
import java.util.Map;

public class Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "aabbbcccc";
		char[] str2 = str.toCharArray();
		Map <Character,Integer> map = new HashMap();
		
		for(char x : str2)
		{
			if(map.containsKey(x))
			{
				map.put(x, map.get(x)+1);
			}
			
			else
			{
				map.put(x, 1);
			}
		}
		
		
		for(Map.Entry<Character, Integer> e : map.entrySet())
		{
			System.out.print(e.getKey()+""+e.getValue());
		}

	}

}
