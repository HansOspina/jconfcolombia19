package com.hansospina.samples.coffeeshop;

import com.hansospina.samples.coffeeshop.coffee.Coffee;
import com.hansospina.samples.coffeeshop.coffee.CoffeeService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import static org.springframework.http.HttpMethod.GET;
import static org.springframework.http.ResponseEntity.ok;


/**
 * @author <a href="mailto:hansospina@gmail.com">Hans Ospina</a>
 */
@SpringBootApplication
public class CoffeeShopApplication {

  public static void main(String[] args) {
    SpringApplication.run(CoffeeShopApplication.class, args);
  }

}
