package helpDesk;

import java.util.ArrayList;
import java.util.Scanner;

public class HelpDesk 
{
	static ArrayList<Tickets> list = new ArrayList<Tickets>();
	
	void getDetails()
	{
		list.add(new Tickets("Register page","Register details","low","Ok"));
		list.add(new Tickets("Login page","Login details","lowest","Bending"));
		list.add(new Tickets("Payment    ","payment details","medium","Not ok"));
		list.add(new Tickets("Order      ","Order details        ","high","bending"));
		list.add(new Tickets("Bill       ","bill details    ","highest","not ok"));
		list.add(new Tickets("User Details","User Information","highest","not ok"));
		list.add(new Tickets("Admin page  ","admin details  ","low","Ok"));
		list.add(new Tickets("Api details","api test","lowest","Ok"));
		list.add(new Tickets("order register","Order Register details","high","bending"));
		list.add(new Tickets("Log out page","Log out details","medium","Bending"));
	}
	
	

	public static void main(String[] args) 
	{
		HelpDesk desk = new HelpDesk();
		desk.getDetails();
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Eeter the priority:  ");
		String priority = sc.nextLine();
		
		for(Tickets res : list)
		{
			if(priority.equalsIgnoreCase(res.getpriority()))
			{
				System.out.println(res.gettitle() + "\t "+ res.getdescription()+ " \t" +res.getstatus());
			}
		}

	}

}
