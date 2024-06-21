package trackSalesData;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TrackingData 
{
	static List<RetailStore> list = new ArrayList();
	
	void getDetails()
	{
		list.add(new RetailStore(LocalDate.of(2024, 1, 10),"Tv002",10,25000));  
		list.add(new RetailStore(LocalDate.of(2024, 1, 11),"Mi007",3,17000));  
		list.add(new RetailStore(LocalDate.of(2024, 1, 14),"Wm012",1,13000));  
		list.add(new RetailStore(LocalDate.of(2024, 1, 10),"fri02",3,23500));   
		list.add(new RetailStore(LocalDate.of(2024, 1, 10),"Ac002",7,38000));
		list.add(new RetailStore(LocalDate.of(2024, 1, 11),"fri02",5,23500));   
		list.add(new RetailStore(LocalDate.of(2024, 1, 10),"Mi007",3,17000)); 
		list.add(new RetailStore(LocalDate.of(2024, 1, 13),"Wm012",3,13000));   
		list.add(new RetailStore(LocalDate.of(2024, 1, 11),"Tv002",6,25000));  
		list.add(new RetailStore(LocalDate.of(2024, 1, 14),"Ac002",2,38000));
		list.add(new RetailStore(LocalDate.of(2024, 1, 14),"Tv002",1,25000)); 
		list.add(new RetailStore(LocalDate.of(2024, 1, 12),"Wm012",6,13000));
		list.add(new RetailStore(LocalDate.of(2024, 1, 11),"Ac002",9,38000));
		list.add(new RetailStore(LocalDate.of(2024, 1, 12),"Mi007",3,17000)); 
		list.add(new RetailStore(LocalDate.of(2024, 1, 12),"fri02",8,23500));  
		list.add(new RetailStore(LocalDate.of(2024, 1, 13),"Ac002",3,38000));
		list.add(new RetailStore(LocalDate.of(2024, 1, 13),"Tv002",3,25000)); 
		list.add(new RetailStore(LocalDate.of(2024, 1, 11),"Wm012",6,13000));
		list.add(new RetailStore(LocalDate.of(2024, 1, 13),"fri02",0,23500));   
		list.add(new RetailStore(LocalDate.of(2024, 1, 14),"Mi007",3,17000)); 
		list.add(new RetailStore(LocalDate.of(2024, 1, 11),"Ac002",9,38000));
		list.add(new RetailStore(LocalDate.of(2024, 1, 11),"Mi007",3,17000));
		list.add(new RetailStore(LocalDate.of(2024, 1, 14),"fri02",9,23500));   
		list.add(new RetailStore(LocalDate.of(2024, 1, 10),"Wm012",2,13000));  
		list.add(new RetailStore(LocalDate.of(2024, 1, 13),"Tv002",7,25000));   
		
		
	}
	

	public static void main(String[] args) 
	{
		TrackingData obj = new TrackingData();
		obj.getDetails();
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the day : ");
		int day = sc.nextInt();
		
		LocalDate date = LocalDate.of(2024, 1, day);
	
		long sum = 0;
		
		for(RetailStore details : list)
		{
		 if(details.getTimestamp().equals(date) )	
		 {
			 sum +=  details.getPrice();
			 
		 }
		
		}
		
		System.out.println(date +" total price   "+ sum + " Rupees");

	}

}
