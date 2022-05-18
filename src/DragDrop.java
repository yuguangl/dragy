
import javax.swing.*;
import java.awt.*;

public class DragDrop extends JFrame {

    private ImageIcon animaux = new ImageIcon("src/eren (1).jpg");
    DragPanel drag = new  DragPanel(animaux.getImage());
    private JFrame window;
    public DragDrop(){

        this.add(drag);
        this.setTitle("boom");
        this.setSize(500,500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        this.setResizable(false);
    }

}
