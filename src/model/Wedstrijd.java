package model;

/**
 * Author: Mark Amerkamp (markamerkamp@gmail.com)
 * Veel plezier ermee!
 */
public class Wedstrijd {
    private Team teamThuis;
    private Team teamUit;
    private int voorDoelpunten;
    private int tegenDoelpunten;

    public Wedstrijd(Team teamThuis, Team teamUit, int voorDoelpunten, int tegenDoelpunten) {
        this.teamThuis = teamThuis;
        this.teamUit = teamUit;
        this.voorDoelpunten = voorDoelpunten;
        this.tegenDoelpunten = tegenDoelpunten;
    }

    public Wedstrijd(Team teamThuis, Team teamUit) {
        this.teamThuis = teamThuis;
        this.teamUit = teamUit;
    }

    public Wedstrijd() {

    }

    public int getWedstrijdPuntenThuisTeam() {
        if (getVoorDoelpunten() > getTegenDoelpunten()) {
            return 3;
        } else if (getVoorDoelpunten() == getTegenDoelpunten()) {
            return 1;
        } else {
            return 0;
        }
    }

    public int getWedstrijdPuntenUitTeam() {
        if (getTegenDoelpunten() > getVoorDoelpunten()) {
            return 3;
        } else if (getTegenDoelpunten() == getTegenDoelpunten()) {
            return 1;
        } else {
            return 0;
        }
    }

    public int setWedstrijdPuntenThuisTeam(){
        int nieuwPuntenTotaalThuisTeam = teamThuis.getTotaalWedstrijdPunten() + getWedstrijdPuntenThuisTeam();
        return nieuwPuntenTotaalThuisTeam;
    }

    public int setWedstrijdPuntenUitTeam() {
        int nieuwPuntenTotaalUitTeam = teamUit.getTotaalWedstrijdPunten() + getWedstrijdPuntenUitTeam();
        return nieuwPuntenTotaalUitTeam;
    }

    public int bepaaldWedstrijdPunten() {
        if (voorDoelpunten > tegenDoelpunten) {
            return 3;
        } else if (voorDoelpunten == tegenDoelpunten) {
            return 1;
        } else {
            return 0;
        }
    }

    public void printUitslag() {
        System.out.printf("Uitslag van de wedstrijd %s-%s: %d-%d", teamThuis.getTeamNaam(), teamUit.getTeamNaam(), voorDoelpunten, tegenDoelpunten);
        System.out.println();
    }

    public void printWedstrijdPunten() {
        System.out.printf("Dit levert %d wedstrijdpunt(en) op voor %s en %d wedstrijdpunten voor %s",
                getWedstrijdPuntenThuisTeam(), teamThuis.getTeamNaam(), getWedstrijdPuntenUitTeam(), teamUit.getTeamNaam());

//        if (bepaaldWedstrijdPunten() == 1) {
//            System.out.printf("Dit levert %d wedstrijdpunt op", bepaaldWedstrijdPunten());
//
//        } else {
//            System.out.printf("Dit levert %d wedstrijdpunten op", bepaaldWedstrijdPunten());
//        }
    }

    public Team getTeamThuis() {
        return teamThuis;
    }

    public void setTeamThuis(Team teamThuis) {
        this.teamThuis = teamThuis;
    }

    public Team getTeamUit() {
        return teamUit;
    }

    public void setTeamUit(Team teamUit) {
        this.teamUit = teamUit;
    }


    public int getVoorDoelpunten() {
        return voorDoelpunten;
    }

    public void setVoorDoelpunten(int voorDoelpunten) {
        this.voorDoelpunten = voorDoelpunten;
    }

    public int getTegenDoelpunten() {
        return tegenDoelpunten;
    }

    public void setTegenDoelpunten(int tegenDoelpunten) {
        this.tegenDoelpunten = tegenDoelpunten;
    }
}
