package com.salleCinema;

//Exercice 2
public class SalleCinema {
    private String film;
    private int nbPlaces;
    private int tarif;
    private int nbPlacesVendues;

    public SalleCinema(String film, int capacite, int tarif) {
        this.film = film;
        this.nbPlaces = capacite;
        this.tarif = tarif;
    }

    //On choisit de mettre à jour les données en temps réels
    public void vendrePlace() {
        nbPlaces--;
        nbPlacesVendues++;
    }

    public double tauxRemplissage() {
        return (double)(nbPlacesVendues*100)/nbPlaces;
    }

    public double chiffreAffaires() {
        return tarif*nbPlacesVendues;
    }

    public void estPleine() {
        if(nbPlaces == nbPlacesVendues) {
            System.out.println("La salle est pleine.");
        }
        else {
            System.out.println("La salle n'est pas pleine.");
        }
    }

    public String nbPlacesDisponibles() {
        return String.valueOf(nbPlaces-nbPlacesVendues);
    }

    public String getFilm() {
        return film;
    }

    public void setFilm(String film) {
        this.film = film;
    }

    public int getNbPlaces() {
        return nbPlaces;
    }

    public void setNbPlaces(int nbPlaces) {
        this.nbPlaces = nbPlaces;
    }

    public int getTarif() {
        return tarif;
    }

    public void setTarif(int tarif) {
        this.tarif = tarif;
    }

    public int getNbPlacesVendues() {
        return nbPlacesVendues;
    }

    public void setNbPlacesVendues(int nbPlacesVendues) {
        this.nbPlacesVendues = nbPlacesVendues;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("Film projete     : ").append(getFilm());
        sb.append("\nTarif            : ").append(getTarif());
        sb.append("\nNombre de places : ").append(nbPlacesDisponibles());
        sb.append("\nTaux remplissage : ").append(tauxRemplissage());
        sb.append("\nChiffreAffaires  : ").append(chiffreAffaires());
        return sb.toString();
    }
}
