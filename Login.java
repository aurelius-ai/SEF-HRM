
	import java.awt.Dimension;
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

	public class Login {
		final static String userName1 = "e1234567";//Causal staff
		final static String password1 = "1234567";
		final static String userName2 = "e2345678";//approval staff
		final static String password2 = "2345678";
		final static String userName3 = "e3456789";//Co-co
		final static String password3 = "3456789";
		final static String userName4 = "admin";
		final static String password4 ="admin";
		public static void main(String[] args) {

			dashboard d=new dashboard();
			JFrame jFrame = new JFrame("login");
			Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
			jFrame.setBounds(((int)dimension.getWidth() - 200) / 2, ((int)dimension.getHeight() - 300) / 2, 200, 150);
			jFrame.setResizable(false);
			jFrame.setLayout(null);
			jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
			JLabel label1 = new JLabel("id");
			label1.setBounds(10, 10, 100, 30);
			jFrame.add(label1);
			
			JLabel label2 = new JLabel("psw");
			label2.setBounds(10, 40, 100, 30);
			jFrame.add(label2);
			
			final JTextField text1 = new JTextField();
			text1.setBounds(50, 15, 130, 20);
			jFrame.add(text1);
			
			final JPasswordField text2 = new JPasswordField();
			text2.setBounds(50, 45, 130, 20);
			jFrame.add(text2);
			
			JButton button = new JButton("Login");
			button.setBounds(10, 75, 170, 40);
			button.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					if(userName1.equals(text1.getText()) && password1.equals(text2.getText())) {
						JOptionPane.showMessageDialog(null, "you are causal staff", "success", JOptionPane.INFORMATION_MESSAGE);
						try {
							d.dashboard1();
						} catch (ParseException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
						System.exit(0);
					} 
          else if(userName2.equals(text1.getText()) && password2.equals(text2.getText())) {
						JOptionPane.showMessageDialog(null, "you are approval staff", "success", JOptionPane.INFORMATION_MESSAGE);
						d.dashboard2();
						System.exit(0);
					} 
          else if(userName3.equals(text1.getText()) && password3.equals(text2.getText())) {
						JOptionPane.showMessageDialog(null, "you are Co-co", "success", JOptionPane.INFORMATION_MESSAGE);
						d.dashboard3();
						System.exit(0);
					} 
          else if(userName4.equals(text1.getText()) && password4.equals(text2.getText())) {
				JOptionPane.showMessageDialog(null, "you are admin", "success", JOptionPane.INFORMATION_MESSAGE);
				d.dashboard4();
				System.exit(0);
			} 
          else {
						JOptionPane.showMessageDialog(null, "wrong id/password", "error", JOptionPane.ERROR_MESSAGE);
						text1.setText("");
						text2.setText("");
					}
				}
			});
			jFrame.add(button);
			
			jFrame.setVisible(true);
		}
	}
