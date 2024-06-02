package design.patterns.flyweight;

import java.util.*;

public class BulletFactory {
    private static Map<BulletType, Bullet> bullets = new HashMap<>();
    public Bullet getBullet(BulletType type) {
        Bullet bullet = bullets.get(type);
        if(bullet == null){
            bullet = bullets.put(type, new Bullet());
        }

        return bullet;
    }
    public void addBullet(BulletType type, Bullet bullet) {
        bullets.put(type, bullet);
    }
}
