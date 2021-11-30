package main.tp;

public class Character {
    //private LevelCharacter level =new LevelCharacter();
    private final LifePoint lifePoint;
    private final ALive isAlive;

    public Character(){
        lifePoint=new LifePoint();
        isAlive=new ALive(new LevelCharacter());
    }


    public void attackCharacter(Character c){
        isAlive.attack(c);
    }
    public void healCharacter(Character c){
        isAlive.heal(c);
    }

    public void receiveDamage(LevelCharacter l) {
        lifePoint.attack(isAlive, l);
    }

    public void receiveHeal() {
        isAlive.authorizeHeal(lifePoint);

    }

    @Override
    public String toString() {
        return "Character{" +
                "lifePoint=" + lifePoint +
                ", isAlive=" + isAlive +
                '}';
    }

    public static void main(String[] args) {
        Character c1 =new Character();
        Character c2 =new Character();
        Character c3 =new Character();
        System.out.println("C1 "+c1);
        System.out.println("C2 "+c2);
        System.out.println("C3 "+c3);

       for (int i = 0; i < 1000; i++) {
            c1.attackCharacter(c2);

        }       for (int i = 0; i < 1000; i++) {
            c1.attackCharacter(c3);

        }

        System.out.println("C1 "+c1);
        System.out.println("C2 "+c2);
        System.out.println("C3 "+c3);

        /*
        *
        *
        *
        *
        * */
        System.out.println("healing test");
        System.out.println("C2 "+c2);
        c1.healCharacter(c2);
        System.out.println("C2 "+c2);
        Character c4=new Character();
        c1.attackCharacter(c4);
        c1.attackCharacter(c4);
        System.out.println("C4 "+c4);

        c1.healCharacter(c4);
        System.out.println("C4 "+c4);
    }



}
