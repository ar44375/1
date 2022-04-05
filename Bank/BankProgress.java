import java.awt.*;
import javax.swing.*;
public class BankProgress
{
JLabel label1,label2,label3,label4;
JFrame Frame;
JProgressBar jp;
int i=0;
BankProgress()
{
Frame= new JFrame("Bank Management");
ImageIcon Ii= new ImageIcon("images\\1st.jpg");
  Image I= Ii.getImage().getScaledInstance(1400,740,Image.SCALE_DEFAULT);
ImageIcon Ii1=new ImageIcon(I);
label1= new JLabel(Ii1);
label1.setBounds(0,0,1400,740);
Frame.add(label1);
jp=new JProgressBar(0,1000);
jp.setBounds(0,670,1400,28);
jp.setValue(0);
jp.setStringPainted(true);
jp.setForeground(Color.ORANGE);
label1.add(jp);
label2=new JLabel("WELCOME");
label2.setFont(new Font("serif",Font.ITALIC,40));
label2.setBounds(500,150,200,30);
label2.setForeground(Color.blue);
label1.add(label2);
label3=new JLabel("TO");
label3.setFont(new Font("serif",Font.ITALIC,40));
label3.setForeground(Color.blue);
label3.setBounds(550,230,200,30);
label1.add(label3);
 label4=new JLabel("BANK MANAGEMENT");
label4.setFont(new Font("serif",Font.ITALIC,40));
label4.setForeground(Color.blue);
label4.setBounds(420,310,400,30);
label1.add(label4);
Frame.setLayout(null);
Frame.setSize(1400,740);
 Frame.setVisible(true);
}
public void iterate()
{
while(i<=1000)
{
jp.setValue(i);
i=i+25;
try
{
Thread.sleep(100);
}catch(Exception ex)
{}
}
}
public static void main(String ar[])
{
BankProgress ab=new BankProgress();
ab.iterate();
}
}

 

