import bases.Utils;
import com.google.gson.Gson;
import maps.Layer;
import maps.Map;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Program {
    public static void main (String [] args) {
        GameWindow gameWindow = new GameWindow();
        gameWindow.gameLoop();
    }
}
