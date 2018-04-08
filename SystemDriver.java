package HRSystem;
import java.util.*;
public class SystemDriver {
	
	public static void main(String args[])
	{
		String input;
		boolean vaild=false;
		Scanner sc = new Scanner(System.in);
		do{
		System.out.println("Do you have an account?\nIf you have, please enter 1 to Login\nIf you don't have, please enter 2 to register.");
		input=sc.nextLine();//Choose login or register ID
		if(input.equals("1"))
		{
			vaild=true;
			//go to login page/function str1.equals(str2)
		}
		else if(input.equals("2"))
		{
			vaild=true;
			//go to register page/function
		}
		else
		{
			vaild=false;
			System.out.print("Invaild input! Please try again!");
		}
	}while(vaild==false);
}
}
