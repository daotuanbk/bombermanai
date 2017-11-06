package maps;


import java.util.List;
import background.Background;
import bases.GameObject;

public class Layer {
    Background background;
    private List<Integer> data;
    private int height;
    private int width;

    @Override
    public String toString() {
        return "Layer{" +
                "data=" + data +
                ", height=" + height +
                ", width=" + width +
                '}';
    }

    public void generate() {
        for (int titleY = 0; titleY < height; titleY++) {
            for (int titleX = 0; titleX < width; titleX++) {
                int mapData = data.get(titleY * width + titleX);
                if (mapData!=0) {
                    background = Background.create(mapData);
                    background.position.set(titleX * 38, titleY *38);
                    GameObject.add(background);
                }
            }
        }

    }
}
