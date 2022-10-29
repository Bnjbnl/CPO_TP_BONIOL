/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tp2_bieres_boniol;

/**
 *
 * @author Benjamin
 */
public class BouteilleBiere {
//création d'une classe BouteilleBiere
    String nom;
    double degreAlcool;
    String brasserie;
    boolean ouverte;

    /**
     *Création d'une méthode pour lire les valeurs de l'objet
     */
    public void lireEtiquette() {
        System.out.println("Bouteille de " + nom + " (" + degreAlcool + " degres) \nBrasserie : " + brasserie);
    }
    
    /**
     * Création d'une méthode pour definir les valeurs de l'objet
     * @param unNom représente le nom de la bière
     * @param unDegre représente le degré d'alcool de la bière
     * @param uneBrasserie représente la brasserie de la bière
     */
    public BouteilleBiere(String unNom, double unDegre, String uneBrasserie) {
        nom = unNom;
        degreAlcool = unDegre;
        brasserie = uneBrasserie;
        ouverte = false;
    }

    /**
     *Création d'une méthode pour ouvrir une bière fermée
     * @return si la bière à été ouverte ou non sous forme de booleen
     */
    public boolean Décapsuler() {
        if (ouverte == false) {
            ouverte = true;
            return true;
        } else {
            System.out.println("erreur : biere déjà ouverte");
            return false;
        }
    }

    /**
     *Création d'une autre méthode d'affichage
     * @return une chaine qui va être affiché
     */
    @Override
    public String toString() {
        String chaine_a_retourner;
        chaine_a_retourner = nom + " (" + degreAlcool + " degrés) Ouverte ? ";
        if (ouverte == true) {
            chaine_a_retourner += "oui";
        } else {
            chaine_a_retourner += "non";
        }
        return chaine_a_retourner;
    }
}
