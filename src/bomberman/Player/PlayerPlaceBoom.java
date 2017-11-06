package bomberman.Player;

import bases.GameObject;
import bases.InputManager;
import bomberman.Boom.Boom;
import bomberman.Boom.BoomExplode;

public class PlayerPlaceBoom  {
    boolean spellDisabled;
    public static boolean checkExplode;
    int coolDownCount;
    final int coolDownTime = 50;

    BoomExplode boomExplode;
    Boom boom;

    public PlayerPlaceBoom() {
        boomExplode = new BoomExplode();
    }

    public void run(Player owner) {


        if (spellDisabled) {
            coolDownCount++;

            if (coolDownCount >= coolDownTime) {
                spellDisabled = false;
                coolDownCount = 0;
            }
            return;
        }

        InputManager inputManager = InputManager.instance;
        if (inputManager.spacePressed) {
            boom = GameObject.recycle(Boom.class);
            boom.position.set(owner.position.x, owner.position.y);
            checkExplode = true;
            spellDisabled = true;
        }


            boomExplode.run(this.boom);
            checkExplode = false;

    }


}
