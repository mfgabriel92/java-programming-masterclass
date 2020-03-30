package app;

import java.util.ArrayList;

public class Team<T extends Player> {
    private String name;
    private ArrayList<T> members = new ArrayList<>();
    int played = 0;
    int won = 0;
    int lost = 0;
    int tied = 0;

	public Team(String name) {
		this.name = name;
	}

    public String getName() {
        return name;
    }

    public boolean addPlayer(T player) {
        if (members.contains(player)) {
            System.out.println(player.getName() + " is already on the team");
            return false;
        }

        members.add(player);
        System.out.println(player.getName() + " added to the team " + getName());

        return true;
    }

    public int numOfPlayers() {
        return members.size();
    }

    public void matchResult(Team<T> opponent, int ourScore, int theirScore) {
        String message;

        if (ourScore > theirScore) {
            won++;
            message = " beat ";
        } else if (ourScore == theirScore) {
            tied++;
            message = " drew with ";
        } else {
            lost++;
            message = " lost to ";
        }

        played++;

        if (opponent != null) {
            opponent.matchResult(null, theirScore, ourScore);
            System.out.println(getName() + message + opponent.getName());
        }
    }

    public int ranking() {
        return won * 2 + tied;
    }
}