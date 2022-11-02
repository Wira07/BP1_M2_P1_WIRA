package BP1_M2_P1_Wira;

import java.applet.Applet;
import java.awt.*;
public class BP1_M2_P1_Wira extends Applet {

    @Override
    public void init() {
        // TODO start asynchronous download of heavy resources
    }
    @Override
    public void paint(Graphics g) {
        Font f = new Font("Comic Sans Ms", Font.BOLD, 20);
        g.setFont(f);
        g.setColor(Color.red);
        int xPusat = this.getSize().width/2;
        int yPusat = this.getSize().height/2;
        String s = "Ayo Belajar Java Applet!!!";
        FontMetrics fm = this.getFontMetrics(f);
        int posisiX = xPusat - (fm.stringWidth(s)/2);
        g.drawString("Ayo Belajar Java Applet", posisiX, yPusat);
    }
}