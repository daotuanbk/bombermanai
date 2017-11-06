package bomberman.Boom;

import bases.GameObject;
import bases.physics.BoxCollider;
import bases.physics.ImageRenderer;
import bomberman.Player.Player;
import bomberman.Player.PlayerPlaceBoom;

public class Boom extends GameObject {
    Player player;
    PlayerPlaceBoom playerPlaceBoom;
    BoomExplode boomExplode;

    BoxCollider boxCollider;


    public Boom() {
        player = new Player();
        playerPlaceBoom = new PlayerPlaceBoom();
        this.renderer = new ImageRenderer("assets/images/boom/boom.png");
        boomExplode = new BoomExplode(this);
        this.position.set(player.position);
    }

    @Override
    public void run() {
        if(boomExplode.isExploded){
            System.out.println("yes");
        }
    }


    public void getHit () {
        this.isActive = false;
    }
}
