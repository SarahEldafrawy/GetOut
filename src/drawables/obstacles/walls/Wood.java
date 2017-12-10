package drawables.obstacles.walls;

import drawables.obstacles.Wall;
import javafx.scene.canvas.Canvas;

import java.awt.*;

public class Wood extends StandardWall implements Wall {

    private int wallHealth;

    public void Wood() {
        this.wallHealth = 80;
    }

    @Override
    public void takeBullet(int bulletDamage) {
        this.wallHealth -= bulletDamage;
        if (this.wallHealth <= 0) {
            this.destroy();
        }
    }

    @Override
    public void drawOnCanvas(Canvas canvas) {
        //TODO
    }

    @Override
    public void destroy() {
        return;
    }
}
