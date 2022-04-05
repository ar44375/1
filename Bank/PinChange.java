import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
 
 class PinChange implements ActionListener
 {
   JFrame jf ;
   JLabel j1 ,j2,j3,j4,image1;
   JTextField t1;
   JPasswordField t2,t3;
   JButton back,ok,cancel;
   String st;
   PinChange(String st)
   {
     jf = new JFrame("PinChange window");
	 
	 ImageIcon im= new ImageIcon("images\\atm.jpg");
  Image im1=im.getImage(). getScaledInstance(600,300,Image.SCALE_DEFAULT);
  ImageIcon im2=new ImageIcon(im1);
  image1=new JLabel(im2);
  image1.setBounds(0,0,600,300);
  jf.add(image1);
	 
	 this.st=st;
	 
	 j1 = new JLabel("Bank Pin Change Menu");
	 j1.setForeground(Color.red);
    j1.setFont(new Font("serif",Font.BOLD,20));
   
   j2= new JLabel("Enter Current pin");
   j2.setForeground(Color.blue);
    j2.setFont(new Font("serif",Font.BOLD,20));
	 j3= new JLabel("Enter new pin");
	   j3.setForeground(Color.blue);
    j3.setFont(new Font("serif",Font.BOLD,20));
    j4= new JLabel("Enter Conferm pin");
	  j4.setForeground(Color.blue);
    j4.setFont(new Font("serif",Font.BOLD,20));
	
	
	 t1 = new JTextField();
	  t2 = new JPasswordField();
	   t3 = new JPasswordField();
	 
	 back = new JButton("Back");
	 back.addActionListener(this);
	  back.setForeground(Color.red);
	 ok = new JButton("OK");
	  ok.addActionListener(this);
	  ok.setForeground(Color.blue);
	 cancel = new JButton("Cancel");
	  cancel.addActionListener(this);
	  cancel.setForeground(Color.blue);
	 
	 j1.setBounds(120,20,300,30);
	  j2.setBounds(20,60,180,30);
	  t1.setBounds(180,60,150,30);
	   j3.setBounds(20,90,180,30);
	  t2 .setBounds(180,90,150,30);
	   j4.setBounds(20,120,180,30);
	  t3 .setBounds(180,120,150,30);
	  
	 back.setBounds(530,0,70,20);
	 //back.setBounds(280,7,70,30);
	 ok.setBounds(100,160,70,30);
	 cancel.setBounds(190,160,90,30);
	 
	 image1.add(j1);
	 image1.add(t1);
	  image1.add(j2);
	 image1.add(t2);
	  image1.add(j3);
	 image1.add(t3);
	  image1.add(j4);
	 
	 image1.add(back);
	 image1.add(ok);
	 image1.add(cancel);
	 
	 jf.setLayout(null);
	 jf.setLocation(400,200);
	 jf.setSize(600,300);
	 jf.setVisible(true);
	 
	}
	
	public void actionPerformed(ActionEvent ae){
        try{        
            String s1 = t1.getText();
            String s2 = t2.getText();
             String s3 = t3.getText();
            if(!s2.equals(s3))
			{
                JOptionPane.showMessageDialog(null, "Plss eneter same pin");
                return;
            }
            
            if(ae.getSource()==ok){
                if (t1.getText().equals("")){
                    JOptionPane.showMessageDialog(null, "Enter New PIN");
                }
                if (t2.getText().equals("")){
                    JOptionPane.showMessageDialog(null, "Re-Enter new PIN");
                }
                
                conn c1 = new conn();
                String q1 = "update open set pin = '"+s2+"' where pin = '"+s1+"' ";
                
                c1.s.executeUpdate(q1);
               

                JOptionPane.showMessageDialog(null, "PIN changed successfully");
               jf.setVisible(false);
                new BankingInfo(st);
            
            }else if(ae.getSource()==cancel)
			{
               t1.setText("");
			    t2.setText("");
				 t3.setText("");
			   
            }
			else if(ae.getSource()==back)
			{
				jf.setVisible(false);
				new BankingInfo(st);
			}
        }catch(Exception e){}
    }
	
	
	
	
	public static void main(String[] arg)
	{
	  new PinChange("");
	}
}