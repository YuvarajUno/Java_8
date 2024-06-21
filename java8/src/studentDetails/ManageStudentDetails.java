package studentDetails;

import java.util.ArrayList;
import java.util.Scanner;

public class ManageStudentDetails 
{

	static ArrayList<StudentRecord> list = new ArrayList();
	
	void getStudentDetails()
	{
		list.add(new StudentRecord("Yuvaraj", "java12", "Java"));
		list.add(new StudentRecord("Saha", "python22", "Python"));
		list.add(new StudentRecord("Aravind", "python15", "Python"));
		list.add(new StudentRecord("Vicky", "angular17", "Angular"));
		list.add(new StudentRecord("Vaandayar", "Java07", "Java"));
		list.add(new StudentRecord("Chandra Mohan", "angular22", "Angular"));
		list.add(new StudentRecord("Prasanth", "python78", "Python"));
		list.add(new StudentRecord("Sachin  ", "Java88", "Java"));
		list.add(new StudentRecord("Kl Rahul", "pythod23", "Python"));
		list.add(new StudentRecord("Abishek sharma", "angular23", "Angular"));
		
	}
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		ManageStudentDetails details = new ManageStudentDetails();
		details.getStudentDetails();
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter course :  ");
		String course = sc.nextLine();
		
		for(StudentRecord rec : list)
		{
			if(rec.getcourse().equalsIgnoreCase(course))
			{
				System.out.println(rec.getstudentName()+" \t" + rec.getstudentId());
			}
			
		
		}
		
		

	}

}
