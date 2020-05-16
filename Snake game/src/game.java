

import javax.swing.*;
import java.util.TimerTask;
import java.util.concurrent.TimeUnit;


public class game extends JComponent {//esta referente a este frame, como puxar para outro frame criado?
public static void main(String[] args) throws InterruptedException {


  Controle controle = new Controle();

    controle.criarJanela();
    controle.Controle();





}
}
