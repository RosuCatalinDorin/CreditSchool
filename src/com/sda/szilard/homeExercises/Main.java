package com.sda.szilard.homeExercises;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        iMaterials materials = new MaterialsAndCreditsImpl("\t\t\t\t\t\tDrept Civil",
                "\t\t\t\t\t\tDrept Constitutional",
                "\t\t\t\t\t\tFilosofie Juridica",
                "\t\t\t\t\t\tLogica Juridica",
                "\t\t\t\t\t\tEngleza",
                "\t\t\t\t\t\tTeoria Generala a Dreptului",
                "\t\t\t\t\t\tDrept Roman",
                6,6,3,3,2,6,5,
                8,9,6,5,7,5,8);
       materials.materials1();
       materials.materials2();
       materials.materials3();
       materials.materials4();
       materials.materials5();
       materials.materials6();
       materials.materials7();
       materials.calculateNoteAndCredits();


        }
}



