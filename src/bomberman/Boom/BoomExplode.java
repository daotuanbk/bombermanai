package bomberman.Boom;

import bases.GameObject;
import bases.InputManager;
import bases.physics.BoxCollider;
import bases.physics.ImageRenderer;
import bomberman.Player.PlayerPlaceBoom;

public class BoomExplode extends GameObject{
    public static boolean deleteBoom;
    BoxCollider boxCollider;
    boolean isExploded ;


    int explodeCount = 0;
    final int explodeTime = 50;

    public BoomExplode () {
        this.isExploded = true;
        boxCollider = new BoxCollider(38,38);
        this.renderer = new ImageRenderer("assets/images/brick/breakableBrick.png");
    }

    public void run(Boom owner) {
        if (PlayerPlaceBoom.checkExplode == true) {
                isExploded = false;


        }


        if (isExploded == false) {
            explodeCount ++;
            if (explodeCount >= explodeTime) {
                isExploded = true;
                deleteBoom = true;
                explodeCount = 0;
            }
            return;
        }

    }
}
