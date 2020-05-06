import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import static java.awt.event.KeyEvent.*;
import static java.awt.event.KeyEvent.VK_DOWN;

public class criarJanela extends Frame{

    private Image dbImage;
    private Graphics dbg;


    public int x1=200,y1=300;
    public void paintComponent(Graphics g) {
        dbImage = createImage(getWidth(),getHeight());
        dbg = dbImage.getGraphics();
        paint(dbg);
        g.drawImage(dbImage,0,0,this);
    }

    public void paint(Graphics g){
        g.fillOval(x1,y1,10,10);
         repaint();}


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