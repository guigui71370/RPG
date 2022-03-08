package main.tp;

public class ALive {

    private boolean isAlive;
    private Stat stat;

    public ALive() {
        isAlive = true;
        stat =new Stat();
    }



    public  void authorizeAttackOnCharacter(ALive c) {
        if(isAlive){
            c.receiveDamage(stat);
        }
    }

    private void receiveDamage(Stat statCharacterWhoGiftDamage) {
        if(isAlive){
            stat.receiveDamage(statCharacterWhoGiftDamage);
            stat.isDeath(this,statCharacterWhoGiftDamage);
        }
    }
    public void healCharacter(ALive c) {
        if(isAlive){
            c.receiveHeal(stat);
        }
    }

    private void receiveHeal(Stat statCharacterWhoGiftHeal) {
        if(isAlive){
            stat.receiveHeal(statCharacterWhoGiftHeal);
        }
    }

    @Override
    public String toString() {
        return "ALive{" +
                "isAlive=" + isAlive +
                ", stat=" + stat +
                '}';
    }

    public void death() {
        isAlive=false;
    }


}
