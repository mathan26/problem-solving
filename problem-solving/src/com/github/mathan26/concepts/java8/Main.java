package com.github.mathan26.concepts.java8;

import java.util.*;
import java.util.function.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(Arrays.asList("I", "Love", "you", "too"));

        //java 7
        for (String str : list) {
            if (str.length() > 3) {
                System.out.println(str);//Love
            }
        }

        // Use forEach () combined with anonymous inner class to iterate
        list.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                if (s.length() > 3)
                    System.out.println(s);//Love
            }
        });

        //Lamda
        list.forEach(s -> {
                    if (s.length() > 3)
                        System.out.println(s);//Love
                }
        );

        //Requirements: Suppose there is a list of strings, and you need to delete all the strings with a length greater than 3.
        Iterator<String> iterator=list.iterator();
        while (iterator.hasNext()){
            if(iterator.next().length()>3){
                iterator.remove();
            }
        }
        System.out.println(list);//[I, you, too]
        list = new ArrayList<>(Arrays.asList("I", "Love", "you", "too"));

        //annonymous class
        list.removeIf(new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return s.length()>3;
            }
        });
        System.out.println(list);//[I, you, too]

        list = new ArrayList<>(Arrays.asList("I", "Love", "you", "too"));
        //Lamda
        list.removeIf(s->s.length()>3);
        System.out.println(list);//[I, you, too]

//        Requirement: Suppose there is a list of strings,
//        all elements with a length greater than 3 are converted to uppercase, and the remaining elements remain unchanged.
        list = new ArrayList<>(Arrays.asList("I", "Love", "you", "too"));


        /*replaceAll()*/
        //Java 7

        for(int i=0;i<list.size();i++){
            String str=list.get(i);
            if((str.length()>3)){
                list.set(i,str.toUpperCase());
            }
        }
        System.out.println(list); //[I, LOVE, you, too]

        //annonymous
        list = new ArrayList<>(Arrays.asList("I", "Love", "you", "too"));
        list.replaceAll(new UnaryOperator<String>() {
            @Override
            public String apply(String s) {
                if(s.length()>3){
                    return s.toUpperCase();
                }
                return s;
            }
        });
        System.out.println(list);

        //lamda
        list = new ArrayList<>(Arrays.asList("I", "Love", "you", "too"));
        list.replaceAll(s -> {
            if(s.length()>3){
                return s.toUpperCase();
            }else{
                return s;
            }
        });

        System.out.println(list);

        /*sort()*/

//        Requirements: Suppose there is a list of strings,
//        and the elements are sorted in ascending order according to the length of the string.
        list = new ArrayList<>(Arrays.asList("I", "Love", "you", "too"));
        Collections.sort(list,new Comparator<String>(){
            @Override
            public int compare(String str1, String str2) {
                return str1.length()-str2.length();
            }
        });
        System.out.println(list); //[I, you, too, Love]

        list = new ArrayList<>(Arrays.asList("I", "Love", "you", "too"));

//        lamda
        list.sort((str1,str2)->str1.length()-str2.length());
        System.out.println(list); //[I, you, too, Love]

//        Requirements: Suppose there is a number to the Map corresponding to English words,
//        please output all the mapping relationships in the Map.
        HashMap<Integer,String> map = new HashMap<>();
        map.put(1,"one");
        map.put(2,"two");
        map.put(3,"three");

        //java 7
        for(Map.Entry<Integer,String> entry:map.entrySet()){
            System.out.println("key: "+entry.getKey()+" value: "+entry.getValue());
        }

        //anonymous
        map.forEach(new BiConsumer<Integer, String>() {
            @Override
            public void accept(Integer integer, String s) {
                System.out.println("key :"+integer+" value: "+s);
            }
        });

        //Lamda
        map.forEach((key,value)-> System.out.println("key :"+key+" value: "+value));
       /* key :1 value: one
        key :2 value: two
        key :3 value: three*/

//        Demand; Suppose there is a number to the Map corresponding to English words,
//        output 4 corresponding to English words, if there is no output NoValue

        //java 7
        if(map.containsKey("4"))
            System.out.println(map.get(4));
        else
            System.out.println("No value");

        //Lamda
        System.out.println(map.getOrDefault("4","No Value"));//No Value

        //Requirements: Assuming there is a number to the Map corresponding to English words,
        // please convert all the words in the original mapping relationship to uppercase.

