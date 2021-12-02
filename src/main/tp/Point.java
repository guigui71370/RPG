package main.tp;

public class Point {
    private static final int MAX_LIFE_POINT = 1000;
    private static final int MIN_LIFE_POINT = 0;
    private int point;

    public Point(){
       point=0;
    }
    public void pointSetMaxLifePoint(){
        point=1000;
    }

    public void pointSetMinLevelPoint(){
        point=1;
    }
    public void levelUpPoint(){
        point++;
    }
     public void subtractHealthPoint(Point damageReceive){
        point-=damageReceive.point;
     }
     public void addHealthPoint(Point healthPoint){
        healthPoint.point-=point;
     }

    @Override
    public String toString() {
        return "Point{" +
                "point=" + point +
                '}';
    }

    public void lifePointEqualZero(ALive aLive, Stat statCharacterWhoGiftDamage) {
        if(point<=0){
            point=0;
            aLive.death();
            statCharacterWhoGiftDamage.levelUp();
        }
    }
}
