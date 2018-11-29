package com.gravite;

import java.util.ArrayList;

//Exercice 1.1
public class Bonjour {
    private int lineNumber = 1;

    public Bonjour(){}

    public void printNames(ArrayList<String> names){
        for(String name : names){
            System.out.println(lineNumber + " Bonjour " + name + " !");
            this.lineNumber++;
        }
    }
}
