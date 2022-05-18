import javax.swing.*;
import java.awt.*;

public class Eren extends Animal{

   private static final ImageIcon erenImageIcon = new ImageIcon("src/Eren (1).jpg");
   private static final Image erenTheImage = erenImageIcon.getImage();
    public Eren(int hp, int attack, String name, Image erenImage){

        super(hp, attack, name, erenImage);

    }
    public static void ability(){
        System.out.println("USE EREN ATTACK!");
    }

    public static Image getErenImage(){
        return erenTheImage;
    }
}
