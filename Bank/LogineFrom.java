 import java.awt.event.*;
 import java.awt.*;
 import javax.swing.*;
 import java.sql.*;
  public class LogineFrom implements ActionListener
  {
  JFrame jf;
  JLabel User,Password,l1,l2,l3;
  JTextField jt;
  JPasswordField pf;
  JCheckBox cb;
  JButton logine,cancle,singup;
  LogineFrom()
  {
  jf=new JFrame("LOGINE FROM");
  // image
  ImageIcon im= new ImageIcon("images\\5th.jpg");
  Image im1=im.getImage(). getScaledInstance(200,250,Image.SCALE_DEFAULT);
  ImageIcon im2=new ImageIcon(im1);
  l1=new JLabel(im2);
  l1.setBounds(0,0,200,250);
  jf.add(l1);
  //account label
  User=new JLabel("Customer id");
  User.setForeground(Color.blue);
   User.setFont(new Font("serif",Font.ITALIC,20));
  User.setBounds(230,20,200,30);
  jf.add(User);
  //account testField
  jt=new JTextField();
  jt.setBounds(410,20,150,30);
  jf.add(jt);
  // password label
  Password =new JLabel("PASSWORD");
   Password.setForeground(Color.blue);
  Password.setFont(new Font("serif",Font.ITALIC,20));
  Password.setBounds(230,60,200,30);
  jf.add(Password);
  // password field
  pf=new JPasswordField();
  pf.setBounds(410,60,150,30);
  jf.add(pf);
  //check box show
  cb=new JCheckBox("Show Password");
  	 cb.addActionListener(this);
   cb.setForeground(Color.red);
  //cb.setFont(new Font("serif",Font.ITALIC,20));
  cb.setBounds(440,90,130,30);
  jf.add(cb);
  // button logine
  logine=new JButton();
    logine.addActionListener(this);
   ImageIcon logine1= new ImageIcon("images\\login.jpg");
  Image logine2=logine1.getImage(). getScaledInstance(110,30,Image.SCALE_DEFAULT);
 logine.setIcon(new ImageIcon(logine2));
 logine.setBounds(280,120,110,30);
 jf.add(logine);
 // button cancle
 cancle= new JButton();
  cancle.addActionListener(this);
 ImageIcon cancle1= new ImageIcon("images\\cancel.jpg");
  Image cancle2=cancle1.getImage(). getScaledInstance(110,30,Image.SCALE_DEFAULT);
 cancle.setIcon(new ImageIcon(cancle2));
 cancle.setBounds(390,120,110,30);
 jf.add(cancle);
 // buutton singup 
 singup= new JButton();
 singup.addActionListener(this);
 ImageIcon singup1= new ImageIcon("images\\sign.jpg");
  Image singup2=singup1.getImage(). getScaledInstance(110,30,Image.SCALE_DEFAULT);
 singup.setIcon(new ImageIcon(singup2));
 singup.setBounds(330,150,110,30);
 jf.add(singup);
  jf.setLayout(null);
  jf.setLocation(400,200);
jf.setSize(600,285);
 jf.setVisible(true);
}
public void actionPerformed(ActionEvent ae)
{
	if(ae.getSource()==cb)
	{
		if(cb.isSelected()){
			pf.setEchoChar((char)0);
		}
		else{
			pf.setEchoChar('*');
		}
}

conn cc=new conn();
String s1=jt.getText();
String s2=pf.getText();
if(ae.getSource()==logine)
{try{
	String q="select * from open where CUSTOMER_ID='"+s1+"' and pin='"+s2+"'";
	ResultSet rs =cc.s.executeQuery(q);
	if(rs.next())
	{
		jf.setVisible(false);
                    new BankingInfo(s1);
                }else{
                    JOptionPane.showMessageDialog(null, "Incorrect CUSTOMER_ID or PIN");
                }
}catch(Exception ee)
	{}

}
if(ae.getSource()==cancle)	
{
jt.setText("");
pf.setText("");
}
if(ae.getSource()==singup)	
{
	jf.setVisible(false);
	new Information();
	
}
}
public static void main(String ar[])
{
new LogineFrom();
}
}