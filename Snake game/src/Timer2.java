import java.awt.*;
import java.util.Timer;
import java.util.TimerTask;

public class Timer2 extends criarJanela {
    public static int x;

    public void recebeNumero(int x){
        this.x = x;
    }

    public Timer timer = new Timer();
    TimerTask task = new TimerTask() {
        @Override
        public void run() {
            x=x+5;
            System.out.println(x);
            repaint();
            if(x>30){
                timer.cancel();
            }
        }
    };
    public void start(){
        timer.scheduleAtFixedRate(task,00,1000);
    }
    public void stoptimer(){
        timer.cancel();
    }
}
