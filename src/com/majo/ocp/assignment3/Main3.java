package com.majo.ocp.assignment3;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Main3 {

    public static void main(String[] args) {


        //1
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        System.out.println(list.stream().count());

        //2
        System.out.println((Stream.generate(Math::random).count()));
        System.out.println(Stream.iterate(0, n -> n + 1).count());
    }
}
