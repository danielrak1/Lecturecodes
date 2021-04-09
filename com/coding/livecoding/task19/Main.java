package com.coding.livecoding.task19;

public class Main {
    public static void main(String[] args) {
        Poem poemOne = new Poem();
        poemOne.setStropheNumbers(7);
        poemOne.setCreator(new Author("Patrik", "Est"));

        Poem poemTwo = new Poem();
        poemTwo.setStropheNumbers(4);
        poemTwo.setCreator(new Author("Dea", "Fin"));

        Poem poemThree = new Poem();
        poemThree.setStropheNumbers(4);
        poemThree.setCreator(new Author("Joy", "Swe"));

        if(poemOne.stropheNumbers >= poemTwo.stropheNumbers &&
        poemOne.stropheNumbers >= poemThree.stropheNumbers){
            System.out.println(poemOne.creator.surname);
        }else if(poemTwo.stropheNumbers >= poemThree.stropheNumbers) {
            System.out.println(poemTwo.creator.surname);
        }else{
            System.out.println(poemThree.creator.surname);
        }
    }
}
