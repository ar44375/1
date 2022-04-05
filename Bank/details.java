import java.awt.*;
	import javax.swing.*;
	import java.awt.event.*;
	import java.sql.*;
	class details implements ActionListener
	{
	JFrame fr;
	JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,name,fname,custid,dob,gender,email,address,city ,pincode,state,maritalstatus,nationality,day,month,year,l13,l14,l15,l16,l17,l18,l19,l20,image1,rellgion,category,income,quallification,occupation,pan_number,adharno,senior_citizen,l21,l22,l23,l24,account_type,card_number,pin,services_requird;
	JButton b1;
	String id;
	 details( String id)
	 {
	 fr=new JFrame("Customer details");
	 this.id=id;
	 
	 //image
	  
	   ImageIcon im= new ImageIcon("images\\12th.jpg");
	  Image im1=im.getImage(). getScaledInstance(1366,768,Image.SCALE_DEFAULT);
	  ImageIcon im2=new ImageIcon(im1);
	  image1=new JLabel(im2);
	  image1.setBounds(0,0,1366,768);
	  fr.add(image1);
  
  //label
	l1=new JLabel("customer_id");
	l1.setFont(new Font("serif",Font.BOLD,20));
	   l1.setForeground(Color.red);
	l2= new JLabel("Name");
	l2.setFont(new Font("serif",Font.BOLD,20));
	   l2.setForeground(Color.red);
	l3= new JLabel("Father_name");
	l3.setFont(new Font("serif",Font.BOLD,20));
	   l3.setForeground(Color.red);
	l4= new JLabel("DOB");
	l4.setFont(new Font("serif",Font.BOLD,20));
	   l4.setForeground(Color.red);
	l5= new JLabel("Gender");
	l5.setFont(new Font("serif",Font.BOLD,20));
	   l5.setForeground(Color.red);
	l6= new JLabel("Email");
	l6.setFont(new Font("serif",Font.BOLD,20));
	   l6.setForeground(Color.red);
	l7= new JLabel("Maritalstatus");
	l7.setFont(new Font("serif",Font.BOLD,20));
	   l7.setForeground(Color.red);
	l8= new JLabel("Nationality");
	l8.setFont(new Font("serif",Font.BOLD,20));
	   l8.setForeground(Color.red);
	l9= new JLabel("Address");
	l9.setFont(new Font("serif",Font.BOLD,20));
	   l9.setForeground(Color.red);
	 l10= new JLabel("city");
	 l10.setFont(new Font("serif",Font.BOLD,20));
	   l10.setForeground(Color.red);
	 l11= new JLabel("Pincode");
	 l11.setFont(new Font("serif",Font.BOLD,20));
	   l11.setForeground(Color.red);
	  l12= new JLabel("State");
	  l12.setFont(new Font("serif",Font.BOLD,20));
	   l12.setForeground(Color.red);
	  custid=new JLabel(id);
	   custid.setForeground(Color.blue);
	  name=new JLabel();
	   name.setForeground(Color.blue);
	  fname=new JLabel();
	   fname.setForeground(Color.blue);
	  day=new JLabel();
	   day.setForeground(Color.blue);
	  month=new JLabel();
	   month.setForeground(Color.blue);
	  year=new JLabel();
	   year.setForeground(Color.blue);
	  gender=new JLabel();
	   gender.setForeground(Color.blue);
	  email=new JLabel();
	   email.setForeground(Color.blue);
	  maritalstatus=new JLabel();
	   maritalstatus.setForeground(Color.blue);
	  nationality=new JLabel();
	   nationality.setForeground(Color.blue);
	  address=new JLabel();
	   address.setForeground(Color.blue);
	  city=new JLabel();
	   city.setForeground(Color.blue);
	  pincode=new JLabel();
	   pincode.setForeground(Color.blue);
	  state=new JLabel();
	   state.setForeground(Color.blue);
	  //bounds
	  
	 l1.setBounds(20,20,120,40);
	 custid.setBounds(150,20,120,40);
	 l2.setBounds(20,60,120,40);
	 name.setBounds(150,60,120,40);
	 l3.setBounds(20,100,120,40);
	 fname.setBounds(150,100,120,40);
	l4.setBounds(20,140,120,40);
	 day.setBounds(150,140,20,40);
	  month.setBounds(170,140,20,40);
	   year.setBounds(190,140,120,40);
	   l5.setBounds(20,180,120,40);
	   gender.setBounds(150,180,100,40);
	   l6.setBounds(20,240,120,40);
	   email.setBounds(150,240,120,40);
	   l7.setBounds(20,280,120,40);
	   maritalstatus.setBounds(150,280,120,40);
	   l8.setBounds(20,320,120,40);
	   nationality.setBounds(150,320,120,40);
	   l9.setBounds(20,360,120,40);
	   address.setBounds(150,360,120,40);
	   l10.setBounds(20,400,120,40);
	   city.setBounds(150,400,120,40);
	   l11.setBounds(20,440,120,40);
	   pincode.setBounds(150,440,120,40);
	   
	   l12.setBounds(20,480,120,40);
	   state.setBounds(150,480,120,40);
	   //button 
	   b1=new JButton("Back");
	   b1.addActionListener(this);
	    b1.setForeground(Color.red);
	   b1.setBounds(1250,5,100,30);
	   image1.add(b1);
	   //add
	   image1.add(l1);
	   image1.add(l2);
	   image1.add(l3);
	   image1.add(l4);
	   image1.add(l5);
	   image1.add(l6);
	   image1.add(l7);
	   image1.add(l8);
	   image1.add(l9);
	   image1.add(l10);
	   image1.add(l11);
	   image1.add(l12);
	   image1.add(custid);
	   image1.add(name);
	   image1.add(fname);
	   image1.add(day);
	   image1.add(month);
	   image1.add(year);
	   image1.add(gender);
	   image1.add(email);
	   image1.add(maritalstatus);
	   image1.add(address);
	   image1.add(city);
	   image1.add(pincode);
	   image1.add(state);
	   // second farme
	   
	   l13=new JLabel("Rellgion");
	l13.setFont(new Font("serif",Font.BOLD,20));
	   l13.setForeground(Color.red);
	l14= new JLabel("Category");
	l14.setFont(new Font("serif",Font.BOLD,20));
	   l14.setForeground(Color.red);
	l15= new JLabel("Income");
	l15.setFont(new Font("serif",Font.BOLD,20));
	   l15.setForeground(Color.red);
	l16= new JLabel("Quallification");
	l16.setFont(new Font("serif",Font.BOLD,20));
	   l16.setForeground(Color.red);
	l17= new JLabel("Occupation");
	l17.setFont(new Font("serif",Font.BOLD,20));
	   l17.setForeground(Color.red);
	l18= new JLabel("Pan_number");
	l18.setFont(new Font("serif",Font.BOLD,20));
	   l18.setForeground(Color.red);
	l19= new JLabel("Adharno");
	l19.setFont(new Font("serif",Font.BOLD,20));
	   l19.setForeground(Color.red);
	l20= new JLabel("senior_citizen");
	l20.setFont(new Font("serif",Font.BOLD,20));
	   l20.setForeground(Color.red);
	   
	   rellgion=new JLabel();
	    rellgion.setForeground(Color.blue);
	   category=new JLabel();
	    category.setForeground(Color.blue);
	   income=new JLabel();
	    income.setForeground(Color.blue);
	   quallification=new JLabel();
	    quallification.setForeground(Color.blue);
	   occupation=new JLabel();
	    occupation.setForeground(Color.blue);
	   pan_number=new JLabel();
	    pan_number.setForeground(Color.blue);
	   adharno=new JLabel();
	    adharno.setForeground(Color.blue);
	   senior_citizen=new JLabel();
	    senior_citizen.setForeground(Color.blue);
	   
	   //setBounds
	   l13.setBounds(20,520,120,40);
	   rellgion.setBounds(150,520,120,40);
	    l14.setBounds(20,560,120,40);
	   category.setBounds(150,560,120,40);
	    l15.setBounds(20,600,120,40);
	   income.setBounds(150,600,120,40);
	    l16.setBounds(20,640,120,40);
	   quallification.setBounds(150,640,120,40);
	    l17.setBounds(500,20,120,40);
	   occupation.setBounds(650,20,120,40);
	   
	    l18.setBounds(500,60,120,40);
	   pan_number.setBounds(650,60,120,40);
	    l19.setBounds(500,100,120,40);
	   adharno.setBounds(650,100,120,40);
	    l20.setBounds(500,140,120,40);
	   senior_citizen.setBounds(650,140,120,40);
	   
	   
	  image1.add(l13);
	   image1.add(l14);
	   image1.add(l15);
	   image1.add(l16);
	   image1.add(l17);
	   image1.add(l18);
	   image1.add(l19);
	   image1.add(l20);
	   image1.add(rellgion);
	   image1.add(category);
	   image1.add(income);
	   image1.add(quallification);
	   image1.add(occupation);
	   image1.add(pan_number);
	   image1.add(adharno);
	   image1.add(senior_citizen);
	   
	   //third frame
	   l21=new JLabel("account_type");
	   l21.setForeground(Color.red);
	   	l21.setFont(new Font("serif",Font.BOLD,20));
	   l22=new JLabel("card_number");
	    	l22.setFont(new Font("serif",Font.BOLD,20));
	   l22.setForeground(Color.red);
	   l23=new JLabel("pin");
	    	l23.setFont(new Font("serif",Font.BOLD,20));
	   l23.setForeground(Color.red);
	   l24=new JLabel("services_requird");
	    	l24.setFont(new Font("serif",Font.BOLD,20));
	   l24.setForeground(Color.red);
	   account_type=new JLabel();
	    account_type.setForeground(Color.blue);
	   card_number=new JLabel();
	    card_number.setForeground(Color.blue);
	   pin=new JLabel();
	    pin.setForeground(Color.blue);
	   services_requird=new JLabel();
	    services_requird.setForeground(Color.blue);
	   
	   
 l21.setBounds(500,180,120,40);
	   account_type.setBounds(650,180,120,40);
	   l22.setBounds(500,220,120,40);
	   card_number.setBounds(650,220,120,40);
	   l23.setBounds(500,260,120,40);
	   pin.setBounds(650,260,120,40);
	   l24.setBounds(500,300,150,40);
	   services_requird.setBounds(660,300,200,40);
	   image1.add(l21);
	   image1.add(l22);
	   image1.add(l23);
	   image1.add(l24);
	   image1.add(account_type);
	   image1.add(card_number);
	   image1.add(pin);
	   image1.add(services_requird);
	    conn cc=new conn();
	   try{
		   String s1= "select * from info where CUSTOMER_ID='"+custid.getText()+"'";
		   ResultSet rs =cc.s.executeQuery(s1);
		   while(rs.next())
		   {
			   custid.setText(rs.getString(1));
			   name.setText(rs.getString(2));
			   fname.setText(rs.getString(3));
			   day.setText(rs.getString(4));
			   month.setText(rs.getString(5));
			   year.setText(rs.getString(6));
			    gender.setText(rs.getString(7));
			   email.setText(rs.getString(8));
			   maritalstatus.setText(rs.getString(9));
			    nationality.setText(rs.getString(10));
			   address.setText(rs.getString(11));
			    city.setText(rs.getString(12));
			   pincode.setText(rs.getString(13));
			   state.setText(rs.getString(14));
			   
			   
		   }}catch(Exception ee){
                System.out.println("The error is:"+ee);
            }
			try{
				String s2= "select * from info1 where CUSTOMER_ID='"+custid.getText()+"'";
		   ResultSet rs1 =cc.s.executeQuery(s2);
		   while(rs1.next())
		   {
			   custid.setText(rs1.getString(1));
			   rellgion.setText(rs1.getString(2));
			   category.setText(rs1.getString(3));
			   income.setText(rs1.getString(4));
			   quallification.setText(rs1.getString(5));
			   occupation.setText(rs1.getString(6));
			    pan_number.setText(rs1.getString(7));
			   adharno.setText(rs1.getString(8));
			   senior_citizen.setText(rs1.getString(9));
			    }}catch(Exception ee){
                System.out.println("The error is:"+ee);
            }
		   try{
				String s3= "select * from info3 where CUSTOMER_ID='"+custid.getText()+"'";
		   ResultSet rs2 =cc.s.executeQuery(s3);
		   while(rs2.next())
		   {
			   custid.setText(rs2.getString(1));
			   account_type.setText(rs2.getString(2));
			   card_number.setText(rs2.getString(3));
			   pin.setText(rs2.getString(4));
			   services_requird.setText(rs2.getString(5));
			      }}catch(Exception ee){
                System.out.println("The error is:"+ee);
            }
	   
		 fr.setLayout(null);
	fr.setSize(1366,768);
	 fr.setVisible(true);
	}
public void actionPerformed(ActionEvent ae)
{
	if(ae.getSource()==b1)
	{
		String st=custid.getText();
		fr.setVisible(false);
		new BankingInfo(st);
	}
}
	public static void main(String ar[])
	{
	new details("");
	}
	}
	   
	   
	   
	   
	   
	   
	   