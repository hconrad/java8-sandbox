package com.conrad.sandbox;

/**
 * Created by hans.conrad on 3/16/2015.
 */
public class Bar {
    private int num;

    private String item;

    public Bar(int num, String item){
        this.num = num;
        this.item = item;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return "Bar{" +
                "num=" + num +
                ", item='" + item + '\'' +
                '}';
    }
}
