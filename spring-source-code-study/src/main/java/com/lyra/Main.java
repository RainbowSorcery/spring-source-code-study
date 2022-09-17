package com.lyra;

import com.lyra.config.ApplicationConfig;
import com.lyra.service.OrderService;
import com.lyra.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(ApplicationConfig.class);

        applicationContext.scan("com.lyra");

        UserService bean = applicationContext.getBean(UserService.class);
        bean.hello();

        OrderService orderService = (OrderService) applicationContext.getBean("orderService");
        orderService.test();

    }
}
