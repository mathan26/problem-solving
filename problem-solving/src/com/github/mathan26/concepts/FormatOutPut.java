package com.github.mathan26.concepts;

public class FormatOutPut {
    public static void main(String[] args) {
        //Integer value
        System.out.format("%d ", 100);//100
        //Stirng value
        System.out.format(" %s", "Mathankuar");//Mathankuar
        //float
        System.out.printf(" %f", 12.44);//12.440000

        //restrict the floating after points
        System.out.printf(" %.1f", 134.23423423423424);//134.2
    }
}
