import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

import static java.awt.event.KeyEvent.*;
import static java.awt.event.KeyEvent.VK_DOWN;

public class criarJanela extends Frame implements ActionListener
{
    public int x=250,y=250,j=0;
    private Image dbImage;
    private Graphics dbg;

        @Override
        public void actionPerformed (ActionEvent e){
            addKeyListener(new KeyListener() {
                @Override
                public void keyTyped(KeyEvent e) {

                }

                @Override
                public void keyPressed(KeyEvent e) {
                    if(e.getKeyCode()==VK_RIGHT){
                       j=10;

                    }
                    if(e.getKeyCode()==VK_LEFT){
                        j=-10;
                    }
                }

                @Override
                public void keyReleased(KeyEvent e) {

                }
            });
            x=x+j;
            if(x>=500)x=0;
            repaint();
            timer.start();


    }





    Timer timer = new Timer(100,this);

    public void paintComponent(Graphics g) {
        dbImage = createImage(getWidth(),getHeight());
        dbg = dbImage.getGraphics();
        paint(dbg);
        g.drawImage(dbImage,0,0,this);

    }

    public void paint(Graphics g){
        super.paintComponents(g);
        g.fillOval(x,200,10,10);
         repaint();
         timer.start();
    }


    
    public void criarJanela(){
        setTitle("SnakeGame");
        setBounds(500, 400, 500, 500);
        setVisible(true);
        setResizable(false);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });


    }

}