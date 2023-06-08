package com.example.tpnote_java;

public class Pizza {
    private int id;
    private String nom;
    private int prix;
    private int nb_ing;




    public Pizza(String nom, int prix, int nb_ing) {
            this.nom = nom;
            this.prix = prix;
            this.nb_ing = nb_ing;
        }



    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPrix() {
        return prix;
    }

    public void setPrix(int prix) {
        this.prix = prix;
    }

    public int getNb_ing() {
        return nb_ing;
    }

    public void setNb_ing(int nb_ing) {
        this.nb_ing = nb_ing;
    }
}
