package com.biblioJ;

public class Ouvrage {
    private String titre;
    public enum SupportMedia {papier, CD, DVD, cléUSB};
    private SupportMedia media;
    private int anneeEdition;
    private boolean dispo;
    private boolean estReserve;
    private Abonne emprunteur;

    public Ouvrage(String titre, int anneeEdition, SupportMedia media) {
        this.titre = titre;
        this.anneeEdition = anneeEdition;
        this.media = media;
        this.dispo = true;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public int getAnneeEdition() {
        return anneeEdition;
    }

    public void setAnneeEdition(int anneeEdition) {
        this.anneeEdition = anneeEdition;
    }

    public boolean isDispo() {
        return dispo;
    }

    public void setDispo(boolean dispo) {
        this.dispo = dispo;
    }

    public boolean isEstReserve() {
        return estReserve;
    }

    public void setEstReserve(boolean estReserve) {
        this.estReserve = estReserve;
    }

    public Abonne getEmprunteur() {
        return emprunteur;
    }

    public void setEmprunteur(Abonne emprunteur) {
        this.emprunteur = emprunteur;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Ouvrage{");
        sb.append("titre='").append(titre).append('\'');
        sb.append(", anneeEdition=").append(anneeEdition);
        sb.append(", dispo=").append(dispo);
        sb.append(", estReserve=").append(estReserve);
        sb.append(", emprunteur=").append(emprunteur);
        sb.append('}');
        return sb.toString();
    }
}
