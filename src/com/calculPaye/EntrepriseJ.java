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

            for (Employe employe : employes) {
                if(getSalaireHebdo(employe) == 0) {
                    System.out.println("Les conditions de travails d'un de vos employés sont inhumaines!");
                    continue;
                }
                System.out.println(employe + "; Salaire hebdomadaires : " + getSalaireHebdo(employe) +
                        ";");
            }
    }

    private double getSalaireHebdo(Employe employe) {
        if(employe.getTempsTravaille() > 60 || employe.getSalaire() < 13) {
            return 0;
        }

        int salaireHebdo = 0;
        int tmpTravaille =  employe.getTempsTravaille();

        while(tmpTravaille != 0) {
            while(tmpTravaille > 40) {
                salaireHebdo += employe.getSalaire()*1.5;
                tmpTravaille--;
            }
            salaireHebdo += employe.getSalaire();

            tmpTravaille--;
        }

        return salaireHebdo;
    }
}
