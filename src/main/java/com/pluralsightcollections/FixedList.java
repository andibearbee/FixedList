package com.pluralsightcollections;


import java.util.*;

public class FixedList <T> {
 protected List <T> items;
 protected int maxSize;


    public FixedList(int maxSize) {
        this.maxSize = maxSize;
        this.items = new ArrayList<>();
    }

    public void add(T item) {
        if (this.items.size() < maxSize) {
            this.items.add(item);
        }

    }


    public List<T> getItems() {
        return this.items;
    }
}
