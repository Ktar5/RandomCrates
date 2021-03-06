package com.minecave.randomchest.utils;

import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

/**
 * Created by carter on 5/15/2015.
 */
public class RandomCollection<E> {
    private final NavigableMap<Double, E> map = new TreeMap<>();
    private final ThreadLocalRandom random;
    private double total = 0;

    public RandomCollection(Random random) {
        this.random = RandomUtil.random();
    }

    public void add(double weight, E result) {
        if (weight <= 0) return;
        total += weight;
        map.put(total, result);
    }

    public List<E> values(){
        return new ArrayList<>(map.values());
    }

    public E next() {
        double value = random.nextDouble() * total;
        return map.ceilingEntry(value).getValue();
    }
}
