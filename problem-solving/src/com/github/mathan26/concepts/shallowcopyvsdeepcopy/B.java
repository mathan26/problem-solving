package com.github.mathan26.concepts.shallowcopyvsdeepcopy;

public class B implements Cloneable {
    private int empId;
    private A objectA;


    public B(int empId, A objectA) {
        this.empId = empId;
        this.objectA = objectA;
    }

    public int getEmpId() {
        return empId;
    }

    public A getObjectA() {
        return objectA;
    }

    protected Object clone() throws CloneNotSupportedException {
        B b = (B) super.clone();
        b.objectA = (A) objectA.clone();
//        return super.clone();    // shallow clone
        return b; //deep clone
    }
}
