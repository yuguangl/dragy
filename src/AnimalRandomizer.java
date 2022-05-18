import javax.swing.*;
import java.awt.*;

public class AnimalRandomizer {

//    public static void main(String[] args){
//        System.out.println("hey");
//
//    }
    public void addAnimalToShop(){
        addEren();
    }

    public void addEren(){
        Animal eren = new Eren(2, 2, "Eren", Eren.getErenImage());
        DragDrop window = new DragDrop(Eren.getErenImage());
    }
}
