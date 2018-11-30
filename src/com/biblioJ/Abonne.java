package com.biblioJ;

import java.util.List;

public class Abonne {
    private String nom;
    private String adresse;
    private List<Ouvrage> ouvrages;
    private List<Ouvrage> emprunts;

    public Abonne(String nom, String adresse) {
        this.nom = nom;
        this.adresse = adresse;
    }
    public void addOuvrage(Ouvrage ouvrage) {
        this.ouvrages.add(ouvrage);
    }

    public void addEmprunt(Ouvrage ouvrage) {
        this.emprunts.add(ouvrage);
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public List<Ouvrage> getOuvrages() {
        return ouvrages;
    }

    public void setOuvrages(List<Ouvrage> ouvrages) {
        this.ouvrages = ouvrages;
    }

    public List<Ouvrage> getEmprunts() {
        return emprunts;
    }

    public void setEmprunts(List<Ouvrage> emprunts) {
        this.emprunts = emprunts;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Abonne{");
        sb.append("nom='").append(nom).append('\'');
        sb.append(", adresse='").append(adresse).append('\'');
        sb.append(", ouvrages=").append(ouvrages);
        sb.append(", emprunts=").append(emprunts);
        sb.append('}');
        return sb.toString();
    }
}
