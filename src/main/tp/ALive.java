package main.tp;

public class ALive {

    private boolean isAlive;
    LevelCharacter levelCharacter;

    public ALive(LevelCharacter level) {
        isAlive = true;
        levelCharacter = level;
    }


    public void attack(Character c) {
        if (isAlive) {
            levelCharacter.attack(c);
        }
    }

    public void heal(Character c) {
        if (isAlive) {
            levelCharacter.healLevel(c);
        }
    }

    private void death() {
        isAlive = false;
    }

    public void giveExperienceWhenDie(LevelCharacter l) {
        if (isAlive) {
            l.levelUp();
            death();
        }
    }

    @Override
    public String toString() {
        return "ALive{" +
                "isAlive=" + isAlive +
                ", levelCharacter=" + levelCharacter +
                '}';
    }


    public void authorizeHeal(LifePoint lifePoint) {
        if(isAlive){
            lifePoint.heal();
        }

    }
}
