/*
    Author: Ephraim Becker/ Will Camara

    ConesolePrint.java

    Prints the name and scoreboard to the console.
*/
public class ConsolePrint {

    public void print(
            String name,
            String awayTeamName,
            int awayScore,
            String homeTeamName,
            int homeScore) {

        System.out.println("Name: " + name);
        System.out.println(awayTeamName + ": " + awayScore);
        System.out.println(homeTeamName + ": " + homeScore);
        System.out.println();
    }
}