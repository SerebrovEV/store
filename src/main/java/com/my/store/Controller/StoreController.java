package com.my.store.Controller;

import com.my.store.Service.StoreService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Set;

@RestController
@RequestMapping("/oder")
public class StoreController {
    private final StoreService storeService;


   public StoreController(StoreService storeService) {
        this.storeService = storeService;
    }
    @GetMapping("/add")
    public void addItems(@RequestParam("item") Integer item) {
        storeService.addItems(item);
    }

    @GetMapping("/get")
    public Set<Integer> getItems() {
        return storeService.getItems();
    }
}
