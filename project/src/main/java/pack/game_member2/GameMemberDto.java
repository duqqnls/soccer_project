package pack.game_member2;


import lombok.Data;

@Data
public class GameMemberDto {
    private int goal, sot, shoots, poss, pass_a, pass_s,tac_a, tac_s;
    private String gubun, teamcode, id, date, result;
	
    public int getGoal() {
		return goal;
	}
	public void setGoal(int goal) {
		this.goal = goal;
	}
	public int getSot() {
		return sot;
	}
	public void setSot(int sot) {
		this.sot = sot;
	}
	public int getShoots() {
		return shoots;
	}
	public void setShoots(int shoots) {
		this.shoots = shoots;
	}
	public int getPoss() {
		return poss;
	}
	public void setPoss(int poss) {
		this.poss = poss;
	}
	public int getPass_a() {
		return pass_a;
	}
	public void setPass_a(int pass_a) {
		this.pass_a = pass_a;
	}
	public int getPass_s() {
		return pass_s;
	}
	public void setPass_s(int pass_s) {
		this.pass_s = pass_s;
	}
	public int getTac_a() {
		return tac_a;
	}
	public void setTac_a(int tac_a) {
		this.tac_a = tac_a;
	}
	public int getTac_s() {
		return tac_s;
	}
	public void setTac_s(int tac_s) {
		this.tac_s = tac_s;
	}
	public String getGubun() {
		return gubun;
	}
	public void setGubun(String gubun) {
		this.gubun = gubun;
	}
	public String getTeamcode() {
		return teamcode;
	}
	public void setTeamcode(String teamcode) {
		this.teamcode = teamcode;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	}

}
