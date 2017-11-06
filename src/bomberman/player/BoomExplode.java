package bomberman.player;

import bases.GameObject;
import bases.physics.BoxCollider;
import bases.physics.ImageRenderer;
import bases.physics.Renderer;

public class BoomExplode extends GameObject{
    Boom boom;
    BoxCollider boxCollider;
    boolean isExploded ;

    int explodeCount = 0;
    final int explodeTime = 50;

    public BoomExplode (Boom boom) {
        boxCollider = new BoxCollider(38,38);
        this.boom = boom;
        this.renderer = new ImageRenderer("assets/images/brick/breakableBrick.png");
        this.position.set(boom.position);
    }

    public void run() {
            explodeCount++;
            if (explodeCount >= explodeTime) {
                isExploded = true;
                explodeCount = 0;
            }
            return;
        }


}
