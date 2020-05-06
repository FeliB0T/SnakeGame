

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.geom.Line2D;


public class game extends JComponent {//esta referente a este frame, como puxar para outro frame criado?

public static void main(String[] args) {
    Controle controle = new Controle();

    controle.criarJanela();
    controle.Controle();




}
}
