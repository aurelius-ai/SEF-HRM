import java.util.*;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
public class dashboard extends JFrame{
		String input;
		Scanner sc = new Scanner(System.in);
		editProfile e=new editProfile();
		public void dashboard1() throws ParseException
		{
			System.out.println("1.View/Edit profile\n2.Apply Course\n3.View salary\n");
			input=sc.nextLine();
			if (input.equals("1"))
			{
				e.editProfile();
			}
		}
		public void dashboard2()
		{
			System.out.println("1.Course corfirmation\n2.Responds of allocation\n");
			
			
		}
		public void dashboard3()
		{

			System.out.print("1.Design course\n2.Manage causal staff\n3.Sending allocation to approver");
			
		}
		public void dashboard4()
		{

			System.out.print("1.update pay=rate table\n2.Generate report\n3.Add/Delete user");
		}
}
