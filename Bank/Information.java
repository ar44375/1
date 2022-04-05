import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
class Information implements ActionListener
{
  JFrame fr;
  JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,image1,day,month,year;
  JTextField name,fname,custid,dob,gender,email,address,city ,pincode,state;
  JComboBox c1,c2,c3,c4;
  JRadioButton r1,r2,r3,r4;
  JButton jb;
  ButtonGroup g1,g2;
   Information()
   {
   fr=new JFrame("Bank Information Details");
   // image
  ImageIcon im= new ImageIcon("images\\2nd.jpg");
  Image im1=im.getImage(). getScaledInstance(1366,768,Image.SCALE_DEFAULT);
  ImageIcon im2=new ImageIcon(im1);
  image1=new JLabel(im2);
  image1.setBounds(0,0,1366,768);
  fr.add(image1);
  // INFORMATION TiTTLE
   l10=new JLabel("Bank Information Details");
   l10.setForeground(Color.red);
   l10.setFont(new Font("serif",Font.BOLD,40));
   l10.setBounds(300,20,500,30);
   image1.add(l10);
   l1=new JLabel("Personal Detials");
   l1.setForeground(Color.green);
   l1.setFont(new Font("serif",Font.ITALIC,40));
   l1.setBounds(400,70,400,30);
   image1.add(l1);
   //name
   l2=new JLabel("CUSTOMER NAME");
   l2.setForeground(Color.RED);
   l2.setFont(new Font("serif",Font.BOLD,20));
   l2.setBounds(50,160,180,30);
   image1.add(l2);
   name=new JTextField();
   name.setBounds(250,160,150,30);
   image1.add(name );
   // customer id
   l3=new JLabel("Customer Id");
   l3.setForeground(Color.RED);
   l3.setFont(new Font("serif",Font.BOLD,20));
   l3.setBounds(600,120,180,30);
   image1.add(l3);
   custid=new JTextField();
   custid.setBounds( 790,120,150,30);
   image1.add(custid);
   //father name
   l4=new JLabel(" FATHER's Name");
    l4.setForeground(Color.RED);
   l4.setFont(new Font("serif",Font.BOLD,20));
   l4.setBounds(50,200,180,30);
   image1.add(l4);
   fname=new JTextField();
   fname.setBounds(250,200,150,30);
   image1.add(fname);
   //date of birth
   l5=new JLabel( "Date Of Birth");
    l5.setForeground(Color.RED);
   l5.setFont(new Font("serif",Font.BOLD,20));
   l5.setBounds(50,240,150,30);
   image1.add(l5);
   //day
   day=new JLabel("DATE");
    day.setForeground(Color.red);
   day.setFont(new Font("serif",Font.BOLD,20));
   day.setBounds(220,240,100,30);
   image1.add(day);
   String st[]={"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31"};
   c1=new JComboBox(st);
    c1.setBounds(320,240,70,30);
   image1.add(c1);
   //month
   month=new JLabel("MONTH");
    month.setForeground(Color.red);
   month.setFont(new Font("serif",Font.BOLD,20));
   month.setBounds(400,240,100,30);
   image1.add(month);
   String st1[]={"jan","feb","march","April","may","june","july","aug","sep","oct","nov","dec"};
   c2=new JComboBox(st1);
   c2.setBounds(510,240,70,30);
   image1.add(c2);
   //year
   year=new JLabel("YEAR");
    year.setForeground(Color.red);
   year.setFont(new Font("serif",Font.BOLD,20));
   year.setBounds(590,240,100,30);
   image1.add(year);
   String st2[]={"1990","1991","1992","1993","1994","1995","1996","1997","1998","1999","2000","2001"};
   c3=new JComboBox(st2);
   c3.setBounds(700,240,70,30);
   image1.add(c3);
   // gender
   l6=new JLabel("Gender");
    l6.setForeground(Color.red);
   l6.setFont(new Font("serif",Font.BOLD,20));
    l6.setBounds(50,280,100,30);
   image1.add(l6);
   r1=new JRadioButton("Male");
   g1=new ButtonGroup();
   r1.setForeground(Color.blue);
   r1.setFont(new Font("serif",Font.BOLD,20));
   r1.setBounds(150,280,80,30);
   g1.add(r1);
   image1.add(r1);
    r2=new JRadioButton("Female");
	 r2.setForeground(Color.blue);
   r2.setFont(new Font("serif",Font.BOLD,20));
   r2.setBounds(290,280,100,30);
   g1.add(r2);
   image1.add(r2);
   //email
   l7=new JLabel("EMAIL");
    l7.setForeground(Color.red);
   l7.setFont(new Font("serif",Font.BOLD,20));
    l7.setBounds(50,320,100,30);
   image1.add(l7);
   email=new JTextField();
   email.setBounds(190,320,180,30);
   image1.add(email);
   // MaritalStatus
   l8=new JLabel("Martital Status");
   l8.setForeground(Color.red);
   l8.setFont(new Font("serif",Font.BOLD,20));
   l8.setBounds(50,360,150,30);
    image1.add(l8);
   r3=new JRadioButton("MARRIED");
   r3.setForeground(Color.blue);
   r3.setBounds(210,360,100,30);
   g2=new ButtonGroup();
   g2.add(r3);
   image1.add(r3);
    r4=new JRadioButton("UNMARRIED");
   r4.setForeground(Color.blue);
   r4.setBounds(320,360,100,30);
   g2.add(r4);
   image1.add(r4);
   // nationality
   l9=new JLabel("NATIONALITY");
   l9.setForeground(Color.red);
   l9.setFont(new Font("serif",Font.BOLD,20));
   l9.setBounds(50,400,150,30);
    image1.add(l9);
	String st4[]={"indian","unindian"};
	c4=new JComboBox(st4);
	c4.setBounds(205,400,150,30);
	image1.add(c4);
	// address
	l10=new JLabel("ADDRESS");
	 l10.setForeground(Color.red);
   l10.setFont(new Font("serif",Font.BOLD,20));
   l10.setBounds(50,440,150,30);
   image1.add(l10);
   address=new JTextField();
   address.setBounds(220,440,150,30);
   image1.add(address);
   //city
   l11=new JLabel("CITY");
	 l11.setForeground(Color.red);
   l11.setFont(new Font("serif",Font.BOLD,20));
   l11.setBounds(50,480,150,30);
   image1.add(l11);
   city=new JTextField();
   city.setBounds(220,480,150,30);
   image1.add(city);
   //pincode
   l12=new JLabel("PINCODE");
	 l12.setForeground(Color.red);
   l12.setFont(new Font("serif",Font.BOLD,20));
   l12.setBounds(50,520,150,30);
   image1.add(l12);
   pincode=new JTextField();
   pincode.setBounds(220,520,150,30);
   image1.add(pincode);
   //state
   l13=new JLabel("STATE");
	 l13.setForeground(Color.red);
   l13.setFont(new Font("serif",Font.BOLD,20));
   l13.setBounds(50,560,150,30);
   image1.add(l13);
   state=new JTextField();
   state.setBounds(220,560,150,30);
   image1.add(state);
   //button next
   jb=new JButton("NEXT");
   jb.addActionListener(this);
    jb.setForeground(Color.red);
   jb.setFont(new Font("serif",Font.BOLD,20));
   jb.setBounds(550,560,150,30);
   image1.add(jb);
   
   
     fr.setLayout(null);
fr.setSize(1366,768);
 fr.setVisible(true);
}
public void actionPerformed(ActionEvent ae)	
{
	String s1=custid.getText();
	String s2=name.getText();
	String s3=fname.getText();
	String s4=(String)c1.getSelectedItem();
	String s5=(String)c2.getSelectedItem();
	String s6=(String)c3.getSelectedItem();
	String s7=null;
	if(r1.isSelected())
	{
		s7="MALE";
	}
	else if(r2.isSelected())
	{
		s7="FEMALE";
	}
	String s8=email.getText();
	String s9=null;
	if(r3.isSelected())
	{
		s9="MARRIED";
	}
	else if(r4.isSelected())
	{
		s9="UNMARRIED";
	}
	String s10=(String)c4.getSelectedItem();
	String s11=address.getText();
	String s12=city.getText();
	String s13=pincode.getText();
		String s14=state.getText();
		conn cc=new conn();
		 if(ae.getSource() == jb)
		 {
			 try
			 {
				
				  String q = "insert into info values('"+s1+"','"+s2+"','"+s3+"','"+s4+"','"+s5+"','"+s6+"','"+s7+"','"+s8+"','"+s9+"','"+s10+"','"+s11+"','"+s12+"','"+s13+"','"+s14+"')";
                cc.s.executeUpdate(q);
				{
                JOptionPane.showMessageDialog(null,"Personal Details Inserted Successfully");
     fr.setVisible(false); 
	 new Information2(s1);
				}
				
            }catch(Exception ee){
                System.out.println("The error is:"+ee);
            }
		
}
}
public static void main(String ar[])
{
new Information();
}
}
   
   
  