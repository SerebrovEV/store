package com.my.store.Repository;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ItemConfiguration {
    @Bean
    public int item() {
        return 0;
    }
}
