/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.tp2_bieres_boniol;

/**
 *
 * @author Benjamin
 */
public class TP2_Bieres_BONIOL {

    public static void main(String[] args) {
        //BouteilleBiere uneBiere = new BouteilleBiere() ; 
        //Création d'un objet uneBiere
        //uneBiere.nom = "Cuvée des trolls";
        //uneBiere.degreAlcool = 7.0 ;
        //attribution de valeurs
        //uneBiere.lireEtiquette();
        //BouteilleBiere autreBiere = new BouteilleBiere();
        //autreBiere.nom = "Leffe";
        //autreBiere.degreAlcool = 6.6;
        //autreBiere.brasserie="Abbaye de Leffe";
        BouteilleBiere uneBiere = new BouteilleBiere("Cuvée des trolls", 7.0, "Dubuisson");
        //Création d'un objet uneBière et attribution de valeurs a ce dernier
        BouteilleBiere autreBiere = new BouteilleBiere("Leffe", 6.6, "Abbaye de Leffe");
        BouteilleBiere premiereBiere = new BouteilleBiere("1664", 5.5, "Le Canon");
        premiereBiere.lireEtiquette();
        //Permet d'afficher les valeurs de premiereBiere
        BouteilleBiere secondeBiere = new BouteilleBiere("Pelforth", 5.8, "Brasserie du Pélican");
        secondeBiere.lireEtiquette();
        BouteilleBiere troisiemeBiere = new BouteilleBiere("8.6", 7.9, "Royal Swinkels");
        troisiemeBiere.lireEtiquette();
        System.out.println(autreBiere);
        //Autre méthode pour afficher autreBiere
    }
}
