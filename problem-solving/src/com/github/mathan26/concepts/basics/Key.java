package com.github.mathan26.concepts.basics;

import java.util.Objects;

public class Key {
    String key;

    public Key(String key) {
        this.key = key;
    }

    @Override
    public boolean equals(Object o){
        return key.equals(((Key)o).key);
    }

    @Override
    public int hashCode() {
        int hash = (int) key.charAt(0);
        System.out.println("Hashcode for the key "+hash);
        return hash;
    }
}
