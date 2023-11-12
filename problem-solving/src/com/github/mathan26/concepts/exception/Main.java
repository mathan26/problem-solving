package com.github.mathan26.concepts.exception;

class Base extends Exception {

}

class Derived extends Base {

}

public class Main {

    public static void main(String[] args) {
        try {
            throw new Derived();
        } catch (Base d) {
            System.out.println("caught");
        }
    }

    private void call() {

    }
}
