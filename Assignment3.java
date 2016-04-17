/**
 * @author: Zeyang Wang
 * Email: zw2991@email.vccs.edu
 * date 3,20,2016
 * 
 */
import javax.swing.JOptionPane;


public class Assignment3 {
	
	public static void main(String [] args){
		String s1 = "www";
		String s2="qqq";
		String s3="eee";
		String p1="111";
		String p2="222";
		String p3="333";
		String [] type	=	{"student","Admin","staff"};
		
		String	s4=JOptionPane.showInputDialog("please enter your username");
		while(!s4.equals(s1)&&!s4.equals(s2)&&!s4.equals(s3)){
			JOptionPane.showMessageDialog(null, "wrong username please enter again");
			s4=JOptionPane.showInputDialog("please enter your username");
		}
		int i=1;
		String	p4=JOptionPane.showInputDialog("please enter your password");
		boolean correct1=(s1.equals(s4)&&p1.equals(p4));
		boolean correct2=(s2.equals(s4)&&p2.equals(p4));
		boolean correct3=(s3.equals(s4)&&p3.equals(p4));
		while(i<=3&&!correct1&&!correct2&&!correct3){
		i++;
			JOptionPane.showMessageDialog(null, "wrong username or password, please enter again.");
			p4=JOptionPane.showInputDialog("please enter your password");
		}
			
				if(i>3){
					JOptionPane.showMessageDialog(null, "sorry, your account had been locked");
				}else{
					JOptionPane.showMessageDialog(null, "hello "+ s4 +" please choose your account type");
					String s5=(String)JOptionPane.showInputDialog(null,"select user role","type",JOptionPane.PLAIN_MESSAGE,null,type,type[2]);
					
				switch(s5){
				
				case("Admin"):
					JOptionPane.showMessageDialog(null, "Welcome Admin! You can update and read file.");
				break;
				case("student"):
					JOptionPane.showMessageDialog(null, "Welcome student! You can update and read file.");
				break;
				case("staff"):
					JOptionPane.showMessageDialog(null, "Welcome Staff! You can update and read file.");
				break;
				
				
				}
				}
		}
}



