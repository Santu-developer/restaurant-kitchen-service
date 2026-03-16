package com.restaurant.kitchenservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class RestaurantKitchenServiceApplication {

	public static void main(String[] args) {

        SpringApplication.run(RestaurantKitchenServiceApplication.class, args);
        System.out.println("Jay Shree Ram - 8");
    }

}
