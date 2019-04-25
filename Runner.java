package edu.dmacc.codedsm.hw19;

import java.sql.SQLOutput;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class Runner {

    public static void main(String[] args) {

        Function<String,Integer> stringToInt = s ->s.length();
        System.out.println(stringToInt.apply("Pauline"));

        BiFunction<String,String,Integer>  stringsToInt = (s, s2) -> s.length() + s2.length();
        System.out.println(stringsToInt.apply("Sugar","Salt"));

        Consumer<String> useString = (s -> System.out.println(s) );
        useString.accept("Vanilacake");

        Supplier<String> makeString = () -> "Hello";
        System.out.println(makeString.get());
    }
}
