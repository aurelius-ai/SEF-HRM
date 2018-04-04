/**
 * Created by HP on 4/3/2018.
 */
import java.util.*;
public class user {
    private String name;
    private Date dob;
    private String employeeID;
    private String username;
    private String password;
    private String contactEmail;
    private String contactPhone;
    private String address;
    public String role;
    private int salary;

    public user(){
        this.name = "NULL";
        this.dob = new Date();
        this.employeeID = "NULL";
        this.username = "NULL";
        this.password = "NULL";
        this.contactEmail = "NULL";
        this.contactPhone = "NULL";
        this.address = "NULL";
        this.role = "NULL";
        this.salary = 0;
    }
    public String getName(){return this.name;}
    public Date getDob(){return this.dob;}
    public String getEmployeeID(){return this.employeeID;}
    public String getUsername(){return this.username;}
    public String getPassword(){return this.password;}
    public String getContactEmail(){return this.contactEmail;}
    public String getContactPhone(){return this.contactPhone;}
    public String getAddress(){return this.address;}
    public String getRole(){return this.role;}
    public int getSalary(){return this.salary;}

    public void setName(String name){this.name = name;}
    public void setDob(Date dob){this.dob = dob;}
    public void setEmployeeID(String employeeID){this.employeeID=employeeID;}
    public void setUsername(String username){this.username = username;}
    public void setPassword(String password){this.password = password;}
    public void setContactEmail(String contactEmail){this.contactEmail = contactEmail;}
    public void setContactPhone(String contactPhone){this.contactPhone = contactPhone;}
    public void setAddress(String address){this.address = address;}
    public void setSalary(int salary){this.salary = salary;}

    public void viewProfile(){}
    public void editProfile(){}
    public void writePost(){}
    public void getPost(){}

}
class regularStaff extends user{
    public regularStaff(){
        this.role = "regular";
    }
}
class appovalStaff extends regularStaff{

    public appovalStaff(){
        this.role = "approval";
    }
    public void approveRequest(){}
    public void approveHiring(){}

}
class admin extends appovalStaff{
    public admin(){
        this.role = "admin";
    }

    public void addUser(){}
    public void removeUser(){}
    public void setUserRole(){}


}