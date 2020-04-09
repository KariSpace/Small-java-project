package com.company;

import java.util.ArrayList;

public class Guest {
    private String name;

    public Guest(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return  name ;
    }

    public void knock(){
        System.out.println(this.name+" trying to open the door" );
    }
}
