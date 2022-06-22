package com.eliseemulenga;

public class Ligne {

    private int numero;
    private int quantite;
    Produit produit;

    public Ligne(int numero, int quantite, Produit produit) {
        this.numero = numero;
        this.quantite = quantite;
        this.produit = produit;
    }

    public static Double getPrixTotal(){
        return this.produit.getPrix()*this.quantite;
    }

    public int getNumero() {
        return numero;
    }

    public int getQuantite() {
        return quantite;
    }

    public Produit getProduit() {
        return produit;
    }

    public double getPrixTotal(){

    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }

    public void setProduit(Produit produit) {
        this.produit = produit;
    }
}


