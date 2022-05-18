
import javax.swing.*;
import java.awt.*;

public class DragDrop extends JFrame {

    Background panel;
//    private Image yeet;
    public DragDrop(Image yeet){
        DragPanel drag = new  DragPanel(yeet);

        panel = new Background();
        this.add(panel);
        this.pack();

        this.add(drag);
        this.setTitle("boom");
        //this.setSize(500,500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        this.setResizable(false);



    }

}
