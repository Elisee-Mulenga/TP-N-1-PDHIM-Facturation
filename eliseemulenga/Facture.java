package com.eliseemulenga;

public class Facture extends DocumentCommenrcial{
    public Facture(long numero, Client client, Detail detail) {
        super(numero,client,detail);
    }
    @Override
    public double getTotal(){
        double tot = 0;
        for (Ligne ligne:this.getDetail().ligne){
            tot=tot+ligne.getPrixTotal();
        }
        return tot;
    }
    @Override
    public double getTVA(){
        return this.getTotal()*16/100;
    }
}
