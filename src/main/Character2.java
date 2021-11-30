package main;

public class Character2 {
    public static final int MAX_LIFE_POINT = 1000;
    public static final int MIN_LIFE_POINT = 0;
    private int lifePoint;
    private int level;
    private boolean isALive;

    public Character2(boolean aLive) {
        lifePoint = aLive ? MAX_LIFE_POINT : MIN_LIFE_POINT;
        level = 1;
        isALive = aLive;
    }

    public void attackCharacter(Character2 c) {
        if (this.isALive && c.isALive) {
            c.lifePoint -= this.level;
            if (c.lifePoint <= MIN_LIFE_POINT) {
                c.isALive = false;
                c.lifePoint = 0;
                this.level++;
            }
        }
    }

    public void heal(Character2 c) {
        if (this.isALive && c.isALive) {
            if (c.lifePoint + this.level <= MAX_LIFE_POINT) {
                c.lifePoint += this.level;
            } else {
                c.lifePoint = MAX_LIFE_POINT;
            }
        }
    }

    @Override
    public String toString() {
        return "Character{" +
                "lifePoint=" + lifePoint +
                ", level=" + level +
                ", isALive=" + isALive +
                '}';
    }


}

