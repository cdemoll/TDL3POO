package com.calculPaye;

import java.util.ArrayList;

public class EntrepriseJ {
    ArrayList<Employe> employes = new ArrayList<>();

    public void main() throws IllegalArgumentException, Exception {
        employes.add(new Employe("John", 7.5, 35));
        employes.add(new Employe("Cécile", 8.2, 47));
        employes.add(new Employe("Pierre", 10, 73));
        employes.add(new Employe("Laurent", 25, 60));
        employes.add(new Employe("Laurent", 14, 45));

        for(Employe employe : employes) {
            System.out.println(getSalaireHebdo(employe));
        }
    }

    private double getSalaireHebdo(Employe employe) throws IllegalArgumentException {
        if(employe.getTempsTravaille() > 60 || employe.getSalaire() < 13) {
            throw new IllegalArgumentException("Les conditions de travails de certains de vos employés sont inhumaines!");
        }

        int salaireHebdo = 0;
        int tmpTravaille =  employe.getTempsTravaille();

        while(tmpTravaille != 0) {
            while(tmpTravaille > 40) {
                salaireHebdo += employe.getSalaire();
                tmpTravaille--;
            }
            salaireHebdo += employe.getSalaire();

            tmpTravaille--;
        }


        return salaireHebdo;
    }
}
