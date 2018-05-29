/**
 * Created by HP on 5/24/2018.
 */
import java.util.*;
public class Section {
    public String startTime;
    public String endTime;
    public User staff;
    public ArrayList<User> studentList;
    public Section()
    {
        this.startTime = null;
        this.endTime = null;
    }
    public Section(String start, String end)
    {
        this.startTime = start;
        this.endTime = end;
    }
    public void addStudent(User student){this.studentList.add(student);}
    public void removeStudent(User student){this.studentList.remove(student);}
    public String getStartTime(){return this.startTime;}
    public String getEndTime(){return this.endTime;}
    public void setStartTime(String newStart){this.startTime = newStart;}
    public void setEndTime(String newEnd){this.endTime = newEnd;}
}
class lectureSection extends Section
{
    public String lectureName;
    public void addLecture(User Lecture){
        this.staff = Lecture;
    }
    public User showLecture(){return this.staff;}
    public void removeLecture()
    {
        this.staff = null;
    }
}
class tutorialSection extends Section
{
    public String tutorName;
    public void addLecture(User tutor){
        this.staff = tutor;
    }
    public User showTutor(){return this.staff;}
    public void removeTutor()
    {
        this.staff = null;
    }
}
