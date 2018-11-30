package com.calculPaye;

public class Employe {
    private String nom;
    private int salaire; //par heure
    private int tempsTravaillé;

    public Employe(String nom, int salaire, int tempsTravaillé) {
        this.nom = nom;
        this.salaire = salaire;
        this.tempsTravaillé = tempsTravaillé;
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

    public int getTempsTravaillé() {
        return tempsTravaillé;
    }

    public void setTempsTravaillé(int tempsTravaillé) {
        this.tempsTravaillé = tempsTravaillé;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("-");
        sb.append(nom);
        sb.append(", salaire horaire : ").append(getSalaire());
        sb.append("; heures travaillés : ").append(getTempsTravaillé());
        return sb.toString();
    }
}
