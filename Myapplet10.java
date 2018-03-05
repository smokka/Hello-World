import java.applet.Applet;
import java.awt.*;
/* <applet code="Myapplet10.java" height=200 width=300></applet>*/
 public class Myapplet10  extends Applet
{
     public void paint(Graphics g)
    {
      Font currentFont = new Font("TimesRoman", Font.BOLD, 30);
      g.setFont(currentFont);
      g.drawString("INDIAN FLAG",625,50);
      g.setColor(Color.orange);
      g.drawArc(588,35,240,265,150,70);
      g.drawArc(588,210,31,165,270,120);
      g.setColor(Color.orange);
      g.setColor(Color.orange);
      g.drawRect(604,100,10,400);
      g.drawRect(615,100,250,50);
      g.setColor(Color.orange);
      g.fillRect(615,100,250,50);
      g.drawRect(615,150,250,50);
      g.setColor(Color.white);
      g.fillRect(615,150,250,50);
      g.drawRect(615,200,250,50);
      g.setColor(Color.green);
      g.fillRect(615,200,250,50);
      g.setColor(Color.blue);
      g.drawOval(720,150,50,50);
      g.setColor(Color.blue);
      g.drawOval(740,171,10,10);
      g.fillOval(740,171,10,10);
      g.drawLine(745,150,745,200);
      g.drawLine(720,175,770,175);
      g.drawLine(730,153,765,193);
      g.drawLine(755,153,732,193);      
      }
}
