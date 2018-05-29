import java.util.ArrayList;
import java.util.Scanner;

public abstract class User
{
	protected String userName;
	protected String password;
	protected String name;
	protected String role;
	protected int salary;

	public User()
	{
		this.userName = null;
		this.password = null;
		this.name = null;
		this.role = null;
	}
	public User (String userName, String password, String name, String role)
	{
		this.userName = userName;
		this.password = password;
		this.name = name;
		this.role = role;
	}

	public abstract String getUserName();
	public abstract void setUserName(String userName);
	public abstract String getPassword();
	public abstract void setPassword(String Password);
	public abstract String getName();
	public abstract void setName(String name);
	public abstract String getRole();

}
abstract class casualStaff extends User
{
	editProfile edit;
	public void applyCourse(Course course){}
	public int viewSalary(){return this.salary;}
}
abstract class approver extends User
{
	protected ArrayList<Application> appList;
	protected boolean decision;
	public ArrayList<Application> viewCourseAllocation(){return appList;}
	public boolean responsetoCourseAllocation()
	{
		return decision;
	}
}
abstract class courseCoordinator extends User
{
	protected ArrayList<casualStaff> staffList;
	public Course designCoure(Course course)
	{
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter the Coursename: ");
		course.setName(reader.nextLine());
		System.out.println("Enter the course description: ");
		course.setDescription(reader.nextLine());
		System.out.println("Enter the course timetable: ");
		course.setTimeTable(reader.nextLine());
		System.out.println("Enter the number of required staff for the course:");
		course.setNumOfRequiredCasualStaff(reader.nextInt());
		System.out.println("Your "+ course.getName()+ " course has been created with the description of: "+ course.getDescription()+ ". The course has the time table as followed: "+ course.getTimeTable());
		return course;
	}
	public ArrayList<casualStaff> reviewCasualStaff(){return staffList;}
	public void selectCasualStaff(casualStaff staff)
	{
		this.staffList.add(staff);
	}
	public void assignCasualStaff(casualStaff staff)
	{
		selectCasualStaff(staff);
		// assignTimeTable();
	}
	public Application sendAppToApprover(Application application){return application;}
}
abstract class admin extends User
{
	public void addUser(User user){}
	public void deleteUser(User user){}
	public void updatePayRate(double rate){}
	public Report generateReport(Report report)
	{
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter name of the course to be reported: ");
		report.courseName = reader.nextLine();
		System.out.println("Enter the time table of the reported course: ");
		report.courseTimeTable = reader.nextLine();
		System.out.println("Enter the casual staff name of the course: ");
		report.casualStaffName = reader.nextLine();
		System.out.println("Enter the pay rate table: ");
		report.coursePayRateTable = reader.nextLine();
		System.out.println("Done, course report is generated.");
		return report;
	}
}