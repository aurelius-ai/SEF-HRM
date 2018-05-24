import java.util.ArrayList;

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
	public boolean responsetoCourseAllocation(){return decision;}
}
abstract class courseCoordinator extends User
{
	protected ArrayList<casualStaff> staffList;
	public Course designCoure(Course course){return course;}
	public ArrayList<casualStaff> reviewCasualStaff(){return staffList;}
	public void selectCasualStaff(casualStaff staff){}
	public void assignCasualStaff(casualStaff staff){}
	public Application sendAppToApprover(Application application){return application;}
}
abstract class admin extends User
{
	public void addUser(User user){}
	public void deleteUser(User user){}
	public void updatePayRate(double rate){}
	public Report generateReport(Report report){return report;}
}