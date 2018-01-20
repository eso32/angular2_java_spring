package io.javabrains.hello;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Greeting {

    @Id
    private String name;
    private int hour;


    public Greeting(String name, int hour) {
        this.name = name;
        this.hour = hour;
    }
}
