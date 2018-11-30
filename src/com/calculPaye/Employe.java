package com.calculPaye;

public class Employe {
    private String nom;
    private int salaire; //par heure
    private int tempsTravaille;

    public Employe(String nom, int salaire, int tempsTravaille) {
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

    public int getSalaire() {
        return salaire;
    }

    public void setSalaire(int salaire) {
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
