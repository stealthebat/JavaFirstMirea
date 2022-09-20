package ru.mirea.task4.task4_4;

public class Processor {
    private int coresNum;

    public Processor(int coresNum) {
        this.coresNum = coresNum;
    }

    public int getCoresNum() {
        return coresNum;
    }


    public void setCoresNum(int coresNum) {
        this.coresNum = coresNum;
    }

    @Override
    public String toString() {
        return "Processor{" +
                "coresNum=" + coresNum +
                '}';
    }
}
