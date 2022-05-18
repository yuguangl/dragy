import java.awt.event.MouseAdapter;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class DragPanel extends JPanel{
     ImageIcon animal = new ImageIcon();
     Point imageCorner;
     Point prevPt;
    DragPanel(Image i) //ADD IN POINTS
    {
        imageCorner = new Point(0,0);
        ClickListener clickListener = new ClickListener();
        DragListener dragListener = new DragListener();
        this.addMouseListener(clickListener);
        this.addMouseMotionListener(dragListener);
        animal = new ImageIcon(i);
        imageCorner = new Point (50,70);
    }
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        animal.paintIcon(this,g, (int)imageCorner.getX(), (int)imageCorner.getY());

    }

    public class ClickListener extends MouseAdapter{
        public void mousePressed(MouseEvent e){
            prevPt =  e.getPoint();
        }
    }

    private class DragListener extends MouseMotionAdapter{
        @Override
        public void mouseDragged(MouseEvent e) {
            Point currentPt = e.getPoint();
            if(currentPt.getX()> imageCorner.getX()&& currentPt.getX() < ( animal.getIconWidth() + imageCorner.getX())
            && currentPt.getY()> imageCorner.getY()&& currentPt.getY() < ( animal.getIconHeight() + imageCorner.getY()))

            imageCorner.translate((int)(currentPt.getX() - prevPt.getX()), (int)(currentPt.getY() - prevPt.getY()));
            prevPt = currentPt;
            repaint();
        }
    }

}
