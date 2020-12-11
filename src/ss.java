
import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;


public class ss extends Applet{
    
    public void paint(Graphics g)
    {
    g.setColor(Color.black);
    g.fillArc(300, 300, 300, 200, 360, 180);
    g.setColor(Color.orange);
    g.drawOval(390, 410, 60, 60);
     g.drawLine(420, 470, 420, 500);
      g.drawLine(500, 400, 500, 470);
       g.drawLine(350,470, 420, 470);
         g.drawLine(350,470, 420, 470);
         g.drawLine(420, 470, 500, 470);
          g.drawLine(380, 550, 420, 500);
           g.drawLine(420, 500, 460, 550);
        
        
    }
    
}
