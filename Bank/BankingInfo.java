import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class BankingInfo implements ActionListener 
{
  JFrame fr;
  JLabel image1,l1,id;
  JButton b1,b2,b3,b4,b5,b6,b7;
  
  String jt;
  
   BankingInfo(String jt)
   {
   fr=new JFrame("Bank Information Details");
   this.jt=jt;
   // image
  ImageIcon im= new ImageIcon("images\\atm.jpg");
  Image im1=im.getImage(). getScaledInstance(600,350,Image.SCALE_DEFAULT);
  ImageIcon im2=new ImageIcon(im1);
  image1=new JLabel(im2);
  image1.setBounds(0,0,600,350);
  fr.add(image1);
  l1=new JLabel("Customer_id");
  l1.setBounds(30,10,105,30);
  l1.setForeground(Color.red);
  id=new JLabel(jt);
  id.setBounds(130,10,125,30);
  id.setForeground(Color.blue);
  
  b1=new JButton("ACCOUNT DETAILS");
  b1.addActionListener(this);
  b1.setForeground(Color.red);
  b1.setBounds(70,70,150,30);
  b2=new JButton("DEPOSIT CASH");
  b2.addActionListener(this);
  b2.setForeground(Color.red);
  b2.setBounds(250,70,150,30);
  b3=new JButton("WITHDRAW CASH");
  b3.addActionListener(this);
  b3.setForeground(Color.red);
  b3.setBounds(70,120,150,30);
  b4=new JButton("MINI STATEMENT");
  b4.addActionListener(this);
  b4.setForeground(Color.red);
  b4.setBounds(250,120,150,30);
  b5=new JButton("PIN CHANGE");
  b5.addActionListener(this);
  b5.setForeground(Color.red);
  b5.setBounds(70,170,150,30);
  b6=new JButton("BALANCE ENQURY");
  b6.addActionListener(this);
  b6.setForeground(Color.red);
  b6.setBounds(250,170,150,30);
  b7= new JButton("LOGOUT");
  b7.addActionListener(this);
  b7.setForeground(Color.red);
  b7.setBounds(500,0,100,30);
  image1.add(b1);
   image1.add(b2);
   image1.add(b3);
   image1.add(b4);
   image1.add(b5);
   image1.add(b6);
   image1.add(b7);
    image1.add(l1);
   image1.add(id);
   
   fr.setLayout(null);
  fr.setLocation(400,200);
fr.setSize(600,350);
 fr.setVisible(true);
}
public void actionPerformed(ActionEvent ae)
{
	String  st=id.getText();
	if(ae.getSource()==b1)
	{
		fr. setVisible(false);
		new details(st);
	}
	if(ae.getSource()==b2)
	{
		fr. setVisible(false);
		new Deposite(st);
	}
	if(ae.getSource()==b3)
	{
		fr. setVisible(false);
		new Withdrawl(st);
	}
	if(ae.getSource()==b4)
	{
		fr. setVisible(false);
		new MiniStatement(st);
	}
	if(ae.getSource()==b5)
	{
		fr. setVisible(false);
		new PinChange(st);
	}
	if(ae.getSource()==b6)
	{
		fr. setVisible(false);
		new BalanceEnquiry(st);
	}
	if(ae.getSource()==b7)
	{
		fr. setVisible(false);
		new LogineFrom();
	}
}

public static void main(String ar[])
{
new BankingInfo("");
}
}
