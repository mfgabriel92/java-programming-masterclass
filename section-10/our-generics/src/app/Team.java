package app;

import java.util.ArrayList;

public class Team {
    private String name;
    private ArrayList<Player> members = new ArrayList<>();
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

    public boolean addPlayer(Player player) {
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

    public void matchResult(Team opponent, int ourScore, int theirScore) {
        if (ourScore > theirScore) {
            won++;
        } else if (ourScore == theirScore) {
            tied++;
        } else {
            lost++;
        }

        played++;

        if (opponent != null) {
            opponent.matchResult(null, theirScore, ourScore);
        }
    }

    public int ranking() {
        return won * 2 + tied;
    }
}