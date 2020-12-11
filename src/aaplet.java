
import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;


 
public class aaplet extends Applet{
    
    public void paint(Graphics g)
    {
      g.setColor(Color.black);
      g.drawOval(100, 100, 250, 250);
      g.setColor(Color.red);
      g.fillOval(100, 100, 250, 250);
      g.setColor(Color.black);
      g.drawOval(150, 165, 40, 50);
      g.drawOval(250, 165, 40, 50);
      
      g.fillOval(160, 195, 20, 20);
      g.fillOval(260, 195, 20, 20);
    
      
      
      g.drawArc(175, 210, 100, 100, 180, 180);
      g.setColor(Color.blue);
      g.fillArc(300, 150, 100, 100, 270,209);
      g.fillArc(60, 150, 100, 100, 70,200);
      g.setColor(Color.darkGray);
     
      int[] x={100,220,350};
      int[] y={150,30,150};
     
      g.fillPolygon(x, y, 3);
      
      int[] xs={200,260,230};
      int[] ys={230,260,230};
     
      g.fillPolygon(xs, ys, 3);
      
    }
    
}
