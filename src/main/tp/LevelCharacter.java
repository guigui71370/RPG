package main.tp;

public class LevelCharacter {

    private static final int START_LEVEL = 1;


    private int level;

    public LevelCharacter() {
        level=START_LEVEL;
    }
    public void levelUp(){
        level+=1;
    }

/* refactor la boucle en avec en la sipriment HINT:héritage power */
    public void attack(Character c) {
        for (int compteur = 0; compteur < level; compteur++) {
            c.receiveDamage(this);
        }
    }
    public void healLevel(Character c) {
        for (int compteur = 0; compteur < level; compteur++) {
            c.receiveHeal();
        }
    }

    @Override
    public String toString() {
        return "LevelCharacter{" +
                "level=" + level +
                '}';
    }


}
