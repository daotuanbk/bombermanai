import bases.GameObject;
import bomberman.player.Player;
import maps.Map;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;

public class GameCanvas extends JPanel {
    BufferedImage image;
    Graphics backGraphics;
    Player player = new Player();

    public GameCanvas() {
        loadBackground();
        GameObject.add(player);
        image = new BufferedImage(600, 800, BufferedImage.TYPE_INT_ARGB);
        backGraphics = image.getGraphics();
    }


    @Override
    protected void paintComponent(Graphics g) {
        g.drawImage(image, 0, 0, null);

    }

    private void loadBackground() {
        Map map = Map.load("assets/map/map_lvl_0.json");
        map.generate();
    }

    public void run() {

        GameObject.runAll();
        GameObject.renderAll(backGraphics);
    }
}



