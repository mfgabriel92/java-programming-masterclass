package app;

public class App {
    public static void main(String[] args) throws Exception {
        SoccerPlayer joe = new SoccerPlayer("Joe");
        BaseballPlayer john = new BaseballPlayer("John");

        Team teamOne = new Team("Team One");
        teamOne.addPlayer(joe);
        teamOne.addPlayer(john);

        System.out.println(teamOne.numOfPlayers());
    }
}