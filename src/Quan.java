import javax.swing.*;
import java.awt.*;

public class Quan extends Animal{

    private static final ImageIcon quanImageIcon = new ImageIcon("src/quan_messy.jpg");
    private static final Image quanTheImage = quanImageIcon.getImage();
    public Quan(int hp, int attack, String name, Image quanImage){

        super(hp, attack, name, quanImage);

    }
    public static void ability(){
        System.out.println("USE Quan ATTACK!");
    }

    public static Image getQuanImage(){
        return quanTheImage;
    }
}
