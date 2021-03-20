package com.coding.task10;

public class Stopwatch {
    private long startTime;
    private long endTime;

    public Stopwatch(){
        startTime = System.currentTimeMillis();
    }

    public long getStartTime() {
        return startTime;
    }

    public long getEndTime() {
        return endTime;
    }

    public void start(){
        this.startTime=System.currentTimeMillis();
    }

    public void stop(){
        endTime=System.currentTimeMillis();
    }

    public long getElapsedtime(){
        return(this.endTime-this.startTime);

    }
}
