import org.junit.Test;
import org.junit.Assert.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

/**
 * Created by HP on 5/22/2018.
 */
public class LoginTest {
    @Test
    public void main() throws Exception {

    }
    @Test
    public void FailToLoginWrongUserName()
    {
        Login login = new Login();
        assertNotEquals("Wrong username", login.userName1, "e9876543" );
        assertEquals("Correct password", login.password1, "1234567" );
    }
    @Test
    public void FailToLoginWrongPassword()
    {
        Login login = new Login();
        assertEquals("Correct Username", login.userName1, "e1234567");
        assertNotEquals("Wrong password", login.password1, "2345678");
    }
    @Test
    public void LoginAsCasualStaff()
    {
        Login login = new Login();
        assertEquals("Correct casual staff username", login.userName1, "e1234567");
        assertEquals("Correct casual staff password", login.password1, "1234567");
    }
    @Test
    public void LoginAsApprovalStaff()
    {
        Login login = new Login();
        assertEquals("Correct approval staff username", login.userName2, "e2345678");
        assertEquals("Correct approval staff password", login.password2, "2345678");
    }
    @Test
    public void LoginAsCoCo()
    {
        Login login = new Login();
        assertEquals("Correct CoCo username", login.userName3, "e3456789");
        assertEquals("Correct CoCo password", login.password3, "3456789");
    }
    @Test
    public void LoginAsAdmin()
    {
        Login login = new Login();
        assertEquals("Correct admin username", login.userName4, "admin");
        assertEquals("Correct admin password", login.password4, "admin");
    }

}