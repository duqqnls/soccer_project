package pack.staff;

import lombok.Data;

@Data
public class StaffDto {
	int code;
	String name,teamcode,nation,role,ibdan;
	
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTeamcode() {
		return teamcode;
	}
	public void setTeamcode(String teamcode) {
		this.teamcode = teamcode;
	}
	public String getNation() {
		return nation;
	}
	public void setNation(String nation) {
		this.nation = nation;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getIbdan() {
		return ibdan;
	}
	public void setIbdan(String ibdan) {
		this.ibdan = ibdan;
	}
}
