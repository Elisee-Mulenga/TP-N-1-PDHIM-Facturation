package com.eliseemulenga;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

/**
  MULENGA MULAPU Elisée GL
  MBOKUMA LOMBA Fabien Gl 
  SANGWA MAYOMBA Fabrice GL
  NDJIBU KITENGE Vasthy MSI
  MPOYO KABEYA Cynthia MSI
  MBOMBO KATEMBWE Urcilla GL
  TSHIPAMBA BULAMBA Michael MSI
 */


public class Main {

    public static void main(String[] args) {
       Produit <String>produit1 = new Produit("0001","chemise",5,"euro",new Date());


        Adresse adresse1 =new Adresse("karavia","10a","5v","rwashi","lubumbashi","kolwezi","angola");
        Client client1 = new Client(adresse1,"mulenga","hank","009");

        List<Ligne> lignesfacture1 = new ArrayList();
        lignesfacture1.add(new Ligne(1,produit1,3));

        Detail detailFacture1 = new Detail(lignesfacture1);

        Facture facture = new Facture(1,client1,detailFacture1);
    }
}
