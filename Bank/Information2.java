import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
class Information2 implements ActionListener 
{
  JFrame fr;
  JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,image1,l14;
  JTextField jt1,jt2;
  JComboBox c1,c2,c3,c4,c5;
  JRadioButton r1,r2;
  JButton jb;
  String custid;
   Information2( String custid)
   {
   fr=new JFrame("Bank Information Details");
   // image
  ImageIcon im= new ImageIcon("images\\12th.jpg");
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
   l2=new JLabel("Additonal Detials");
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
   l14=new JLabel(custid);
   l14.setBounds( 790,120,150,30);
   image1.add(l14);
   //rellgion
   l4=new JLabel("Rellgion");
   l4.setForeground(Color.red);
   l4.setFont(new Font("serif",Font.BOLD,20));
    l4.setBounds(50,160,120,30);
	image1.add(l4);
	String st[]={"Hindu","Islam","Buddhism","shikh"};
	c1=new JComboBox(st);
	c1.setBounds(180,160,120,30);
	image1.add(c1);
	//category
	 l5=new JLabel("category");
   l5.setForeground(Color.red);
   l5.setFont(new Font("serif",Font.BOLD,20));
    l5.setBounds(50,200,120,30);
	image1.add(l5);
	String st1[]={"OBCs","General","sc","st"};
	c2=new JComboBox(st1);
	c2.setBounds(180,200,120,30);
	image1.add(c2);
	//income
	l6=new JLabel("income");
   l6.setForeground(Color.red);
   l6.setFont(new Font("serif",Font.BOLD,20));
    l6.setBounds(50,240,120,30);
	image1.add(l6);
	String st2[]={"null","<150000","<250000","<500000"};
	c3=new JComboBox(st2);
	c3.setBounds(180,240,120,30);
	image1.add(c3);
	//quallification
	l7=new JLabel("Quallification");
   l7.setForeground(Color.red);
   l7.setFont(new Font("serif",Font.BOLD,20));
    l7.setBounds(50,280,120,30);
	image1.add(l7);
	String st3[]={"PG","UG","12th","10th"};
	c4=new JComboBox(st3);
	c4.setBounds(180,280,120,30);
	image1.add(c4);
	//occupation
	l8=new JLabel("Occupation");
   l8.setForeground(Color.red);
   l8.setFont(new Font("serif",Font.BOLD,20));
    l8.setBounds(50,320,120,30);
	image1.add(l8);
	String st4[]={"student","farmer","service_man","bussion_man"};
	c5=new JComboBox(st4);
	c5.setBounds(180,320,120,30);
		image1.add(c5);
	image1.add(c4);
	//pan
	l9=new JLabel("Pan Number");
   l9.setForeground(Color.red);
   l9.setFont(new Font("serif",Font.BOLD,20));
    l9.setBounds(50,360,120,30);
	image1.add(l9);
	jt1=new JTextField();
	jt1.setBounds(180,360,120,30);
	image1.add(jt1);
	// adhar
	l10=new JLabel("Addar Number");
   l10.setForeground(Color.red);
   l10.setFont(new Font("serif",Font.BOLD,20));
    l10.setBounds(50,400,120,30);
	image1.add(l10);
	jt2=new JTextField();
	jt2.setBounds(180,400,120,30);
	image1.add(jt2);
	// senior
	l11=new JLabel("Senior Citizen");
   l11.setForeground(Color.red);
   l11.setFont(new Font("serif",Font.BOLD,20));
    l11.setBounds(50,440,120,30);
	image1.add(l11);
	
	r1=new JRadioButton("yes");
	r1.setForeground(Color.blue);
   r1.setFont(new Font("serif",Font.BOLD,20));
    r1.setBounds(180,440,60,30);
	image1.add(r1);
	r2=new JRadioButton("no");
	r2.setForeground(Color.blue);
   r2.setFont(new Font("serif",Font.BOLD,20));
    r2.setBounds(260,440,60,30);
	image1.add(r2);
	//button next
   jb=new JButton("NEXT");
   jb.addActionListener(this);
    jb.setForeground(Color.red);
   jb.setFont(new Font("serif",Font.BOLD,20));
   jb.setBounds(550,500,150,30);
   image1.add(jb);
       fr.setLayout(null);
fr.setSize(1366,768);
 fr.setVisible(true);
}
public void actionPerformed(ActionEvent ae)
{
	String s1=l14.getText();
	String s2=(String)c1.getSelectedItem();
	String s3=(String)c2.getSelectedItem();
	String s4=(String)c3.getSelectedItem();
	String s5=(String)c4.getSelectedItem();
	String s6=(String)c5.getSelectedItem();
	String s7=jt1.getText();
	String s8=jt2.getText();
	String s9=null;
	if(r1.isSelected())
	{
		s9="yes";
	}
	else if(r2.isSelected())
	{
		s9="NO";
	}
	conn cc=new conn();
	if (ae.getSource()==jb)
	{
		
			 try
			 {
				
				  String q = "insert into info1 values('"+s1+"','"+s2+"','"+s3+"','"+s4+"','"+s5+"','"+s6+"','"+s7+"','"+s8+"','"+s9+"')";
				  
                cc.s.executeUpdate(q);
				{
                JOptionPane.showMessageDialog(null,"Personal Details Inserted Successfully");
     fr.setVisible(false); 
	 new Information3(s1);
	 
				}
				
            }catch(Exception ee){
                System.out.println("The error is:"+ee);
            }
			
}
} 
public static void main(String ar[])
{
  new Information2("");
}
}
	
	
