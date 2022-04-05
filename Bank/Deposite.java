import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
 import java.util.Date;
 import java.sql.*;
 class Deposite implements ActionListener
 {
   JFrame jf ;
   JLabel j1,image1 ;
   JTextField t1;
   JButton back,ok,cancel;
   String st;
   Deposite(String st)
   {
     jf = new JFrame("Deposite window");
	 this.st=st;
	 ImageIcon im= new ImageIcon("images\\atm.jpg");
  Image im1=im.getImage(). getScaledInstance(400,200,Image.SCALE_DEFAULT);
  ImageIcon im2=new ImageIcon(im1);
  image1=new JLabel(im2);
  image1.setBounds(0,0,400,200);
  jf.add(image1);
	 
	 j1 = new JLabel("Enter Deposite Amount");
	  j1.setFont(new Font("serif",Font.BOLD,15));
	   j1.setForeground(Color.red);
	 t1 = new JTextField();
	 back = new JButton("Back");
	  back.addActionListener(this);
	  back.setForeground(Color.red);
	 ok = new JButton("OK");
	 ok.addActionListener(this);
	 ok.setForeground(Color.red);
	 cancel = new JButton("Cancel");
	 cancel.addActionListener(this);
	 cancel.setForeground(Color.red);
	 
	 j1.setBounds(20,50,170,30);
	 t1.setBounds(190,50,130,30);
	 back.setBounds(280,7,70,30);
	 ok.setBounds(100,110,70,30);
	 cancel.setBounds(190,110,90,30);
	 
	 image1.add(j1);
	 image1.add(t1);
	 image1.add(back);
	 image1.add(ok);
	 image1.add(cancel);
	 
	 jf.setLayout(null);
	  jf.setLocation(400,200);
	 jf.setSize(400,200);
	 jf.setVisible(true);
	 
	}
	 public void actionPerformed(ActionEvent ae){
		 
		  conn cc=new conn();
        try{        
            String amount = t1.getText();
			
            Date date = new Date();
            if(ae.getSource()==ok){
                if(t1.getText().equals("")){
                    JOptionPane.showMessageDialog(null, "Please enter the Amount to you want to Deposit");
                }else{
					 String q2 = "insert into bank values('"+st+"', '"+date+"', 'Deposit', '"+amount+"')";
                    cc.s.executeUpdate(q2);   
                    JOptionPane.showMessageDialog(null, "Rs. "+amount+" Deposited Successfully");
                    jf.setVisible(false);
                    new BankingInfo(st);
                } 
			}
			}catch(Exception e){}
			if(ae.getSource()==cancel)
			{
				t1.setText("");
			}
			if(ae.getSource()==back)
			{
				jf.setVisible(false);
				new BankingInfo(st);
			}
	 }
	 
	public static void main(String[] arg)
	{
	  new Deposite("");
	}
}