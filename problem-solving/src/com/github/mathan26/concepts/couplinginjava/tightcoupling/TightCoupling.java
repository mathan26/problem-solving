package com.github.mathan26.concepts.couplinginjava.tightcoupling;


//Tight coupling : In general, Tight coupling means the two classes often change together.
public class TightCoupling {
    public static void main(String[] args) {
        Subject obj = new Subject();
        obj.startReading();
    }
}
