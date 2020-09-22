package controller;

import model.Team;
import model.Wedstrijd;

import java.sql.SQLOutput;
import java.util.Scanner;

/**
 * Author: Mark Amerkamp (markamerkamp@gmail.com)
 * Veel plezier ermee!
 */
public class VoetbalScoresLauncher {

    public static void main(String[] args) {

//        Scanner keyboard = new Scanner(System.in);
//        System.out.print("Wat is de tegenstander?: ");
//        String naamTegenstander = keyboard.next();
//        System.out.print("Doelpunten gescoord?: ");
//        int doelpuntenVoor = keyboard.nextInt();
//        System.out.print("Doelpunten tegenstander?: ");
//        int doelpuntenTegen = keyboard.nextInt();
//
//        Wedstrijd tweedeWedstrijd = new Wedstrijd(naamTegenstander, doelpuntenVoor, doelpuntenTegen);
//        tweedeWedstrijd.printUitslag();
//        tweedeWedstrijd.printWedstrijdPunten();

        Team twente = new Team("Twente");
        Team ajax = new Team("Ajax");
        Wedstrijd wedstrijd = new Wedstrijd(twente, ajax, 5, 6);
        wedstrijd.printUitslag();
        System.out.println();
        wedstrijd.printWedstrijdPunten();



    }
}
