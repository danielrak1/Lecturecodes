package com.coding.task8;

public class Stock {
   private String symbol;
    private String name;
    private double previousClosingPrice;

    public void setPreviousClosingPrice(double previousClosingPrice) {
        this.previousClosingPrice = previousClosingPrice;
    }

    public void setCurrentPrice(double currentPrice) {
        this.currentPrice = currentPrice;
    }

    private double currentPrice;

    public  Stock(String symbol, String name){
        this.symbol=symbol;
        this.name=name;
    }

    public double getChangePercent(){
        double change = currentPrice - previousClosingPrice;
        return change/previousClosingPrice *100;
    }

}


