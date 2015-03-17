package com.conrad.sandbox;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Function;
import java.util.stream.Stream;

/**
 * Hello world!
 */
public class App {
    public void method() {
        forEachMethod();
        filterMethod();
        flatMap();
    }

    private void forEachMethod() {
        List<Foo> foos = createFoos();

        Stream<Foo> stream = foos.stream();

        stream.forEach(f -> System.out.println(f.getItem()));
    }

    private List<Foo> createFoos() {
        Random r = new Random();
        int Low = 3;
        int High = 10;

        List<Foo> foos = new ArrayList<>();

        for (int x = 0; x <= 10; x++) {
            Foo foo = new Foo("Foo" + x, x);
            foos.add(foo);
            int rndInt = r.nextInt(High - Low) + Low;
            for (int y = 0; y <= 3; y++) {
                Bar bar = new Bar(y, "Bar " + rndInt);
                foo.addBar(bar);

            }

        }
        return foos;
    }

    private void filterMethod() {
        List<Foo> foos = createFoos();

        Stream<Foo> stream = foos.stream();

        Stream<Foo> filtered = stream.filter(f -> f.getNum() % 2 == 0);
        List<Foo> result = new ArrayList<>();

        filtered.forEach(result::add);

        result.stream().forEach(System.out::println);

    }

    private void flatMap() {

        Stream<String> stream = createFoos().stream().flatMap(l -> l.listBars().stream().map(b -> b.toString()));

        stream.forEach(System.out::println);

    }
}
