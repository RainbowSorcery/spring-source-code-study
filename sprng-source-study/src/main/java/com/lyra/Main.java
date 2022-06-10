package com.lyra;

import com.lyra.config.ApplicationScan;
import com.lyra.config.ApplicationScans;
import com.lyra.service.OrderService;
import com.lyra.service.User;
import com.lyra.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(ApplicationScan.class);


        User bean1 = applicationContext.getBean(User.class);
    }
}
