
import javax.swing.*;
import java.awt.*;

public class DragDrop extends JFrame {

    private Image yeet;
    private JFrame window;
    public DragDrop(Image yeet){
        DragPanel drag = new  DragPanel(yeet);

        this.add(drag);
        this.setTitle("boom");
        this.setSize(500,500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        this.setResizable(false);
    }

}
