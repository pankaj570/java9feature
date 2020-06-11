package com.java9feature;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class TakeWhileAndDropWhile {
    public static void main(String[] args) {
        // TakeWhile : if condition is true then return the stream otherwise return the empty stream
        Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9).takeWhile(i -> i >= 5).forEach(System.out::println);

        // DropWhile : if condition is true then ignore the data otherwise it is taking the data.
        Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9).dropWhile(i -> i <= 5).forEach(System.out::println);

        //Iterate() : this is replacement of for loop
        IntStream.iterate(1, i -> i < 10, i -> i + 1)
                .filter(i -> i % 2 == 0)
                .forEach(System.out::println);

        //Returns a sequential Stream containing a single element, if non-null, otherwise returns an empty Stream.
        Stream.ofNullable(1).forEach(System.out::println);
        Stream.ofNullable(null).forEach(System.out::println);

    }
}
