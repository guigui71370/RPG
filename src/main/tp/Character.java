package main.tp;

public class Character {
    //private LevelCharacter level =new LevelCharacter();

    private final ALive isAlive;

    public Character(){

        isAlive=new ALive();
    }


    public void attackCharacter(Character c){
        isAlive.authorizeAttackOnCharacter(c.isAlive);
    }
    public void receiveDamage(Point damageReceive) {

    }
    public void healCharacter(Character c){

    }


    @Override
    public String toString() {
        return "Character{" +
                "isAlive=" + isAlive +
                '}';
    }

    public static void main(String[] args) {
        Character c1 =new Character();
        Character c2 =new Character();
        Character c3 =new Character();
        System.out.println("C1 "+c1);
        System.out.println("C2 "+c2);
        System.out.println("C3 "+c3);

       for (int i = 0; i < 1101; i++) {
            c1.attackCharacter(c2);

        }
       c3.attackCharacter(c2);
       for (int i = 0; i < 1000; i++) {
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
        *
        System.out.println("healing test");
        System.out.println("C2 "+c2);
        c1.healCharacter(c2);
        System.out.println("C2 "+c2);
        Character c4=new Character();
        c1.attackCharacter(c4);
        c1.attackCharacter(c4);
        System.out.println("C4 "+c4);

        c1.healCharacter(c4);
        System.out.println("C4 "+c4);*/
    }



}
