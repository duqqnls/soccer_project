package pack.coach;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CoachBean {
	private String teamcode, name, pos, lic, ibdan;
	private int code;
	
	public String getTeamcode() {
		return teamcode;
	}
	public void setTeamcode(String teamcode) {
		this.teamcode = teamcode;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPos() {
		return pos;
	}
	public void setPos(String pos) {
		this.pos = pos;
	}
	public String getLic() {
		return lic;
	}
	public void setLic(String lic) {
		this.lic = lic;
	}
	public String getIbdan() {
		return ibdan;
	}
	public void setIbdan(String ibdan) {
		this.ibdan = ibdan;
	}
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
}
