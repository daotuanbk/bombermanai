package bomberman.Player;

import bases.GameObject;
import bases.physics.BoxCollider;
import bases.physics.ImageRenderer;

public class Player extends GameObject {

    int playerX = 200;
    int playerY = 500;

    BoxCollider boxCollider;
    PlayerMove playerMove;
    PlayerPlaceBoom playerPlaceBoom;

    public Player () {
        boxCollider = new BoxCollider(38,38);
        this.renderer = new ImageRenderer("assets/images/player/bomberman.png");
        position.set(playerX,playerY);

        playerMove = new PlayerMove();
        playerPlaceBoom = new PlayerPlaceBoom();
    }
        public void run() {
            boxCollider.postition.set(this.position);
            playerMove.run(this);
            playerPlaceBoom.run(this);
        }
    }
