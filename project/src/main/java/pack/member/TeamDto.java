package pack.member;

public class TeamDto {
    public String rank, title, match, victoryPoint, victory, draw, defeat, goals, loss;

    public TeamDto(String rank, String title, String match, String victoryPoint,
                   String victory, String draw, String defeat, String goals, String loss){
        this.rank = rank;
        this.title = title;
        this.match = match;
        this.victoryPoint = victoryPoint;
        this.victory = victory;
        this.draw = draw;
        this.defeat = defeat;
        this.goals = goals;
        this.loss = loss;

    }

	public String getRank() {
		return rank;
	}

	public void setRank(String rank) {
		this.rank = rank;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getMatch() {
		return match;
	}

	public void setMatch(String match) {
		this.match = match;
	}

	public String getVictoryPoint() {
		return victoryPoint;
	}

	public void setVictoryPoint(String victoryPoint) {
		this.victoryPoint = victoryPoint;
	}

	public String getVictory() {
		return victory;
	}

	public void setVictory(String victory) {
		this.victory = victory;
	}

	public String getDraw() {
		return draw;
	}

	public void setDraw(String draw) {
		this.draw = draw;
	}

	public String getDefeat() {
		return defeat;
	}

	public void setDefeat(String defeat) {
		this.defeat = defeat;
	}

	public String getGoals() {
		return goals;
	}

	public void setGoals(String goals) {
		this.goals = goals;
	}

	public String getLoss() {
		return loss;
	}

	public void setLoss(String loss) {
		this.loss = loss;
	}
}
