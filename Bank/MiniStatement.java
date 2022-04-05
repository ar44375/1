import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;

public class MiniStatement implements ActionListener
{
 JButton b1;
 JTable t1;
    JLabel l1,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13;
	JFrame jf;
	String st;
	 String x[] = {"DDATE","TYPE","AMOUNT"};
    String y[][] = new String[20][3];
    int i=0, j=0;
	
    MiniStatement(String st)
	{
	  jf=new JFrame("MiniStatement");
	  this.st=st;
	  l1=new JLabel("Bank of india");
	  l1.setBounds(250, 20, 100, 20);
       jf. add(l1);
	   l3=new JLabel();
	  l3.setBounds(20, 80, 300, 20);
      jf.add(l3);  
	   
	     l4=new JLabel();
	  l4.setBounds(20, 110, 300, 20);
      jf.add(l4);  
	   l5=new JLabel();
	  l5.setBounds(20, 140, 5000, 30);
      //jf.add(l5);  
	   
	  
	    l13=new JLabel();
	  l13.setBounds(20, 500, 500, 30);
      jf.add(l13); 
	  
	  b1=new JButton("back");
	  b1.addActionListener(this);
  b1.setForeground(Color.red);
  b1.setBounds(400,0,100,30);
   jf.add(b1);
	  
	    try{
            conn c = new conn();
            ResultSet rs = c.s.executeQuery("select * from  open where CUSTOMER_ID = '"+st+"'");
            while(rs.next()){
                l3.setText("Card Number:    " + rs.getString("CARD_NO"));
            }
        }catch(Exception e){}
        	
	   
	   
	   try{
            conn c1 = new conn();
            ResultSet rs1= c1.s.executeQuery("select * from info where CUSTOMER_ID  = '"+st+"'");
            while(rs1.next()){
                l4.setText("Customer Name:    " + rs1.getString("NAME"));
            }
        }catch(Exception e){}
	   
	   
	   
	    try{
            conn c1 = new conn();
            ("select * from bank  where CUSTOMER_ID = '"+st+"'");
			
            while(rs2.next()){
				
				  //using label   
				//l5.setText(rs2.getString("DDATE")+  rs2.getString("TYPE") + rs2.getString("AMOUNT") );
				 //l6.setText(rs2.getString("DDATE")+  rs2.getString("TYPE") + rs2.getString("AMOUNT") );
				 //l7.setText(rs2.getString("DDATE")+  rs2.getString("TYPE") + rs2.getString("AMOUNT") );
				 //l8.setText(rs2.getString("DDATE")+  rs2.getString("TYPE") + rs2.getString("AMOUNT") );
				 
				 
				 //using table
                y[i][j++]=rs2.getString(2);
                y[i][j++]=rs2.getString(3);
                y[i][j++]=rs2.getString(4);
				 
				  i++;
                j=0;
            }
            t1 = new JTable(y,x);

        }catch(Exception e){}
	   
	     JScrollPane sp = new JScrollPane(t1);
        sp.setBounds(20,140,400,330);
        jf.add(sp);
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
        
        l13.setText("Your Current Account Balance is Rs "+balance);
	   
	    jf.setLayout(null);
	  jf.setLocation(380,120);
	 jf.setSize(500,600);
	 jf.setVisible(true);
	 
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		jf.setVisible(false);
		new BankingInfo(st);
	}
	
	public static void main(String[] arg)
	{
	  new MiniStatement("");
	}
}