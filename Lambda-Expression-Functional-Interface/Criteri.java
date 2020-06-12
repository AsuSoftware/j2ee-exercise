package com.esercizi.j2ee.LambdaExpressionEFunctionalInterface.esercizio;


import java.util.ArrayList;
import java.util.List;
import java.util.function.*;

/*
 * In this class we put the Functional Interface for the main program
 */

public class Criteri {

    // Metodo getUser implementato con l'interfaccia Predicate, che da true o false come risultato
    public List<User> getUsers(List<User> users, Predicate<User> condizione) {
        List<User> utenti = new ArrayList<>();

        for (User u: users) {
            if (condizione.test(u)) {
                utenti.add(u);
            }
        }
        return utenti;
    }

    // Metodo printUser che permette di eseguiire una condizione lambda senza restituire un valore(interfaccia Consumer)
    public void printUser(List<User> users, Consumer<User> condizione) {
        for (User u: users) {
            condizione.accept(u);
        }
    }

    // Metodo stampaUtenti che fa uso dell'interfaccia Supplier, e il contrario di Consumer, non ha parametro,
    // ma ritorna un valore
    public int stampaUtenti(Supplier<User> u) {

        return u.get().getAnni();
    }

    // Metodo calcolaRadice usando l'interfaccia Function, che prende in ingresso un argomento, e produce un risultato
    public Double calcolaRadice(Double operando, Function<Double, Double> condizione) {
        return condizione.apply(operando);
    }

    // Metodo operazione usando l'interfaccia UnaryOperator che prende in ingresso una operazione su
    // un operando che produce un risultato dello
    // stesso tipo dell'operando(e un numero,oppure una stringa, questo vol dire operando = valore)
    public int operazione(int a, UnaryOperator<Integer> condizione) {
        return condizione.apply(a);
    }

    // Metodo operations usando l'interfaccia BinaryOperator che permette di eseguire una
    // condizione definita dalla lambda expression sui 2 elementi e ritornare un valore
    public Double operations(Double a, Double b, BinaryOperator<Double> condizione) {
        return condizione.apply(a, b); // esegue l'operazione
    }

}
