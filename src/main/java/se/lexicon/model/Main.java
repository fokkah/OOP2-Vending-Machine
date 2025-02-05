package se.lexicon.model;

public class Main {

    public static void main(String[] args) {

        Drinks coke = new Drinks("Coca-Cola", 1.99, 1);
        Drinks fanta = new Drinks("Fanta Lemon", 1.99, 2);


        System.out.println("Name: " + coke.getName());
        System.out.println("Price: " + coke.getPrice());
        System.out.println("Id: " + coke.getId());




    }







}
