package com.github.mathan26.concepts.comparableExample;

public class Apple implements Comparable<Apple>{
    String variety;
    Color color;
    int weight;

    public Apple(String variety, Color color, int weight) {
        this.variety = variety;
        this.color = color;
        this.weight = weight;
    }

    @Override
    public int compareTo(Apple other) {
        if(this.weight < other.weight){
            return 1;
        }else if(this.weight==other.weight){
            return 0;
        }
        return -1;
    }

    @Override
    public String toString() {
        return "Apple{" +
                "variety='" + variety + '\'' +
                ", color=" + color +
                ", weight=" + weight +
                '}';
    }
}
