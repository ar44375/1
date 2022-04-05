import java.awt.*;
import java.util.*;
import javax.swing.*;
import java.awt.event.*;
class Information3 implements ActionListener 
{
  JFrame fr;
  JLabel l1,l2,l3,l4,l5,l6,image1,l7,l8,l9,l10;
  JTextField jt1,jt2;
  JCheckBox c1,c2,c3,c4,c5,c6,c7;
  JRadioButton r1,r2,r3,r4;
  JButton b1,b2;
  String custid;
   Information3( String custid)
   {
   fr=new JFrame("Bank Information Details");
   // image
  ImageIcon im= new ImageIcon("images\\11th.jpg");
  Image im1=im.getImage(). getScaledInstance(1366,768,Image.SCALE_DEFAULT);
  ImageIcon im2=new ImageIcon(im1);
  image1=new JLabel(im2);
  image1.setBounds(0,0,1366,768);
  fr.add(image1);
  
    this.custid = custid;
  // INFORMATION TiTTLE
   l1=new JLabel("Bank Information Details");
   l1.setForeground(Color.red);
   l1.setFont(new Font("serif",Font.BOLD,40));
   l1.setBounds(300,20,500,30);
   image1.add(l1);
   l2=new JLabel("Account information");
   l2.setForeground(Color.green);
   l2.setFont(new Font("serif",Font.ITALIC,40));
   l2.setBounds(400,70,400,30);
   image1.add(l2 );
   //Customer
   l3=new JLabel("Customer Id");
   l3.setForeground(Color.RED);
   l3.setFont(new Font("serif",Font.BOLD,20));
   l3.setBounds(600,120,180,30);
   image1.add(l3);
   l10=new JLabel(custid);
   l10.setBounds( 790,120,150,30);
   image1.add(l10);
   //account type
   l4=new JLabel("Account_type");
   l4.setForeground(Color.red);
   l4.setFont(new Font("serif",Font.BOLD,20));
    l4.setBounds(50,160,120,30);
	image1.add(l4);
	ButtonGroup bg=new ButtonGroup();
	
	r1=new JRadioButton("Saving Account");
	bg.add(r1);
	 r1.setForeground(Color.blue);
	r2=new JRadioButton("Fix Deposite Account");
	bg.add(r2);
	 r2.setForeground(Color.blue);
	r3=new JRadioButton("Current Account");
	bg.add(r3);
	 r3.setForeground(Color.blue);
	r4=new JRadioButton("Recurring Deposite Account");
	bg.add(r4);
	 r4.setForeground(Color.blue);
	r1.setBounds(40,200,180,30);
	r2.setBounds(240,200,180,30);
	r3.setBounds(40,240,180,30);
	r4.setBounds(240,240,200,30);
	image1.add(r1);
	image1.add(r2);
	image1.add(r3);
	image1.add(r4);
	//card number
	l5=new JLabel("Card Number");
	 l5.setForeground(Color.RED);
   l5.setFont(new Font("serif",Font.BOLD,20));
   l5.setBounds(40,290,180,30);
   image1.add(l5);
	Random r1=new Random();
int a1= r1.nextInt(999999);
	l6=new JLabel("4374367823"+a1);
	l6.setBounds(230,290,180,30);
   image1.add(l6);
   //pin
   l7=new JLabel("PIN");
	 l7.setForeground(Color.RED);
   l7.setFont(new Font("serif",Font.BOLD,20));
   l7.setBounds(40,330,180,30);
   image1.add(l7);
	Random r2=new Random();
int a11= r2.nextInt(999);
	l8=new JLabel("4"+a11);
	l8.setBounds(230,330,180,30);
   image1.add(l8);
   //services required
   l9=new JLabel("Services required:");
   l9.setForeground(Color.RED);
   l9.setFont(new Font("serif",Font.BOLD,20));
   l9.setBounds(40,370,180,30);
   image1.add(l9);
   c1=new JCheckBox("Atm Card");
    c1.setForeground(Color.blue);
	c1.setBounds(40,410,120,30);
	image1.add(c1);
   c2=new JCheckBox("Internet Banking");
    c2.setForeground(Color.blue);
	c2.setBounds(170,410,120,30);
	image1.add(c2);
   c3=new JCheckBox("Mobile Banking");
     c3.setForeground(Color.blue);
	c3.setBounds(40,450,120,30);
	image1.add(c3);
   c4=new JCheckBox("Email alerts");
     c4.setForeground(Color.blue);
	c4.setBounds(170,450,120,30);
	image1.add(c4);
   c5=new JCheckBox("Cheque Book");
   c5.setForeground(Color.blue);
	c5.setBounds(40,490,120,30);
	image1.add(c5);
   c6=new JCheckBox("E-statement");
   c6.setForeground(Color.blue);
	c6.setBounds(170,490,120,30);
	image1.add(c6);
   c7=new JCheckBox("i have mention all details Correct",true);
   c7.setFont(new Font("serif",Font.BOLD,15));
   c7.setBounds(200,550,300,30);
	image1.add(c7);
	//Button
	b1=new JButton("sumbit");
	 b1.addActionListener(this);
	b1.setForeground(Color.red);
	b2=new JButton("cancle");
	 b2.addActionListener(this);
	b2.setForeground(Color.red);
	b1.setBounds(500,600,100,30);
	b2.setBounds(620,600,100,30);
	image1.add(b1);
	image1.add(b2);
	
   
	  fr.setLayout(null);
fr.setSize(1366,768);
 fr.setVisible(true);
}
public void actionPerformed(ActionEvent ae)
{
	String s1=l10.getText();
	String s2=null;
	if(r1.isSelected())
	{
		s2="Saving Account";
	}
	else if(r2.isSelected())
	{
		s2="Fix Deposite Account";
	}
	else if(r3.isSelected())
	{
		s2="Current Account";
	}
	else if(r4.isSelected())
	{
		s2="Recurring Deposite Account";
	}
	String s3=l6.getText();
	String s4=l8.getText();
	 String s5 = "";
        if(c1.isSelected()){ 
            s5 = s5 + " ATM Card";
        }
        if(c2.isSelected()){ 
            s5 = s5 + " Internet Banking";
        }
        if(c3.isSelected()){ 
            s5 = s5 + " Mobile Banking";
        }
        if(c4.isSelected()){ 
            s5 = s5 + " EMAIL Alerts";
        }
        if(c5.isSelected()){ 
            s5 = s5 + " Cheque Book";
        }
        if(c6.isSelected()){ 
            s5 = s5 + " E-Statement";
        }
		 conn c1 = new conn();
		 try{
            if(ae.getSource()==b1){
                
                
                    String q1 = "insert into info3 values('"+s1+"','"+s2+"','"+s3+"','"+s4+"','"+s5+"')";  
                    String q2 = "insert into open values('"+s1+"','"+s3+"','"+s4+"')";
                    c1.s.executeUpdate(q1);
                     c1.s.executeUpdate(q2);
                    JOptionPane.showMessageDialog(null, "Card Number: " + s3 + "\n Pin:"+ s4+"\n custid:"+s1);
                    fr.setVisible(false);
					new LogineFrom();
                }
            
            else if(ae.getSource()==b2){
                System.exit(0);
            }
            
        }catch(Exception ex){
            ex.printStackTrace();
        }
}
	
public static void main(String ar[])
{
new Information3("");
}
}