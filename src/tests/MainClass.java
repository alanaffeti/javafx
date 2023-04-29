/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tests;

import entities.Mecanicien;
import services.Mecaniciencrud;




/**
 *
 * @author 21694
 */
public class MainClass {
  public static void main(String[] args){
//        


        Mecanicien m1 =new Mecanicien("ala","naffeti","07493284","naffetiala@gmail.com","53437283",1500,"ariana","gfdgfdgfdggfdg.img");
    Mecaniciencrud su=new Mecaniciencrud();     
//su.supprimer(1);
   System.out.println(su.afficher());
   
   
   
   
   
//   client_accident ac= new client_accident("ala","naffetiiii","144tu15555","gfdgfdgfdg","gdfgfdgfdgfd","gfdgfdgfdg","gfdgfdgfdgfg","rezrezrezr");
//
//Accidentcrud sa=new Accidentcrud();
// //sa.supprimer(24);
//System.out.println(sa.afficher());
//
//   meca_facture mf= new meca_facture("moteur",2,"moteur peugeot 205",2500,2800,2800);
//   //meca_facture mf2= new meca_facture("fnar",2,"fnar peugeot 205",280,300,600);
//   Facturecrud fc=new Facturecrud();
//
////fc.supprimer(5);
//System.out.println(fc.afficher());
      //fc.supprimer(4);
    
}
}
