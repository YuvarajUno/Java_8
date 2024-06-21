package functionalInterface;

import java.util.ArrayList;
import java.util.function.Predicate;

public class PredicateEx1 
{
	String name;
	float percentage;
	PredicateEx1(String name,float percentage)
	{
		this.name = name;
		this.percentage = percentage;
	}
	
	String getName()
	{
		return name;
		
	}
	
	float getPercentage()
	{
		return percentage;
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		
		ArrayList <PredicateEx1> list = new ArrayList();
		list.add(new PredicateEx1("Yuvaraj", 45.58F));
		list.add(new PredicateEx1("Aravind", 49.9F));
		list.add(new PredicateEx1("Vicky", 65.58F));
		list.add(new PredicateEx1("Saha", 99F));
		list.add(new PredicateEx1("Vandayar", 65F));
		
		Predicate<PredicateEx1> pre = (val)-> val.getPercentage() >= 50;
		
		for(PredicateEx1 student : list )
		{
			if(pre.test(student))
			{
				System.out.println(student.getName());
			}

		};
	}

}
