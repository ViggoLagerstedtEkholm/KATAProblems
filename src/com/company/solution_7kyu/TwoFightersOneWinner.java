package com.company.solution_7kyu;

class Fighter{
    public String name;
    public int health, damagePerAttack;
    public Fighter(String name, int health, int damagePerAttack) {
        this.name = name;
        this.health = health;
        this.damagePerAttack = damagePerAttack;
    }
}

class TwoFightersOneWinner {

    public static String declareWinner(Fighter fighter1, Fighter fighter2, String firstAttacker) {
        //Every odd number is fighter1's turn, every even number is fighter2's turn.
        int startIndex = 0;
        if(firstAttacker.equals(fighter1.name)) startIndex = 1;
        if(firstAttacker.equals(fighter2.name)) startIndex = 2;
        while(true){
            if(startIndex % 2 == 0){
                fighter1.health -= fighter2.damagePerAttack;
                if(isDead(fighter1.health)) return fighter2.name;
            }else{
                fighter2.health -= fighter1.damagePerAttack;
                if(isDead(fighter2.health)) return fighter1.name;
            }
            startIndex++;
        }
    }

    private static boolean isDead(int health){
        return health <= 0;
    }
}
