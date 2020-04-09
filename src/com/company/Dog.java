package com.company;

import java.util.ArrayList;
import java.util.List;

public class Dog implements Guard{
    private String name;
    private House house;

    public Dog(String name,House house){
        this.name=name;
        this.house=house;
    }
    public void checkG(Guest guest, List<Guest> names) {
        guest.knock();
        if(names.contains(guest)){
            System.out.println("It's yours house ");
            System.out.println("Welcome ");
        }
        else{
            System.out.println("It's not his house ");
            if(house.check()){
                System.out.println("Doors are open");
                stopG(guest.getName());
            }
            else{
                System.out.println("Doors are closed");
                alarmG();
            }
        }


    }

    public void alarmG() {
        System.out.println("Dog " + this.name + " barks loudly \n ");
    }

    public void stopG(String name) {
        System.out.println("dog named " + this.name + " tried to bite " + name + "\n");
    }

    @Override
    public String toString() {
        return  name ;
    }
}
