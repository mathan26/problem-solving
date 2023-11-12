package com.github.mathan26.concepts.innerclassexample;


class OuterClass {
    static int y = 20;
    int x = 10;

    class Inner {
        int x = 100;

        public void display() {
            int x = 1000;
            System.out.println(x); //local x 1000
            System.out.println(this.x); // inner class instance  x 100
            System.out.println(OuterClass.this.x); //outer class instance X 10
            System.out.println(y);
        }
    }
}

public class AccessingStaticInstance {
    public static void main(String[] args) {
        new OuterClass().new Inner().display();
    }
}
