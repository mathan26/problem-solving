package com.github.mathan26.concepts.stringexamples;

public class Main1 {
    public static void main(String[] args) {


        String name1 = "Mathan";
        name1 = "Mathankumar";
        System.out.println(name1);
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("Mathan");
        stringBuffer.insert(6, "Kumar");
        System.out.println("StringBuffer used:  "+stringBuffer);

        String obj1 = new String("Mathan");
        obj1="Mathankumar";

        Currency india = Currency.of("Rupee");
        Money money = new Money(1000,india);
        money.getAmount();
        money.getCurrency().getValue();

        FinalClass finalClass = new FinalClass("Mathan");
        // finalClass.finalName="Modified"; // Cannot assign a value to final variable 'finalName'
        //If you don't want visibility declare the name with private
    }
}
