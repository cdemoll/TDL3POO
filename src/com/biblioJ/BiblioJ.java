package com.biblioJ;

import javax.print.attribute.standard.Media;

public class BiblioJ {

    public void main() {
        Bibliothèque biblio = new Bibliothèque();

        biblio.abonnes.add(new Abonne("Jacques", "32 rue de la Bastille"));
        biblio.abonnes.add(new Abonne("Pedro", "2bis sentier de la Paix"));
        biblio.abonnes.add(new Abonne("Marine", "17 boulevard Haussman"));
        biblio.abonnes.add(new Abonne("Mireille", "71 impasse de la Croix"));

        biblio.ouvrages.add(new Ouvrage("Fondations : l'Empire", 1996, Ouvrage.SupportMedia.papier));
        biblio.ouvrages.add(new Ouvrage("Un chemin, une vie", 2013, Ouvrage.SupportMedia.DVD));
        biblio.ouvrages.add(new Ouvrage("La tartes aux pommes : La recette", 2004, Ouvrage.SupportMedia.cléUSB));
        biblio.ouvrages.add(new Ouvrage("The missing stranger", 1978, Ouvrage.SupportMedia.DVD));
        biblio.ouvrages.add(new Ouvrage("Gérer le stress en 3 étapes simples", 2018, Ouvrage.SupportMedia.papier));
        biblio.ouvrages.add(new Ouvrage("GitHub pour les nuls", 2016, Ouvrage.SupportMedia.cléUSB));
    }

    //TODO
    //Faire les scénarios d'emprunts, de réservations et de restitutions
    public void afficherOuvragesDisponibles() {

    }

    public void infosouvragesDisponibles() {

    }

    public void afficherAbonnesActifs() {

    }

    public void afficherAbonnesPassifs() {

    }

    public void afficherAbonnes() {

    }
}
