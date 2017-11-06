import bases.InputManager;
import maps.Map;

import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class GameWindow extends JFrame {
    GameCanvas canvas;
    long lastTimeUpdate;

    public GameWindow() {
        lastTimeUpdate = System.nanoTime();
        canvas = new GameCanvas();

        this.setSize(600, 800);
        this.setContentPane(canvas);
        this.canvas.setVisible(true);
        this.setVisible(true);
        this.setResizable(false);
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        this.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {
                InputManager.instance.keyPressed(e);
            }

            @Override
            public void keyReleased(KeyEvent e) {
                InputManager.instance.keyReleased(e);
            }
        });
    }



    public void gameLoop() {
        while (true) {
            long currentTime = System.nanoTime();
            if (currentTime - lastTimeUpdate >= 17000000) {
                canvas.run();
                canvas.repaint();
                lastTimeUpdate = currentTime;

            }

        }
    }
}
