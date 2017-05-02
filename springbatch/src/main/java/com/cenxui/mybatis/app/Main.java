package com.cenxui.mybatis.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by cenxui on 4/25/17.
 */
class Main {

    public static void main(String... args) {
        final ApplicationContext context = new ClassPathXmlApplicationContext("classpath:context.xml");
        final App app = (App) context.getBean("app");

        System.out.println(app.getShop());

    }
}
