package com.github.mathan26.concepts.boundedTypes;

public class BoundType<T extends A & Interf> {

    private T objRef;

    public BoundType(T obj) {
        this.objRef = obj;
        objRef.display();
    }
}
