import java.util.ArrayList;

/**
 * Created by HP on 5/24/2018.
 */
public class SystemDriver {
    ArrayList<User> Userlist;
    public void validateUser(User user)
    {
        for (int i = 0; i<this.Userlist.size(); i++)
        {
            if(this.Userlist.get(i).userName.equals(user.userName))
            {
                if (this.Userlist.get(i).password.equals(user.password))
                {
                    System.out.println("Valid User");
                }
            }
        }
    }
}
