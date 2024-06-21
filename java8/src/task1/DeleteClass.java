package task1;

import java.util.HashMap;

public class DeleteClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "yuvarajKrishnakumar";
		char[] cha =str.toCharArray();
		System.out.println(str.length());
		HashMap<Character, Integer> map = new HashMap();
		
		for(char x : cha)
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
		System.out.println(map);

	}

}
