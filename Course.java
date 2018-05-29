import java.util.*;

public class Course
{
	private String name;
	private String description;
	private String timeTable;
	private int numOfRequiredCasualStaff;

	public Course(String name, String description, String timeTable, int numOfRequiredCasualStaff)
	{
		this.name = name;
		this.description = description;
		this.timeTable = timeTable;
		this.numOfRequiredCasualStaff = numOfRequiredCasualStaff;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public String getDescription()
	{
		return description;
	}
	public String getTimeTable(){return timeTable;}

	public void setDescription(String description)
	{
		this.description = description;
	}

	public int getNumOfRequiredCasualStaff()
	{
		return numOfRequiredCasualStaff;
	}
	public void setTimeTable(String timeTable){this.timeTable = timeTable;}
	public void setNumOfRequiredCasualStaff(int numOfRequiredCasualStaff)
	{
		this.numOfRequiredCasualStaff = numOfRequiredCasualStaff;
	}
	

























}