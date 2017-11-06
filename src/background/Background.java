package background;

import bases.GameObject;
import bases.physics.BoxCollider;
import bases.physics.ImageRenderer;
import bases.Utils;
import bases.physics.PhysicsBody;

public class Background extends GameObject implements PhysicsBody {
    public int isType;


    public static final int NORMALTILE = 0;
    public static final int BLOCKTILE = 1;
    public static final int BRICKTILE = 2;

    public BoxCollider boxCollider;

    public Background() {

        boxCollider = new BoxCollider(38, 38);
    }

    public static Background create(int BackgroundType) {
        Background background = new Background();

        switch (BackgroundType) {
            case 1:
                background.renderer = new ImageRenderer(Utils.loadImage("assets/images/brick/UnBreakBrick.png"));
                background.isType = BLOCKTILE;
                break;
            case 2:
                background.renderer = new ImageRenderer(Utils.loadImage("assets/images/brick/breakableBrick.png"));
                background.isType = BRICKTILE;
                break;
            case 3:
                background.renderer = new ImageRenderer(Utils.loadImage("assets/images/brick/background.png"));
                background.isType = NORMALTILE;
                break;


        }
        return background;
    }

    @Override
    public BoxCollider getBoxCollider() {
        return this.boxCollider;
    }
}
