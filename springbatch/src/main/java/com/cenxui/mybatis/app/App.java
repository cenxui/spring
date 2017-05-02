package com.cenxui.mybatis.app;

import com.cenxui.mybatis.Customer;
import com.cenxui.mybatis.Shop;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by cenxui on 4/25/17.
 */
class App {
    @Autowired private Shop shop;
    @Autowired private Customer customer;

    @Autowired
    public App(final Customer customer, final Shop shop) {
        this.shop = shop;
        this.customer = customer;
    }

    public Shop getShop() {
        return shop;
    }
}
