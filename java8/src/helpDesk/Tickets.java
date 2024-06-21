package helpDesk;

public class Tickets 
{

	public String title;
	public String description;
	public String priority;
	public String status;
	
	
	public Tickets(String title,String description,String priority,String status)
	{
		this.title       = title;
		this.description = description;
		this.priority    = priority;
		this.status      = status;
	}
	
	public String gettitle()
	{
		return title;
	}
	
	public String getdescription()
	{
		return description;
	}
	
	public String getpriority()
	{
		return priority;
	}
	
	
	
	public String getstatus()
	{
		return status;
	}
	
	public String toString()
	{
		return title+" "+description+" "+priority+" "+status;
	}
	

}
