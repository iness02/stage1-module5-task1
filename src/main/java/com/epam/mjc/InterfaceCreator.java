package com.epam.mjc;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class InterfaceCreator {

    public Predicate<List<String>> isValuesStartWithUpperCase() {
        // throw new UnsupportedOperationException("You should implement this method.");
        return list -> list.stream()
                .allMatch(s -> Character.isUpperCase(s.charAt(0)));

    }

    public Consumer<List<Integer>> addEvenValuesAtTheEnd() {
        //throw new UnsupportedOperationException("You should implement this method.");
        return list -> list.addAll(list.stream().filter(x -> x % 2 == 0)
                .collect(Collectors.toList()));
    }

    public Supplier<List<String>> filterCollection(List<String> values) {
        //throw new UnsupportedOperationException("You should implement this method.");

            return () -> values.stream().filter(s -> Character.isUpperCase(s.charAt(0)))
                    .filter(s -> s.endsWith("."))
                    .filter(s -> s.split(" ").length > 3)
                    .collect(Collectors.toList());

    }

    public Function<List<String>, Map<String, Integer>> stringSize() {
       // throw new UnsupportedOperationException("You should implement this method.");
        return list -> list.stream()
                .collect(Collectors.toMap(s -> s, String::length));


    }

    public BiFunction<List<Integer>, List<Integer>, List<Integer>> concatList() {
        //throw new UnsupportedOperationException("You should implement this method.");
        return (list1, list2) -> Stream.concat(list1.stream(), list2.stream())
                .collect(Collectors.toList());
    }
}
