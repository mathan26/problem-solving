package com.github.mathan26.ninety_nine_probelms;

import org.junit.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    LinkedList<String> linkedList;

    @BeforeEach
    void setUp() {
        // Have to pass the Arrays.asList inside the Arguments
        linkedList = new LinkedList<>(Arrays.asList("a", "b", "c", "d"));
    }

    @Test
    public void findLastElement(){
        // LinkedList gived getLast method to directly access the last element
        assertThat(linkedList.getLast(),is(equalTo("d")));
    }

    @Test
    public void findSecondLastElement(){
        // Second last element can be get by size - 2 using the get method
        assertThat(linkedList.get(linkedList.size()-2),is(equalTo("c")));
    }

    @Test
    public void skipInJava8(){
        // intermediate operation that discards the first n elements of a stream
        Stream.of(1,2,3,4,5,6,7,8,9,10).filter(i->i % 2 == 0).skip(2).forEach(i->{
            assertTrue(i!=2 || i!= 4);
        });
    }

    @Test
    public void limitInJava8(){
        //  intermediate operation that returns a stream not longer than the requested size.
        Stream.of(1,2,3,4,5,6,7,8,9,10).filter(i->i % 2 == 0).limit(2).forEach(i->{
            assertTrue(i==2 || i== 4);
        });
    }

    @Test
    public void findKthElement(){
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        // find the 3rd element in the list
        // stream the list limit then convert to linkedlist
        assertThat(numbers.stream().limit(3).collect(Collectors.toCollection(LinkedList::new)).getLast(),is(equalTo(3)));
        assertThat(numbers.get(3-1),is(equalTo(3)));
    }



}