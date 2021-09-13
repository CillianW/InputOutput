package com.weekOne;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    static Scanner sc;

    public static void main(String[] args) {

        //Part 1
        int age = getAge();
        System.out.println(age);

        System.out.println("****************");

        //Part 2
        age = getAge("Enter your age please: ");
        System.out.println(age);

        System.out.println("****************");

        //Part 3
        age = getAge("Cillian", "Please enter your age: ");
        System.out.println(age);

        System.out.println("****************");

        //Part 4
        int[] pensionAge = {47,67};

        for(int i = 0; i < 2; i++) {
            if (checkPension(pensionAge[i])) {
                System.out.println("You are " + pensionAge[i] + " and ARE eligible for pension");
            } else {
                System.out.println("You are " + pensionAge[i] + " and are NOT eligible for pension");
            }
        }

        System.out.println("****************");

        //Part 5
        String usersFullName = getName();
        System.out.println("Your full name is " + usersFullName + ".");

        System.out.println("****************");

        //Part 6
        String[] name = new String[2];
        getName(name);

        for(int i = 0; i < name.length; i++){
            System.out.println(name[i]);
        }

        System.out.println("****************");
    }

    public static int getAge(){
        System.out.print("Please enter your age: ");
        sc = new Scanner(System.in);
        int age = sc.nextInt();
        return age;
    }

    public static int getAge(String prompt){
        int age = 0;

        System.out.print(prompt);

        try {
            sc = new Scanner(System.in);
            age = sc.nextInt();
            return age;
        }
        catch (InputMismatchException e){
            e.printStackTrace();
            return age;
        }

    }

    public static int getAge(String name, String prompt){
        System.out.println("Hi " + name + ". " + prompt);

        sc = new Scanner(System.in);
        int age;

        if(sc.hasNextInt()){
            age = sc.nextInt();
        }
        else{
            age = -999;
            System.out.println("Error: Incorrect Input!");
        }
        return  age;
    }

    public static boolean checkPension(int age){
//        return age >= 65;

//        OR

//        if(age >= 65){
//            return true;
//        }
//        else{
//            return false;
//        }

//        OR

        return (age >= 65) ? true:false;
    }

    public static String getName(){
        System.out.print("Please enter your full name: ");

        sc = new Scanner(System.in);
        String name = sc.nextLine();
        return name;
    }

    public static void getName(String[] name){
        System.out.print("Please enter your full name: ");
        sc = new Scanner(System.in);

        for(int i = 0; i < name.length; i++){
            name[i] = sc.next();
        }
    }
}
