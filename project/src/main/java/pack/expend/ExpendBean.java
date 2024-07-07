package pack.expend;

import lombok.Data;

@Data
public class ExpendBean {
	private String teamcode, date, briefs;
	private int code, pybuy, trans, eat, maintain, cosalary, hcsalary, stsalary, training, mkting;
	
	public String getTeamcode() {
		return teamcode;
	}
	public void setTeamcode(String teamcode) {
		this.teamcode = teamcode;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getBriefs() {
		return briefs;
	}
	public void setBriefs(String briefs) {
		this.briefs = briefs;
	}
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public int getPybuy() {
		return pybuy;
	}
	public void setPybuy(int pybuy) {
		this.pybuy = pybuy;
	}
	public int getTrans() {
		return trans;
	}
	public void setTrans(int trans) {
		this.trans = trans;
	}
	public int getEat() {
		return eat;
	}
	public void setEat(int eat) {
		this.eat = eat;
	}
	public int getMaintain() {
		return maintain;
	}
	public void setMaintain(int maintain) {
		this.maintain = maintain;
	}
	public int getCosalary() {
		return cosalary;
	}
	public void setCosalary(int cosalary) {
		this.cosalary = cosalary;
	}
	public int getHcsalary() {
		return hcsalary;
	}
	public void setHcsalary(int hcsalary) {
		this.hcsalary = hcsalary;
	}
	public int getStsalary() {
		return stsalary;
	}
	public void setStsalary(int stsalary) {
		this.stsalary = stsalary;
	}
	public int getTraining() {
		return training;
	}
	public void setTraining(int training) {
		this.training = training;
	}
	public int getMkting() {
		return mkting;
	}
	public void setMkting(int mkting) {
		this.mkting = mkting;
	}
}
