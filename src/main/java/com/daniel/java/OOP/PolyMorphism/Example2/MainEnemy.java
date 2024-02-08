package com.daniel.java.OOP.PolyMorphism.Example2;

public class MainEnemy {

    public static void main(String[] args) {

        Vampire vampire = new Vampire();
        WereWolf wereWolf = new WereWolf();

        Enemy enemy = vampire;
        enemy.Talk();

        Enemy enemyTwo = wereWolf;
        enemyTwo.Talk();


//        Enemy enemy = vampire.Talk();





    }
}
