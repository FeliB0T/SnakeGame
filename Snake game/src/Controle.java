import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import static java.awt.event.KeyEvent.*;
import static java.awt.event.KeyEvent.VK_DOWN;

public class Controle extends criarJanela {

    public void Controle() {
        addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
            }

            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == VK_LEFT) {
                    x1 = x1 - 3;
                    if(x1<=0){
                        x1=500;
                    }
                }
                if (e.getKeyCode() == VK_RIGHT) {
                    x1 = x1 + 3;
                    System.out.print(x1+" ");
                    if(x1>=500){
                        x1=-3;
                    }


                }
                if (e.getKeyCode() == VK_UP) {
                    y1 = y1 - 3;
                    if(y1<0){y1=500;}
                }
                if (e.getKeyCode() == VK_DOWN) {
                    y1 = y1 + 3;
                    if(y1>500){
                        y1=-3;
                    }
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {

            }
        });

    }
}