//        java 7
        for(Map.Entry<Integer,String> entry:map.entrySet()){
            entry.setValue(entry.getValue().toUpperCase());
        }
        System.out.println(map);//{1=ONE, 2=TWO, 3=THREE}

        map.put(1,"one");
        map.put(2,"two");
        map.put(3,"three");
        //anonymous
        map.replaceAll(new BiFunction<Integer, String, String>() {
            @Override
            public String apply(Integer key, String value) {
                return value.toUpperCase();
            }
        });
        System.out.println(map);

        map.put(1,"one");
        map.put(2,"two");
        map.put(3,"three");
        //lamda
        map.replaceAll((k,v)->v.toUpperCase());
        System.out.println(map);

        //merge method

        map.merge(10,"newvalue",(v1,v2)->v1+"oldvalue");
        System.out.println(map);//{1=ONE, 2=TWO, 3=THREE, 10=newvalue}
        map.merge(1,"newvalue",(v1,v2)->v1+"oldvalue");//{1=ONEoldvalue, 2=TWO, 3=THREE, 10=newvalue}
        System.out.println(map);

        //compute method
        map.compute(10,(k,v)->v.concat(" message"));
        System.out.println(map.get(10));//newvalue message
        System.out.println(map);
        //computeIfAbsent methos
        map.computeIfAbsent(10,k->"computeIfAbsent() "+"Example");
        System.out.println(map);//{1=ONEoldvalue, 2=TWO, 3=THREE, 10=newvalue message}  //No changes since the key is exist
        map.computeIfAbsent(101,k->"This key does't exist before");
        System.out.println(map);//This key does't exist before
        //{1=ONEoldvalue, 2=TWO, 3=THREE, 101=This key does't exist before, 10=newvalue message}


        map.computeIfPresent(101,(k,v)->v+" computeIfPresent example");
        System.out.println(map);
        //{1=ONEoldvalue, 2=TWO, 3=THREE, 101=This key does't exist before computeIfPresent example, 10=newvalue message}


        // ############################ STREAM()  ######################################



        //forEach()
        Stream<String> stream = Stream.of("I","Love","You","too");
        stream.filter(str->str.length()>3).forEach(str-> System.out.println(str));//Love\





        //TO SOLVE Stream has already been operated upon or closed EXCEPTION USE with Supplier Class
        //distinct()stream = Stream.of("I","Love","You","too");
        Supplier<Stream<String>> stream2=() -> Stream.of("I", "love", "you", "too", "too");

        stream2.get().distinct().forEach(str-> System.out.print(str + " ")); //I love you too

        //sort and custom sort
        stream2.get().sorted((str1,str2)->str1.length()-str2.length()).forEach(str-> System.out.print(str+"->"));


        //  stream2 = ()->Stream.of("I","Love","You","too");
        System.out.println();
        //map method
        stream2.get().map(s -> s.toUpperCase()).forEach(s -> System.out.println(s));

        Stream<List<Integer>> stream3 = Stream.of(Arrays.asList(1,2), Arrays.asList(3, 4, 5));

        //flatMap -
        // joins the list of integers and stream the list
        stream3.flatMap(list2 -> list2.stream())
                .forEach(i -> System.out.println(i));


        //reduce method
        //Need: Find the longest word from a group of words . The meaning of "big" here is "long".
        Stream<String>  streamObj =Stream.of("I","Love","You","too");
        Optional<String> longest = streamObj.reduce((s1,s2)->s1.length()>=s2.length()?s1:s2);
        System.out.println(longest.get());//Love

//        Requirements: Find the sum of the length of a group of words .
//        This is a "summation" operation, the input type of the operation object is String , and the result type is Integer .
        Stream<String>  streamObj2 =Stream.of("I","Love","You","too");

        Integer lengthSum = streamObj2.reduce(0,(sum,str)->sum+str.length(),(a,b)->a+b);
//        Integer usingMapLengthSum= streamObj2.mapToInt(str->str.length()).sum();
        System.out.println(lengthSum);//11

//        The ultimate weapon collect ()

        Stream<String>  streamObj3 =Stream.of("I","Love","You","too");
//        List<String > listStream = streamObj3.collect(Collectors.toList());
//        System.out.println(listStream);//[I, Love, You, too]
//        Set<String> set = streamObj3.collect(Collectors.toSet());
//        System.out.println(set);
            Map<String,Integer> mapStream=streamObj3.collect(Collectors.toMap(Function.identity(),String::length));
        System.out.println(mapStream);//{too=3, Love=4, I=1, You=3}

//        Static and default methods of the interface
//        Function.identity() it return the type of input  static method identity


        //collectors.toMap() more example
        List<Book> bookList = new ArrayList<>();
        bookList.add(new Book("The Fellowship of the Ring", 1954, "0395489318"));
        bookList.add(new Book("The Two Towers", 1954, "0345339711"));
        bookList.add(new Book("The Return of the King", 1955, "0618129111"));
        System.out.println(Book.listToMap(bookList));

//        Collectors.partitioningBy()

        Stream<Integer> s =Stream.of(1,2,3,4,5,6,7,8,9,10);
        Map<Boolean,List<Integer>> mapData1=s.collect(Collectors.partitioningBy(num ->num > 3));
        System.out.println("Elements in map after partitioning "+mapData1);

//        Collectors.groupingBy()

        List<String> g=Arrays.asList("Mathan","kumar","Mathan");
        Map<String,Long> mapData2 = g.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println("After grouping result "+mapData2);
    }
}


