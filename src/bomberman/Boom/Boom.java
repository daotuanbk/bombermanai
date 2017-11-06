package bomberman.Boom;

import bases.GameObject;
import bases.physics.BoxCollider;
import bases.physics.ImageRenderer;
import bomberman.Player.Player;
import bomberman.Player.PlayerPlaceBoom;

public class Boom extends GameObject {

    BoxCollider boxCollider;


    public Boom() {
        this.renderer = new ImageRenderer("assets/images/boom/boom.png");
    }

    @Override
    public void run() {
        if(BoomExplode.deleteBoom == true){
            System.out.println("matbom");
            BoomExplode.deleteBoom = false;
            getHit();
        }
    }


    public void getHit () {
        this.isActive = false;
    }
}
