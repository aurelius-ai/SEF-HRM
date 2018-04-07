 package HRSystem;
import java.util.*;
import java.time.*;
import java.math.*;
import java.text.*;

 public static void register() throws Exception
 	{
	 	String name;
	 	String month,day,year;
	 	String contactEmail;
	 	String contactPhone;
	 	String address;
	 	String input;
	 	boolean vaild=false;
	 	boolean vaildinput=false;
	 	Scanner sc = new Scanner(System.in);
	 	SimpleDateFormat fmt = new SimpleDateFormat("dd MM yyyy");
	 	do{
	 	System.out.println("Hi! Welcome to the RMIT, please fill in the details on the following questions.\nAnd after you finish typing, press enter to continue.");
	 	System.out.println("Your Full Name:");
	 	name=sc.nextLine();
	 	System.out.println("Your date of brith dd:");
	 	day=sc.nextLine();
	 	System.out.println("Your date of brith mm:");
	 	month=sc.nextLine();
	 	System.out.println("Your date of brith yyyy:");
	 	year=sc.nextLine();
	 	System.out.println("Your contact Email:");
	 	contactEmail=sc.nextLine();
	 	System.out.println("Your contact Phone number:");
	 	contactPhone=sc.nextLine();
	 	System.out.println("Ypur address:");
	 	address=sc.nextLine();
	 	Date dob = fmt.parse(day+" "+month+" "+year);
	 	System.out.println("\n\n\nYour Full name is:"+name);
	 	System.out.println("Your dob is: "+dob);
	 	System.out.println("Your contact Emai is:"+contactEmail);
	 	System.out.println("Your contact Phone number is:"+contactPhone);
	 	System.out.println("Your address is:"+address);
	 	
	 	do{
	 	System.out.println("Please enter 1 to confirm your personal details are all right.");
	 	System.out.println("Please enter 2 if you want to renew your personal details.");
	 	System.out.println("Please press enter to continue.");
	 	input=sc.nextLine();
	 	if(input.equals("1"))
	 	{
	 		vaild=true;
	 		vaildinput=true;
	 	}	
	 	else if(input.equals("2"))
	 	{
	 		vaild=false;
	 		vaildinput=true;
	 	}
	 	else
	 	{
	 		vaildinput=false;	
	 		System.out.println("Please enter the vaild number.");
	 	}
	 	}while(vaildinput=false);
	 	}while(vaild=false);
 	}
}
 
