package com.eliseemulenga;

public abstract class DocumentCommenrcial {
    private long numero;
    Client client;
    Detail detail;

    public DocumentCommenrcial(long numero, Client client, Detail detail) {
        this.numero = numero;
        this.client = client;
        this.detail = detail;
    }

    public long getNumero() {
        return numero;
    }

    public Client getClient() {
        return client;
    }

    public Detail getDetail() {
        return detail;
    }

    public abstract double getTotal();
    public abstract double getTVA();
}
