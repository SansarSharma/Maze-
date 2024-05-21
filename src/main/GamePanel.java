package main;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.*;

public class GamePanel extends JPanel implements Runnable{
    
    // SCREEN SETTINGS
    Toolkit toolkit = Toolkit.getDefaultToolkit();
    Dimension screenSize = toolkit.getScreenSize();
    final int screenWidth = screenSize.width;
    final int screenHeight = screenSize.height;


    final int originalTileSize = 16; //16x16 tile
    final int scale = 3;

    Thread gameThread; 

    public GamePanel() {
        this.setPreferredSize(new Dimension(screenWidth, screenHeight) );
        this.setBackground(Color.black);
        this.setDoubleBuffered(true);
    }

    public void startGameThread() {
        gameThread = new Thread(this);

    }

    @Override
    public void run(){

    }
}
