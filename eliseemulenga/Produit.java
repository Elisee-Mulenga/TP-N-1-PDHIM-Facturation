package com.eliseemulenga;

import java.util.Date;

public class Produit <T> {
    private String code;
    private String designation;
    private double prix;
    private T uniteMesure;
    private Date dateExpiration;

    public Produit(String code, String designation, double prix, T uniteMesure, Date dateExpiration) {
        this.code = code;
        this.designation = designation;
        this.prix = prix;
        this.uniteMesure = uniteMesure;
        this.dateExpiration = dateExpiration;
    }

    public String getCode() {
        return code;
    }

    public String getDesignation() {
        return designation;
    }

    public double getPrix() {
        return prix;
    }

    public T getUniteMesure() {
        return uniteMesure;
    }

    public Date getDateExpiration() {
        return dateExpiration;
    }
}
