package studentDetails;

public class StudentRecord 
{
	private String studentName;
	private String studentId;
	private String course;
	
	StudentRecord(String studentName,String studentId,String course)
	{
		this.studentName = studentName;
		this.studentId   = studentId;
		this.course      = course; 
		
	}
	
	StudentRecord()
	{
		
	}
	
	
	
	
	public String getstudentName()
	{
		return studentName;
	}
	
	public String getstudentId()
	{
		return studentId;
	}
	
	public String getcourse()
	{
		return course;
	}
	
}
