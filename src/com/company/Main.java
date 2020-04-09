package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        //Dog dog1 = new Dog("Harley", redHouse);
        //Dog dog2 = new Dog("Cooper", greenHouse);

        //Dog dog4 = new Dog("Lucy", blueHouse);

        //Guest guest1 = new Guest();
        //Guest guest2 = new Guest();
        //Guest guest3 = new Guest();
        //Guest guest4 = new Guest();

        //redHouse.setOwner(guest1);
        //greenHouse.setOwner(guest2);
        //yellowHouse.setOwner(guest4);
        //blueHouse.setOwner(guest3);

       // guest1.setName("Henry");
        //dog1.checkG(guest1);

        //guest2.setName("John");
        //dog4.checkG(guest2);

       //guest3.setName("Ronald");
        //dog2.checkG(guest3);

        //guest4.setName("Mark");

        boolean bool = true;
        while (bool){
            System.out.println("Chose the house \n ");
            Scanner in = new Scanner(System.in);
            System.out.print("1. Red House \n2. Green House \n3. Yellow House \n4. Blue House \n5. Exit \n>> ");
            int choseHouse = in.nextInt();

            switch (choseHouse) {
                case 1:
                    System.out.println("you picked Red House");
                    House redHouse = new House();
                    redHouse.setDoorOpened();
                    redHouse.choseAction(redHouse);

                    break;
                case 2:
                    System.out.println("you picked Green House");
                    House greenHouse = new House();
                    greenHouse.setDoorOpened();
                    greenHouse.choseAction(greenHouse);
                    break;
                case 3:
                    System.out.println("you picked Yellow House");
                    House yellowHouse = new House();
                    yellowHouse.setDoorOpened();
                    yellowHouse.choseAction(yellowHouse);
                    break;
                case 4:
                    System.out.println("you picked Blue House");
                    House blueHouse = new House();
                    blueHouse.setDoorOpened();
                    blueHouse.choseAction(blueHouse);
                    break;
                case 5:
                    bool = false;
                    break;
                default:
                    System.out.println("Wrong number");
                    break;
            }

        }
    }
}
