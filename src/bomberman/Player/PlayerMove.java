package bomberman.Player;

import bases.InputManager;

public class PlayerMove {

    public void run(Player owner){
        int vx = 0;
        int vy = 0;

        InputManager inputManager = InputManager.instance;
        if (inputManager.upPressed) {
            vy -= 5;
        }
        if (inputManager.downPressed) {
            vy += 5;
        }
        if (inputManager.leftPressed) {
            vx -= 5;
        }
        if (inputManager.rightPressed) {
            vx += 5;
        }
       owner.position.addUp(vx,vy);
    }

    private float clamp(float value, float min, float max) {
        if (value < min) {
            return min;
        }
        if (value > max) {
            return max;
        }

        return value;
    }
}
