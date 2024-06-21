package projectMangementTool;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ProjectManagementTool 
{
	static ArrayList<Project> list = new ArrayList<Project>();
	Map <String,Project> map = new HashMap<String, Project>();
	
	
	
	void getDetails()
	{
		
		list.add(new Project("Project1",LocalDate.of(2023, 06, 01),LocalDate.of(2024, 03, 31),
				"Task1",true,"Task2",true,"Task3",false));
		list.add(new Project("Project2",LocalDate.of(2023, 01, 26),LocalDate.of(2024, 02, 03),
				"Task1",false,"Task2",true,"Task3",false));
		list.add(new Project("Project3",LocalDate.of(2024, 01, 02),LocalDate.of(2024, 05, 06),
				"Task1",true,"Task2",true,"Task3",true));
		
		
	
		
	}
	

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		ProjectManagementTool m = new ProjectManagementTool();
		m.getDetails();
		System.out.println(list);
		
		for(Project res : list)
		{
			if(!res.isRes1())
			{
				System.out.println(res.getName()+ " "+res.getTask1());
			}
			
			if(!res.isRes2())
			{
				System.out.println(res.getName()+ " "+res.getTask2());
			}
			
			if(!res.isRes3())
			{
				System.out.println(res.getName()+ " "+res.getTask3());
			}
		}

	}

}
