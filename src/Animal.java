import javax.swing.*;
import java.awt.*;

public class Animal {

    private String name;
    private int attack;
    private int hp;

    private Image pic;

    private ImageIcon icon;

    public Animal(int hp, int attack, String name, Image pic){
        this.hp = hp;
        this.attack = attack;
        this.name = name;
        this.icon = new ImageIcon(pic);

    }
    public int getHp() {
        return hp;
    }
    public int getAttack(){
        return attack;
    }
    public String getName(){
        return name;
    }
    public Image getIcon(){
        return pic;
    }

}

