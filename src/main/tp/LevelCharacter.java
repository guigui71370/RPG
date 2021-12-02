package main.tp;

public class LevelCharacter {

    private static final int START_LEVEL = 1;


    private Point level;

    public LevelCharacter() {
        level=new Point();
        level.pointSetMinLevelPoint();
    }


    @Override
    public String toString() {
        return "LevelCharacter{" +
                "level=" + level +
                '}';
    }


    public void attackOnCharacter(Character c) {
        c.receiveDamage(level);
    }
}
