package se.lexicon.model;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //Scanner scanner = new Scanner(System.in);
        //int menuChoise = scanner.nextInt();

        Drinks coke = new Drinks("Coca-Cola", 1.99, "Coca cola, Price: 1,99", 1);
        Drinks fanta = new Drinks("Fanta Lemon", 1.99, "Fanta, Price: 1,99", 2);
        Snacks snickers = new Snacks("Snickers", 0.99, "Snickers, Price: 0,99", 3);
        Snacks chips = new Snacks("Doritos", 1.99, "Doritos, Price: 1,99", 4);

        System.out.println("Name: " + coke.getProductName());
        System.out.println("Price: " + fanta.getPrice());
        System.out.println("Id: " + snickers.getId());
        System.out.println("Summary: " + chips.getExamine());




    }







}
