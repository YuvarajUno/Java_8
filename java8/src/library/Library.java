package library;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Library implements Comparator<Books>
{
	Books book = new Books();
	static ArrayList<Books> list = new ArrayList<Books>();
	
	void getDetails()
	{
		Library l = new Library();
		
		list.add(new Books("King of Jappan" ,"Aravind", 85));
		list.add(new Books("Sword Fight","Vicky", 93));
		list.add(new Books("Wing of Fire","Vaandayar", 85));
		list.add(new Books("China King","Saha", 93));
		list.add(new Books("samayal kurippu","Aravind", 45));
		list.add(new Books("Kaasa Panama","Vaandayar", 15));
		list.add(new Books("Nanum Rowdy Than...","Saha", 22));
		list.add(new Books("Marma Desathu Modern Vicky","Vicky", 100));
		list.add(new Books("Avaraa!!! Payangarama Aal Aache","Vicky", 76));
		list.add(new Books("Vanga Palakalaam","Aravind", 150));
		list.add(new Books("Maadi veetu Malavika!!!","Saha", 65));
		list.add(new Books("Silakki Dumma","Vaandayar", 31));
		list.add(new Books("Manasellam Mandhra..","Aravind", 25));
		
		Collections.sort(list,l);
	}
	
	public static void main(String[] args) 
	{
		Library l = new Library();
		l.getDetails();
		
	
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Author Name :  ");
		String name = sc.nextLine();
		
		for(Books book : list)
		{
			if(book.getAuthor().equals(name))
					{
				System.out.println(book.getBookName()+ "\t\t "+ book.getCopies());
					}
			Collections.sort(null);
		}
		
	}

	@Override
	public int compare(Books o1, Books o2) 
	{
		if(o1.getCopies() > o2.getCopies())
		return 1;
		
		else
			return -1;
	}
}


