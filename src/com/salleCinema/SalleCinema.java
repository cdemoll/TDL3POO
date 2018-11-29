package com.salleCinema;

public class SalleCinema {
    private String film;
    private int tarif;
    private int capacite;
    private int visiteurs;
    private double tauxRemplissage;
    private int chiffreAffaires;

    public SalleCinema(String film, int capacite, int tarif) {
        this.film = film;
        this.capacite = capacite;
        this.tarif = tarif;
    }

    //On choisit de mettre à jour les données en temps réels
    public void vendrePlace() {
        visiteurs++;
        chiffreAffaires += tarif;
        tauxRemplissage = (visiteurs*100)/capacite;
    }

    public void tauxRemplissage() {
        System.out.println("Taux de remplissage : " + tauxRemplissage);
    }

    public void chiffreAffaires() {
        System.out.println("Chiffre affaires : " + chiffreAffaires);
    }

    public void nbPlacesDisponibles() {
        System.out.println("Nombre de places disponibles : " + String.valueOf(capacite-visiteurs));
    }


    public String getFilm() {
        return film;
    }

    public void setFilm(String film) {
        this.film = film;
    }

    public int getTarif() {
        return tarif;
    }

    public void setTarif(int tarif) {
        this.tarif = tarif;
    }

    public int getCapacite() {
        return capacite;
    }

    public void setCapacite(int capacite) {
        this.capacite = capacite;
    }

    public double getTauxRemplissage() {
        return tauxRemplissage;
    }

    public void setTauxRemplissage(double tauxRemplissage) {
        this.tauxRemplissage = tauxRemplissage;
    }

    public int getChiffreAffaires() {
        return chiffreAffaires;
    }

    public void setChiffreAffaires(int chiffreAffaires) {
        this.chiffreAffaires = chiffreAffaires;
    }
}
