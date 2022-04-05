import Java.awt.*;
import Javax.swing.*;
import Java.awt.event.*;
public class Mainframe  //implements ActionListener
{
public static void main(String[] args)
{
new Mainframe();
}
JFrame jf;
public Mainframe()
{
jf=new JFrame("Dairy Management System");
//super("Dairy Management System")

getContentPane().setForeground(Color.WHITE);
setLayout(null);
JLabel NewLabel=new JLabel(" ");
NewLabel.setIcon(new ImageIcon("E:\newpro\first.jpg"));
NewLabel.setBounds(0,0,1920,990);
add(NewLabel);
JLabel DairyManagementSystem=new JLabel("Welcome To Dairy Management System");
DairyManagementSystem.setForeground(Color.BLUE);
DairyManagementSystem.setBounds(700,60,1000,15);
NewLabel.add(DairyManagementSystem);
JMenubar menubar=new JMenuBar();
set JMenuBar=(menubar);
JMenu Home=new JMenu("Home");
Home.setForeground(Color.BLUE);
menubar.add(Home);
JMenuItem DairyMilk=new JMenuItem("DairyMilk");
Home.add(DairyMilk);
JMenuItem cow=new JMenuItem("cow");
DairyMilk.add(cow);
JMenuItem buffalo=new JMenuItem("Buffalo");
DairyMilk.add(Buffalo);
JMenu About=new JMenu("About");
About.setForeground(Color.RED);
menubar.add(About);
JMenu DairyManagement=new JMenu("DairyManagement");
DairyManagement.setForeground(Color.RED);
menubar.add(DairyManagement);
JMenuItem Supplier_Details=new JMenuItem("Supplier_Details");
DairyManagement.add(Supplier_Details);
JMenuItem Supplier_Details=new JMenuItem("Customer_Details");
DairyManagement.add(Customer_Details);
JMenuItem Supplier_Details=new JMenuItem("Item_Details");
DairyManagement.add(Item_Details);
JMenuItem Supplier_Details=new JMenuItem("Location_Details");
DairyManagement.add(Location_Details);
JMenuItem Supplier_Details=new JMenuItem("DairyMilkInfo_Details");
DairyManagement.add(DairyMilkInfo_Details);
JMenuItem Supplier_Details=new JMenuItem("Search_Details");
DairyManagement.add(Search_Details);
JMenuItem Supplier_Details=new JMenuItem("Exit_Details");
DairyManagement.add(Exit_Details);

/*void setJTextField();
{
t1=new JTextField(15);
add(t1);
}*/
/*Supplier_Details.addActionListener(this);
Customer_Details.addActionListener(this);
Item_Details.addActionListener(this);
Location_Details.addActionListener(this);
Search_Details.addActionListener(this);
DailyMilkInfo_Details.addActionListener(this);*/
jf.setVisible(true);
jf.setSize(1000,800);
jf.setLocation(200,100);
}
}
/*public void actionPerformed(ActionEvent ae)
{
if(ae.getSource()==Supplier_Details)
t1.setText("Supplier_Details");
if(ae.getSource()==Customer_Details)
t1.setText("Customer_Details");
if(ae.getSource()==Item_Details)
t1.setText("Item_Details");
if(ae.getSource()==Search_Details)
t1.setText("Search_Details");
if(ae.getSource()==DailyMilkInfo_Details)
t1.setText("DailyMilkInfo_Details");
if(ae.getSource()==Location_Details)
t1.setText("Location_Details");
}*/