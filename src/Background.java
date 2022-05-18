import javax.swing.*;
import java.awt.*;


public class Background extends JPanel {

    Image shopBackground;
    Background(){
        shopBackground = new ImageIcon("src/SAG shop (1).jpg").getImage();
        this.setPreferredSize(new Dimension(1000,563));
    }

    public void paint(Graphics g){
        Graphics2D back2D = (Graphics2D)g;
        back2D.drawImage(shopBackground, 0, 0 ,null);
    }
}
