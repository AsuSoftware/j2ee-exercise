package com.esercizi.j2ee.LambdaExpressionEFunctionalInterface.esercizio;

public class User {

    private String nome;
    private String cognome;
    private int anni;

    public User(String nome, String cognome, int anni) {
        this.nome = nome;
        this.cognome = cognome;
        this.anni = anni;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public int getAnni() {
        return anni;
    }

    public void setAnni(int anni) {
        this.anni = anni;
    }
}
