import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;
import java.util.Date;

class BalanceEnquiry implements ActionListener 
{
	JFrame jf;
JButton back;
    JLabel l1,image1;
	String st;
BalanceEnquiry(String st)
{
 jf = new JFrame("Blance check");
	 this.st=st;
	 ImageIcon im= new ImageIcon("images\\atm.jpg");
  Image im1=im.getImage(). getScaledInstance(600,300,Image.SCALE_DEFAULT);
  ImageIcon im2=new ImageIcon(im1);
  image1=new JLabel(im2);
  image1.setBounds(0,0,600,300);
  
  back = new JButton("Back");
	  back.setForeground(Color.red);
	   back.setBounds(500,7,70,30);
  image1.add(back);
  jf.add(image1);
  l1=new JLabel();
  l1.setBounds(80,100,300,30);
  image1.add(l1);
  
  
  
  
  int balance = 0;
        try{
            conn c1 = new conn();
            ResultSet rs = c1.s.executeQuery("select * from bank where CUSTOMER_ID = '"+st+"'");
            while (rs.next()) {
                if (rs.getString("TYPE").equals("Deposit")) {
                    balance += Integer.parseInt(rs.getString("amount"));
                } else {
                    balance -= Integer.parseInt(rs.getString("amount"));
                }
            }
        }catch(Exception e){}
        
        l1.setText("Your Current Account Balance is Rs "+balance);
		 l1.setFont(new Font("serif",Font.BOLD,15));
		 l1.setForeground(Color.red);
       back.addActionListener(this);
  
  
   jf.setLayout(null);
	  jf.setLocation(400,200);
	 jf.setSize(600,300);
	 jf.setVisible(true);
	 }
 public void actionPerformed(ActionEvent ae)
 {
	 if(ae.getSource()==back)
	 {
		 jf.setVisible(false);
		 new BankingInfo(st);
	 }
 }
	 public static void main(String ar[])
{
new BalanceEnquiry("");
}
}