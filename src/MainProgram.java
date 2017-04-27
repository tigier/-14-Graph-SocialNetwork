import Control.MainController;
import View.MainFrame;

import java.awt.*;

/**
 * Created by Jean-Pierre on 12.01.2017.
 */
public class MainProgram {

    private static final int windowWidth = 1200;
    private static final int windowHeight = 1000;
    private static final String programTitle = "Projektvorlage für IntelliJ - behandelt die Datenstruktur Graph";

    public static void main (String[] args){
        EventQueue.invokeLater(
                new Runnable() {
                    @Override
                    public void run() {
                        MainProgram.setup();
                    }
                });
    }

    private static void setup(){
        // Objekt eines Controllers erstellen
        MainController mainController = new MainController();

        // Berechne Mitte des Bildschirms
        GraphicsDevice gd = GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice();
        int width = gd.getDisplayMode().getWidth();
        int height = gd.getDisplayMode().getHeight();
        int x = width / 2;
        int y = height / 2;

        // Berechne die beste obere linke Ecke für das Fenster so, dass es genau mittig erscheint
        x = x - windowWidth / 2;
        y = y - windowHeight / 2;

        // Erzeuge ein neues Fenster
        MainFrame mainFrame = new MainFrame(mainController, programTitle, x, y, windowWidth, windowHeight);
        mainFrame.setResizable(true);
    }

}
