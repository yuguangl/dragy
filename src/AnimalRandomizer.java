import javax.swing.*;
import java.awt.*;

public class AnimalRandomizer {

    public void addAnimalToShop(){
//        if ((int)(Math.random()*11) >= 5){
//            addEren();
//        }else{
//            addQuan();
//        }
        addEren();
//        addQuan();
    }

    public void addEren(){
        Animal eren = new Eren(2, 2, "Eren", Eren.getErenImage());
        DragDrop window = new DragDrop(Eren.getErenImage());
    }
    public void addQuan(){
        Animal eren = new Quan(99, 99, "Quan", Quan.getQuanImage());
        DragDrop window = new DragDrop(Quan.getQuanImage());
    }
}
