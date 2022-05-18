import java.awt.event.MouseAdapter;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class DragPanel extends JPanel{
    ImageIcon animal = new ImageIcon();
//    ImageIcon animal = new ImageIcon("src/eren (1).jpg");
    final int WIDTH = animal.getIconWidth();
    final int HEIGHT = animal.getIconHeight();
    Point imageCorner;
    Point prevPt;
    DragPanel(Image i){
        imageCorner = new Point(0,0);
        ClickListener clickListener = new ClickListener();
        DragListener dragListener = new DragListener();
        this.addMouseListener(clickListener);
        this.addMouseMotionListener(dragListener);
        animal = new ImageIcon(i);
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
            imageCorner.translate((int)(currentPt.getX() - prevPt.getX()), (int)(currentPt.getY() - prevPt.getY()));
            prevPt = currentPt;
            repaint();
        }
    }

}
