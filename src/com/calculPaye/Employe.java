package com.calculPaye;

public class Employe {
    private String nom;
    private double salaire; //par heure
    private int tempsTravaille;

    public Employe(String nom, double salaire, int tempsTravaille) {
        this.nom = nom;
        this.salaire = salaire;
        this.tempsTravaille = tempsTravaille;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public double getSalaire() {
        return salaire;
    }

    public void setSalaire(double salaire) {
        this.salaire = salaire;
    }

    public int getTempsTravaille() {
        return tempsTravaille;
    }

    public void setTempsTravaille(int tempsTravaille) {
        this.tempsTravaille = tempsTravaille;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("-");
        sb.append(nom);
        sb.append(", salaire horaire : ").append(getSalaire());
        sb.append("; heures travaillés : ").append(getTempsTravaille());
        return sb.toString();
    }
}
