package com.coding.livecoding.task19;

public class Poem {
    Author creator;
    int stropheNumbers;

    public Poem() {
    }

    public void setCreator(Author creator) {
        this.creator = creator;
    }

    public void setStropheNumbers(int stropheNumbers) {
        this.stropheNumbers = stropheNumbers;
    }

    public Poem(Author creator, int stropheNumbers) {
        this.creator = creator;
        this.stropheNumbers = stropheNumbers;
    }
}
