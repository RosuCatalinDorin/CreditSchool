package com.sda.szilard.homeExercises;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Scanner;

public class MaterialsAndCreditsImpl implements iMaterials {

    private String materialsName1;
    private String materialsName2;
    private String materialsName3;
    private String materialsName4;
    private String materialsName5;
    private String materialsName6;
    private String materialsName7;

    private int credits1;
    private int credits2;
    private int credits3;
    private int credits4;
    private int credits5;
    private int credits6;
    private int credits7;

    private int note1;
    private int note2;
    private int note3;
    private int note4;
    private int note5;
    private int note6;
    private int note7;


    public MaterialsAndCreditsImpl(String materialsName1, String materialsName2,
                                   String materialsName3, String materialsName4,
                                   String materialsName5, String materialsName6,
                                   String materialsName7,
                                   int credits1, int credits2, int credits3, int credits4,
                                   int credits5, int credits6, int credits7,
                                   int note1, int note2, int note3, int note4, int note5,
                                   int note6, int note7) {

        this.materialsName1 = materialsName1;
        this.materialsName2 = materialsName2;
        this.materialsName3 = materialsName3;
        this.materialsName4 = materialsName4;
        this.materialsName5 = materialsName5;
        this.materialsName6 = materialsName6;
        this.materialsName7 = materialsName7;
        this.credits1 = credits1;
        this.credits2 = credits2;
        this.credits3 = credits3;
        this.credits4 = credits4;
        this.credits5 = credits5;
        this.credits6 = credits6;
        this.credits7 = credits7;
        this.note1 = note1;
        this.note2 = note2;
        this.note3 = note3;
        this.note4 = note4;
        this.note5 = note5;
        this.note6 = note6;
        this.note7 = note7;
    }


    @Override
    public void materials1() {

        System.out.println(materialsName1 + " are " + credits1 + " CREDITE");

    }

    @Override
    public void materials2() {
        System.out.println(materialsName2 + " are " + credits2 + " CREDITE");


    }

    @Override
    public void materials3() {
        System.out.println(materialsName3 + " are " + credits3 + " CREDITE");

    }

    @Override
    public void materials4() {
        System.out.println(materialsName4 + " are " + credits4 + " CREDITE");
    }

    @Override
    public void materials5() {
        System.out.println(materialsName5 + " are " + credits5 + " CREDITE");

    }

    @Override
    public void materials6() {

        System.out.println(materialsName6 + " are " + credits6 + " CREDITE");

    }

    @Override
    public void materials7() {

        System.out.println(materialsName7 + " are " + credits7 + " CREDITE");

    }

    @Override
    public void calculateNoteAndCredits()  {

        Scanner scanner = new Scanner(System.in);
        System.out.println("\nScrie nota la Drept Civil: ");
        int dreptCivil;
        dreptCivil = scanner.nextInt();
        System.out.println("Scrie nota la Drept Consitutional: ");
        int dreptConstitutional;
        dreptConstitutional = scanner.nextInt();
        System.out.println("Scrie nota la Filosofie Juridica: ");
        int filosofieJuridica;
        filosofieJuridica = scanner.nextInt();
        System.out.println("Scrie nota la Logica Juridica: ");
        int logicaJuridica;
        logicaJuridica = scanner.nextInt();
        System.out.println("Scrie nota la Engleza: ");
        int engleza;
        engleza = scanner.nextInt();
        System.out.println("Scrie nota la Teoria Generala a Dreptului: ");
        int tgd;
        tgd = scanner.nextInt();
        System.out.println("Scrie nota la Drept Roman: ");
        int dreptRoman;
        dreptRoman = scanner.nextInt();

        float resultMaterialsAndCredit = ((dreptCivil * credits1) + ((dreptConstitutional * credits2) +
                ((filosofieJuridica * credits3) + ((logicaJuridica * credits4) + ((engleza * credits5) +
                        ((tgd * credits6) + ((dreptRoman * credits7))))))));
        int creditGathering = credits1 + credits2 + credits3 + credits4 + credits5 + credits6 + credits7;

        System.out.println("CREDITE TOTALE" + " = " + resultMaterialsAndCredit);
        System.out.println("Media finala" + " = " + resultMaterialsAndCredit / creditGathering);

}

}




