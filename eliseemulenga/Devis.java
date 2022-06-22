package com.eliseemulenga;

public class Devis extends DocumentCommenrcial{
    public Devis(long numero, Client client, Detail detail) {
        super(numero, client, detail);
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
