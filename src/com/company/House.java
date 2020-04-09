package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class House {

    private House name;
    private boolean doorStatus;
    public ArrayList<Guest> names = new ArrayList<>();
    public ArrayList<Guard> guards = new ArrayList<>();


    public boolean check() {

        return doorStatus;
    }


    public void setDoorOpened() {
        int a = (int) (Math.random() * 2);
        if (a == 1) {
            this.doorStatus = true;
        } else {
            this.doorStatus = false;
        }

    }


    public void choseAction(House name) {
        this.name = name;
        boolean bool = true;
        while (bool) {
            showOwnerList();
            showGuardList();
            System.out.println("\nChose number\n ");
            Scanner in = new Scanner(System.in);
            System.out.print("1. Visit house \n2. Add owner \n3. Delete owner \n4. Add guard \n5. Dell guard \n6. Exit \n>> ");
            int action = in.nextInt();

            switch (action) {
                case 1:
                    System.out.println("Visit house");
                    visitHouse();
                    break;
                case 2:
                    System.out.println("Add owner");
                    addOwner();
                    break;
                case 3:
                    System.out.println("Delete people");
                    dellOwner();
                    break;
                case 4:
                    System.out.println("Add guard");
                    addGuard(name);
                    break;
                case 5:
                    System.out.println("Delete guard");
                    dellGuard();
                    break;
                case 6:
                    System.out.println("Exit");
                    bool = false;
                    break;
            }
        }
    }

    public void visitHouse(){
        System.out.println("Visit house");
        System.out.println("Name \n ");
        Scanner in = new Scanner(System.in);
        String visitorName = in.nextLine();
        if (guards.size()==0){
            System.out.println("No guards here, welcome");
        }
        else {
            for (int i = 0; i < guards.size(); i++) {
                guards.get(i).checkG(new Guest(visitorName), names);
            }
        }
    }

    public void addOwner() {
        System.out.println("Name \n ");
        Scanner in = new Scanner(System.in);
        String newName = in.nextLine();
        names.add(new Guest(newName));
    }
    public void dellOwner(){
        showOwnerList();
        Scanner in = new Scanner(System.in);
        System.out.print("\nChose index\n>> ");
        int index = in.nextInt();
        if( index <= names.size())
        names.remove(index);
        else {
            System.out.println("wrong index");
        }
    }

    public void addGuard(House name) {
        System.out.println("Dog name:  \n ");
        Scanner in = new Scanner(System.in);
        String newName = in.nextLine();
        guards.add(new Dog(newName, name));
    }
    public void dellGuard() {
        showGuardList();
        Scanner in = new Scanner(System.in);
        System.out.print("\nChose index\n>> ");
        int index = in.nextInt();
        if (index <= guards.size())
            guards.remove(index);
        else {
            System.out.println("wrong index");
        }
    }

    public void showOwnerList() {
        System.out.println("Owners: " + names.toString());
    }
    public void showGuardList() { System.out.println("Guard: " + guards.toString());
    }



}