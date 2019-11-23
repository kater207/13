package com.company;
import java.util.Arrays;
import java.util.List;
public class Main {

    public static void main(String[] args) {
        uper();
        lover();
        sred();
    }

    public static void uper() {
        List<String> myList = Arrays.asList("cat", "dog", "mouse", "wolf", "giraffe");
        myList.stream()
                .map(String::toUpperCase)
                .forEach(System.out::println);
    }

    public static void lover() {
        List<String> myList = Arrays.asList("Cat", "dog", "mOuse", "wOLf", "tIgR", "GirafFe");
        myList.stream().filter(s -> s.length() == 4)
                .map(String::toLowerCase)
                .sorted()
                .forEach(System.out::println);
    }

    public static void sred() {
        List<Integer> myList = Arrays.asList(9, 1, 2, 8, 3);
        myList.stream()
                .mapToInt((s) -> Integer.parseInt(String.valueOf(s)))
                .average()
                .stream()
                .forEach(System.out::println);
    }
}
