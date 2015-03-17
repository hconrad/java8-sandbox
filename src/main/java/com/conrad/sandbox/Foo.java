package com.conrad.sandbox;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by hans.conrad on 3/16/2015.
 */
public class Foo {

    private String item;

    List<Bar> bars;

    private int num;

    public Foo(String foo, int num){
        this.item = foo;
        this.num = num;
        bars = new ArrayList<>();
    }

    public List<Bar> listBars() {
        return bars;
    }

    public void addBar(Bar bar){
        this.bars.add(bar);
    }
    public String getItem() {
        return item;
    }

    public void setItem(String item) {
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
        return "Foo{" +
                "item='" + item + '\'' +
                ", num=" + num +
                '}';
    }
}
