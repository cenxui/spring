package com.cenxui.mybatis;

import org.springframework.context.annotation.Bean;

/**
 * Created by cenxui on 4/25/17.
 */
public class Shop {
    private String name = "KFC";
    private int age;
    private String description;
    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public int getAge() {
        return age;
    }


    public void setAge(int age) {
        this.age = age;
    }


    public String getDescription() {
        return description;
    }


    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return name;
    }
}
