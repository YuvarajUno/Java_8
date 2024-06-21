package task1;

import java.util.Scanner;

public class StringTask2 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		String value = " / name = \"Yuvaraj\" / companyName = \"Uniq tech\" / experience = \"3 year\" ";
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter what you want");
		String details = " "+sc.nextLine();
		
		
		String[] split = value.split(" /");
		for (String s : split)
		{
			String[] split2 = s.split(" = ");
			for(int i = 0; i <= split2.length-1; i++)
			{

				if(split2[i].contains(details))
				{
					System.out.println(split2[i+1]);
				}
			}
			
			
		}

	}

}
