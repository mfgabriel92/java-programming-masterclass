package app;

public class App {
    public static void main(String[] args) throws Exception {
        SoccerPlayer sp1 = new SoccerPlayer("Soccer Player 1");
        SoccerPlayer sp2 = new SoccerPlayer("Soccer Player 2");
        SoccerPlayer sp3 = new SoccerPlayer("Soccer Player 3");

        Team<SoccerPlayer> teamOne = new Team<>("Team One");
        teamOne.addPlayer(sp1);
        teamOne.addPlayer(sp2);
        teamOne.addPlayer(sp3);

        System.out.println(teamOne.numOfPlayers());
    }
}