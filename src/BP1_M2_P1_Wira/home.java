package BP1_M2_P1_Wira;
import java.awt.*;
import java.applet.Applet;
public class home extends Applet {
    public void paint(Graphics g){
        int x[] = {150,300,225};
        int y[] = {150,150,25};
        g.setColor(Color.red);
        g.fillRect(150, 150, 150, 150);
        
        g.setColor(Color.blue);
        g.fillRect(160, 170, 50, 50);
        
        g.setColor(Color.blue);
        g.fillRect(240, 170, 50, 50);
        
        g.setColor(Color.blue);
        g.fillRect(200, 250, 50, 50);
       
        g.setColor(Color.orange);
        g.fillPolygon(x,y,3);
        
        g.setColor(Color.green);
        g.fillOval(200, 75, 50, 50);
    }
    public void init() {
        // TODO start asynchronous download of heavy resources
    }
    // TODO overwrite start(), stop() and destroy() methods
}
