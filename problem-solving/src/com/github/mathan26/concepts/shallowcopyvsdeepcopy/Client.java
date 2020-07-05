package com.github.mathan26.concepts.shallowcopyvsdeepcopy;

public class Client {
    public static void main(String[] args) throws CloneNotSupportedException {
        A obj1 = new A("Mathan"); // new object created
        A obj2 = obj1; // Shalow copy both Obj1 and Obj2 Points the same memory location

        System.out.println(obj1.hashCode()==obj2.hashCode()); //true

        //If we use clone method it will create new memory

        A objectA = new A("Mathan");
        B bObj1 = new B(100, objectA);
        B bObj2 = (B) bObj1.clone();
        System.out.println(bObj1.hashCode()== bObj2.hashCode()); // false

        //but in case if another class mentioned as instance var this case shallow copy only created
        System.out.println(bObj1.getObjectA().hashCode()== bObj2.getObjectA().hashCode()); // false  //Check the clone method of B class

        //In order to deep copy need to clone the instance object too.
//        protected Object clone() throws CloneNotSupportedException {
//            B b = (B)super.clone();
//            b.objectA=(A)objectA.clone();
//            return super.clone();
//        }

    }
}
