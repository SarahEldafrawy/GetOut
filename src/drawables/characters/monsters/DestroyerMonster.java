package drawables.characters.monsters;

import drawables.characters.monsters.Behaviors.RPGShootingBehavior;
import drawables.characters.monsters.Behaviors.ShootingBehavior;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;

import java.awt.*;

public class DestroyerMonster extends StandardMonster{
    private final int HEALTH_POINTS = 100;
    private final int DAMAGE = 50;
    private final ShootingBehavior shootingBehavior = new RPGShootingBehavior();


    public DestroyerMonster(){
        setDamage();
        setShootingBehavior();
        setHealthPoints();
        spriteSetters();
    }


    @Override
    protected int getMonsterDamage() {
        return DAMAGE;
    }

    @Override
    protected ShootingBehavior getShootingBehavior() {
        return shootingBehavior;
    }

    @Override
    protected int getMonsterHealthPoints() {
        return HEALTH_POINTS;
    }

}
