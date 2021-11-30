package main.tp;

public class LifePoint {
    private static final int MAX_LIFE_POINT = 1000;
    private static final int MIN_LIFE_POINT = 0;

    private int lifePoint;


    LifePoint() {
        lifePoint = MAX_LIFE_POINT;

    }

    public void heal() {
        if (lifePoint < 1000)
            lifePoint++;
    }

    public void attack(ALive isAlive, LevelCharacter l) {
        substractHealthpoint();
        isDeath(isAlive,l);

    }
    private void substractHealthpoint(){
        if (lifePoint > 0)
            lifePoint--;
    }
    private void isDeath(ALive isAlive, LevelCharacter l){
        if (lifePoint == 0)
            isAlive.giveExperienceWhenDie(l);

    }
    @Override
    public String toString() {
        return "LifePoint{" +
                "lifePoint=" + lifePoint +
                '}';
    }
}
