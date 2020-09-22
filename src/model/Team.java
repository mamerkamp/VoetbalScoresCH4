package model;

/**
 * Author: Mark Amerkamp (markamerkamp@gmail.com)
 * Veel plezier ermee!
 */
public class Team {
    private String teamNaam;
    private int totaalWedstrijdPunten;
    private int totaalVoorDoelpunten;
    private int totaalTegenDoelpunten;

    public Team(String teamNaam, int totaalWedstrijdPunten, int totaalVoorDoelpunten, int totaalTegenDoelpunten) {
        this.teamNaam = teamNaam;
        this.totaalWedstrijdPunten = totaalWedstrijdPunten;
        this.totaalVoorDoelpunten = totaalVoorDoelpunten;
        this.totaalTegenDoelpunten = totaalTegenDoelpunten;
    }

    public Team(String teamNaam) {
        this(teamNaam, 0, 0, 0);
    }

    public Team() {
    }

    public int getDoelSaldo() {
        return totaalVoorDoelpunten - totaalTegenDoelpunten;
    }

    public void printStatusTeam() {
        System.out.println("Het team " + getTeamNaam() + " heeft " + totaalWedstrijdPunten + " wedstrijdpunt(en) en " +
                "een doelsaldo van " + getDoelSaldo());
    }

    public String getTeamNaam() {
        return teamNaam;
    }

    public void setTeamNaam(String teamNaam) {
        this.teamNaam = teamNaam;
    }

    public int getTotaalWedstrijdPunten() {
        return totaalWedstrijdPunten;
    }

    public void setTotaalWedstrijdPunten(int totaalWedstrijdPunten) {
        this.totaalWedstrijdPunten = totaalWedstrijdPunten;
    }

    public int getTotaalVoorDoelpunten() {
        return totaalVoorDoelpunten;
    }

    public void setTotaalVoorDoelpunten(int totaalVoorDoelpunten) {
        this.totaalVoorDoelpunten = totaalVoorDoelpunten;
    }

    public int getTotaalTegenDoelpunten() {
        return totaalTegenDoelpunten;
    }

    public void setTotaalTegenDoelpunten(int totaalTegenDoelpunten) {
        this.totaalTegenDoelpunten = totaalTegenDoelpunten;
    }
}

