package BP1_M2_P1_Wira;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.Vector;

public class BP1_M2_PostTest1_Wira_AppleteMouse extends Applet 
    implements MouseListener, MouseMotionListener {
    
    int width, height;
    Vector listOfPositions;

    public void init() {
        width = getSize().width;
        height = getSize().height;
        setBackground(Color.black);
        
        listOfPositions = new Vector();
        
        addMouseListener(this);
        addMouseMotionListener(this);
    }
    
    public void mouseEntered(MouseEvent e){}
    public void mouseExited(MouseEvent e){}
    public void mouseClicked(MouseEvent e){}
    public void mousePressed(MouseEvent e){}
    public void mouseReleased(MouseEvent e){}
    public void mouseMoved(MouseEvent e) {
        if(listOfPositions.size() >= 90) {
            // delete the first element in the list
            listOfPositions.removeElementAt(0);
        }
        // add the new position to the end of the list
        listOfPositions.addElement(new Point(e.getX(), e.getY()));
        
        repaint();
        e.consume();
    }

    public void mouseDragged(MouseEvent e){}
    public void paint(Graphics g){
        g.setColor(Color.white);
        for (int j = 1; j<listOfPositions.size(); j++){
            Point A = (Point)(listOfPositions.elementAt(j-1));
            Point B = (Point)(listOfPositions.elementAt(j));
            g.drawLine(A.x, A.y, B.x, B.y);
        }
    }   
}