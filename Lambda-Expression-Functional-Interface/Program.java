package com.esercizi.j2ee.LambdaExpressionEFunctionalInterface.esercizio;


import java.util.ArrayList;
import java.util.List;

/*
 * In this exercise we use the lambda expressions with the Functional Interface
 */

public class Program {
    public static void main(String[] args) {

        List<User> utenti = new ArrayList<User>();

        utenti.add(new User("Andreea", "Bia", 18));
        utenti.add(new User("Antonio", "Asu", 20));
        utenti.add(new User("Jason", "Kylon", 25));
        utenti.add(new User("Mike", "Lower", 12));

        Criteri criteri = new Criteri();

        List<User> users = criteri.getUsers(utenti, user -> user.getNome().equals("Antonio"));

        System.out.println("Ricerca utenti con nome specifico usando Predicate");
        for (User u: users) {
            System.out.println(u.getNome() + " " + u.getCognome() + " " + u.getAnni());
        }

        System.out.println("-----------------------");
        System.out.println("Stampa valori usando Consumer");
        criteri.printUser(utenti, u -> System.out.println("Nome: " + u.getNome() + " è cognome: "
                + u.getCognome() + " anni: " + u.getAnni()));

        System.out.println("-----------------------");
        System.out.println("Stampa anni usando Supplier");
        for (User u: utenti) {
            System.out.println(criteri.stampaUtenti(() -> u));
        }

        System.out.println("-----------------------");
        System.out.println("Stampa la radice usando Function");
        System.out.println(criteri.calcolaRadice(25.10, val -> (double) Math.round(Math.sqrt(val))));

        System.out.println("-----------------------");
        System.out.println("Stampa la moltiplicazione usando UnaryOperator");
        System.out.println(criteri.operazione(3, a -> a * a));

        System.out.println("-----------------------");
        System.out.println("Operazioni su numeri usando Binary Operator");
        Double result = criteri.operations(3.5,6.3, (a, b) -> a * b);
        System.out.println(result);
    }
}
