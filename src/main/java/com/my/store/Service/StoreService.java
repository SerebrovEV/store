package com.my.store.Service;

import com.my.store.Repository.Basket;
import org.springframework.stereotype.Service;
import java.util.Set;

@Service
public class StoreService {
private final Basket basket;

    public StoreService(Basket basket) {
        this.basket = basket;
    }

    public void addItems(int item) {
        basket.addId(item);
    }

    public Set<Integer> getItems() {
        return basket.getItems();
    }

}
