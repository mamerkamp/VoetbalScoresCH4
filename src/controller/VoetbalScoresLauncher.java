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

        Scanner keyboard = new Scanner(System.in);

        Team[] teams = new Team[2];
        teams[0] = new Team ("Ajax");
        teams[1] = new Team ("PSV");

        Wedstrijd[] wedstrijden = new Wedstrijd[2];
        wedstrijden[0] = new Wedstrijd(teams[0], teams[1]);
        wedstrijden[1] = new Wedstrijd(teams[1], teams[0]);

        for (int i = 0; i < wedstrijden.length; i++) {
            System.out.printf("Geef de uitslag van de wedstrijd " + wedstrijden[i].getTeamThuis().getTeamNaam() +
                    " - " + wedstrijden[i].getTeamUit().getTeamNaam() + " de voordoelpunten: ");
            wedstrijden[i].setVoorDoelpunten(keyboard.nextInt());
            System.out.printf("Geef de uitslag van de wedstrijd " + wedstrijden[i].getTeamThuis().getTeamNaam() +
                    " - " + wedstrijden[i].getTeamUit().getTeamNaam() + " de tegendoelpunten: ");
            wedstrijden[i].setTegenDoelpunten(keyboard.nextInt());
        }

        for (int i = 0; i < wedstrijden.length; i++) {
            wedstrijden[i].printUitslag();
            wedstrijden[i].setWedstrijdPuntenThuisTeam();
            wedstrijden[i].setWedstrijdPuntenUitTeam();
            wedstrijden[i].setTotaalDoelpuntenTeams();
        }

        for (int i = 0; i < teams.length; i++) {
            teams[i].printStatusTeam();
        }
    }
}
