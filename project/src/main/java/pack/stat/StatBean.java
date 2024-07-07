package pack.stat;

import lombok.Data;

@Data
public class StatBean {
	private int code, bn, match, goal, as, yellow, red;
	private String season, name;  
	
	// 통계를 위한 멤버 필드 선언
	private int totalGoal, totalAs, totalYellow, totalRed;

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public int getBn() {
		return bn;
	}

	public void setBn(int bn) {
		this.bn = bn;
	}

	public int getMatch() {
		return match;
	}

	public void setMatch(int match) {
		this.match = match;
	}

	public int getGoal() {
		return goal;
	}

	public void setGoal(int goal) {
		this.goal = goal;
	}

	public int getAs() {
		return as;
	}

	public void setAs(int as) {
		this.as = as;
	}

	public int getYellow() {
		return yellow;
	}

	public void setYellow(int yellow) {
		this.yellow = yellow;
	}

	public int getRed() {
		return red;
	}

	public void setRed(int red) {
		this.red = red;
	}

	public String getSeason() {
		return season;
	}

	public void setSeason(String season) {
		this.season = season;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getTotalGoal() {
		return totalGoal;
	}

	public void setTotalGoal(int totalGoal) {
		this.totalGoal = totalGoal;
	}

	public int getTotalAs() {
		return totalAs;
	}

	public void setTotalAs(int totalAs) {
		this.totalAs = totalAs;
	}

	public int getTotalYellow() {
		return totalYellow;
	}

	public void setTotalYellow(int totalYellow) {
		this.totalYellow = totalYellow;
	}

	public int getTotalRed() {
		return totalRed;
	}

	public void setTotalRed(int totalRed) {
		this.totalRed = totalRed;
	}
	
}
