package com.daniel.java.OOP.PolyMorphism.Example2;

public class MainEnemy {

    public static void main(String[] args) {


        //The reference variable of a superclass can point (reference) to an EXISTING object of a child class

        System.out.println("Pointing to EXISTING object");
        Vampire vampire = new Vampire();
        WereWolf wereWolf = new WereWolf();

        Enemy enemy = vampire;
        enemy.Talk();

        Enemy enemyTwo = wereWolf;
        enemyTwo.Talk();

        //The reference variable of a superclass can point (reference) to a New object of a child class
        System.out.println("Pointing to NEW created Object");
        Enemy enemyThree = new Vampire();
        Enemy enemyFour = new WereWolf();

        enemyThree.Talk();
        enemyFour.Talk();

        // Array

        System.out.println("Array of objects example");
        Vampire vampireLast = new Vampire();
        WereWolf wereWolfLast = new WereWolf();

        Enemy enemyLast[] = {vampireLast, wereWolfLast};
        enemyLast[0].Talk();
        enemyLast[1].Talk();

    }
}
