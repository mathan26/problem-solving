package com.github.mathan26.concepts.hashcodeandequals;

public class A {
    public String name;
    public int id;

    public A(String name, int id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj)
            return true;
        if(obj == null || obj.getClass()!= this.getClass())
            return false;
        // type casting of the argument.
        A geek = (A) obj;
        return (geek.name == this.name && geek.id == this.id);
    }

    @Override
    public int hashCode() {
        return  this.id;
    }
}
