package main.tp;

public class Stat {
    private static final int MAX_LIFE_POINT = 1000;
    private static final int MIN_LIFE_POINT = 0;

    private final Point lifePoint;
    private final Point level;

    Stat() {
        lifePoint=new Point();
        lifePoint.pointSetMaxLifePoint();
        level=new Point();
        level.pointSetMinLevelPoint();
    }


    @Override
    public String toString() {
        return "Stat{" +
                "lifePoint=" + lifePoint +
                ", level=" + level +
                '}';
    }


    public void receiveDamage(Stat stat) {
        lifePoint.subtractHealthPoint(stat.level);
    }

    public void isDeath(ALive aLive, Stat statCharacterWhoGiftDamage) {
        lifePoint.lifePointEqualZero(aLive,statCharacterWhoGiftDamage);
    }

    public void levelUp() {
        level.levelUpPoint();
    }

    public void receiveHeal(Stat statCharacterWhoGiftHeal) {
        lifePoint.addHealthPoint(statCharacterWhoGiftHeal.level);
    }
}
