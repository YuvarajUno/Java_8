package projectMangementTool;

import java.time.LocalDate;
import java.util.Map;

public class Project 
{
	String name;
	LocalDate startDate;
	LocalDate endDate;
	
	String task1;
	String task2;
	String task3;
	
	public String getTask1() {
		return task1;
	}



	public String getTask2() {
		return task2;
	}



	public String getTask3() {
		return task3;
	}



	public boolean isRes1() {
		return res1;
	}



	public boolean isRes2() {
		return res2;
	}



	public boolean isRes3() {
		return res3;
	}

	boolean res1;
	boolean res2;
	boolean res3;
	
	
	
	
	Project(String name,LocalDate startDate,LocalDate endDat,String task1,boolean res1,String task2,boolean res2,String task3,boolean res3)
	{
		this.name      = name;
		this.startDate = startDate;
		this.endDate   = endDat;
		this.task1 = task1;
		this.task2 = task2;
		this.task3 = task3;
		this.res1  = res1;
		this.res2  = res2;
		this.res3  = res3;
	}
	
	public Project() {
		
	}


	public String getName() {
		return name;
	}

	public LocalDate getStartDate() {
		return startDate;
	}

	public LocalDate getEndDate() {
		return endDate;
	}

	@Override
	public String toString() {
		return name+" "+startDate+" "+endDate+" "+task1+" "+res1+" "+task2+" "+res2+" "+task3+" "+res3;
	}
}
