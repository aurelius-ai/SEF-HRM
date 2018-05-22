public abstract class User
{
	protected String userName;
	protected String password;
	protected String name;
	protected String role;

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