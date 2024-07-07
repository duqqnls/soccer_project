package pack.game;

import lombok.Data;

@Data
public class GameBean {
	private int code, homesc, awaysc;
	private double poss, sot, tac;
	private String home, away, date, stadium;
	
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public int getHomesc() {
		return homesc;
	}
	public void setHomesc(int homesc) {
		this.homesc = homesc;
	}
	public int getAwaysc() {
		return awaysc;
	}
	public void setAwaysc(int awaysc) {
		this.awaysc = awaysc;
	}
	public double getPoss() {
		return poss;
	}
	public void setPoss(double poss) {
		this.poss = poss;
	}
	public double getSot() {
		return sot;
	}
	public void setSot(double sot) {
		this.sot = sot;
	}
	public double getTac() {
		return tac;
	}
	public void setTac(double tac) {
		this.tac = tac;
	}
	public String getHome() {
		return home;
	}
	public void setHome(String home) {
		this.home = home;
	}
	public String getAway() {
		return away;
	}
	public void setAway(String away) {
		this.away = away;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getStadium() {
		return stadium;
	}
	public void setStadium(String stadium) {
		this.stadium = stadium;
	}
}
