package task1;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "aabbaaa";
		String str2 = "";
	
		
		for(int i =  str.length()-1; i>=0; i--)
		{
			str2 = str2+str.charAt(i);
		}
		if(str.equalsIgnoreCase(str2))
		{
			System.out.println("Palindrome");
		}
		
		else
		{
			System.out.println("fghj");
		}
		

	}

}
