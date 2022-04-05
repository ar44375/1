import java.awt.*;
import javax.swing.*;
public class BankProgress1
{
JLabel label1,label2,label3,label4;
JFrame Frame;
BankProgress1()
{
Frame= new JFrame("Bank Management");
ImageIcon Ii= new ImageIcon("images\\1st.jpg");
  Image I= Ii.getImage().getScaledInstance(1400,740,Image.SCALE_DEFAULT);
ImageIcon Ii1=new ImageIcon(I);
label1= new JLabel(Ii1);
label1.setBounds(0,0,1400,740);
Frame.add(label1);
label2=new JLabel("WELCOME");
label2.setFont(new Font("serif",Font.ITALIC,40));
label2.setBounds(500,150,200,30);
label2.setForeground(Color.blue);
Frame.add(label2);
label3=new JLabel("TO");
label3.setFont(new Font("serif",Font.ITALIC,40));
label3.setForeground(Color.blue);
label3.setBounds(550,230,200,30);
Frame.add(label3);
 label4=new JLabel("BANK MANAGEMENT");
label4.setFont(new Font("serif",Font.ITALIC,40));
label4.setForeground(Color.blue);
label4.setBounds(420,310,400,30);
Frame.add(label4);
 Frame.setVisible(true);
int i;
        int x=1;
        for(i=2;i<=600;i+=2,x+=2){
            Frame.setLocation(1200-(i+x),600-i);
            Frame.setSize (i+2*x,i+x/7);

            try{
                Thread.sleep(20);
            }catch(Exception e) { }
        }
//Frame.setLayout(null);
//Frame.setSize(1400,740);
 //Frame.setVisible(true);
}
public void run()
    {
        try{
            Thread.sleep(5000);
            Frame.setVisible(false);
             new LogineFrom();

        }catch(Exception e){
            e.printStackTrace(); 
        }
    }

public static void main(String ar[])
{
BankProgress1 ab=new BankProgress1();
ab.run();
}
}