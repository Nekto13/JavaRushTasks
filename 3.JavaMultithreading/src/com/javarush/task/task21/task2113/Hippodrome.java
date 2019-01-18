package com.javarush.task.task21.task2113;

import java.util.LinkedList;
import java.util.List;

public class Hippodrome extends Thread {

    private List<Horse> horses;
    public static Hippodrome game;

    public Hippodrome(List<Horse> horses){
        this.horses = horses;
    }

    public Hippodrome() {
        this.horses = new LinkedList<>();
    }

    public List<Horse> getHorses() {
        return horses;
    }

    public void setHorses(List<Horse> horses) {
        this.horses = horses;
    }


    public void print(){
        for (int i = 0; i <horses.size() ; i++) {
            horses.get(i).print();
        }
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
    }

    public void move(){
        for (int i = 0; i <horses.size() ; i++) {
            horses.get(i).move();
        }
    }

    public void run()  {
        for (int i = 0; i < 100; i++) {
            this.move();

            this.print();
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }

    public Horse getWinner(){
        double max = 0;
        Horse horse = null;
        for (int i = 0; i <horses.size(); i++) {
            if(horses.get(i).getDistance() > max){
                max = horses.get(i).getDistance();
                horse = horses.get(i);
            }
        }
        return horse;
    }

    public void printWinner(){
        System.out.println("Winner is " + this.getWinner().getName() + "!");
    }

    public static void main(String[] args) {

        game = new Hippodrome();
        Horse horseOne = new Horse("Grom", 3, 0);
        Horse horseTwo = new Horse("Flash", 3, 0);
        Horse horseTree = new Horse("BigBob", 3, 0);

        game.getHorses().add(horseOne);
        game.getHorses().add(horseTwo);
        game.getHorses().add(horseTree);

        game.run();
        game.printWinner();

    }
}
