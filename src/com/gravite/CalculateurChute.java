package com.gravite;

//Exercice 1.2
public class CalculateurChute {
    private double tempsChute;
    private double gravite = -9.81;
    private double positionInitiale = 0;
    private double vitesseInitiale = 0;


    public CalculateurChute(double tempsChute) {
        this.tempsChute = tempsChute;
    }

    public double getTempsChute() {
        return tempsChute;
    }

    public void setTempsChute(double tempsChute) {
        this.tempsChute = tempsChute;
    }

    public double getGravite() {
        return gravite;
    }

    public void setGravite(double gravite) {
        this.gravite = gravite;
    }
    public CalculateurChute(double tempsChute, double gravite) {
         this(tempsChute);
         this.gravite = gravite;
    }

    public double positionApresChute(double vitesseInitiale, double positonInitiale) {
        return 0.5*(gravite*(tempsChute*tempsChute))+(vitesseInitiale*tempsChute)+positonInitiale;
    }

    public double getPositionInitiale() {
        return positionInitiale;
    }

    public void setPositionInitiale(double positionInitiale) {
        this.positionInitiale = positionInitiale;
    }

    public double getVitesseInitiale() {
        return vitesseInitiale;
    }

    public void setVitesseInitiale(double vitesseInitiale) {
        this.vitesseInitiale = vitesseInitiale;
    }
}
