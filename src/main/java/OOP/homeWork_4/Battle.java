package OOP.homeWork_4;

import OOP.homeWork_4.warriors.Warrior;

public class Battle {
    private Warrior w1;
    private Warrior w2;

    public Battle(Warrior w1, Warrior w2) {
        this.w1 = w1;
        this.w2 = w2;
    }

    public void fight() {
        int count=1;
        while (w1.getHealthPoint() > 0 && w2.getHealthPoint() > 0) {

            int damage1 = w1.hit();
            int protection2 = w2.getProtection();
            System.out.println("=====" + count + "=====");
            System.out.println("Урон1: " + damage1 + "\tБроня2: " + protection2);
            int damageProtection;
                    if(protection2 >= damage1){
                        damageProtection = 0;
                    }else {
                        damageProtection = damage1 - protection2;
                    }
            w2.reduceHealth(damageProtection);

            int damage2 = w2.hit();
            int protection1 = w1.getProtection();
            System.out.println("Урон2: " + damage2 + "\tБроня1: " + protection1);
            int damageProtection2;
            if(protection1 >= damage2){
                damageProtection2 = 0;
            }else {
                damageProtection2 = damage2 - protection1;
            }
            w1.reduceHealth(damageProtection2);
            System.out.println("Жизнь1: " + w1.getHealthPoint());
            System.out.println("Жизнь2: " + w2.getHealthPoint());
            count++;
        }
        String winner;
        if(w1.getHealthPoint()>0){
            winner = w1.getName() + " Жизнь " + w1.getHealthPoint();
        }else if(w2.getHealthPoint()>0){
            winner = w2.getName() + " Жизнь " + w2.getHealthPoint();
        }else{
            winner = "Нечья";
        }

        System.out.println("Победитель: " + winner);
    }

}
