package com.my.store.Repository;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

import java.util.HashSet;
import java.util.Set;

@Component
@SessionScope
public class Basket {
    private final Set<Integer> item;


    public Basket(int item) {
        this.item = new HashSet<>(item);
    }

    public Set<Integer> getItems() {
        return item;
    }

    public void addId(int item) {
        this.item.add(item);
    }
}
