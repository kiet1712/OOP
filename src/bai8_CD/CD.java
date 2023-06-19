package bai8_CD;

public class CD {
	private int maCD;
	private String TuaCD;
	private int soBaiHat;
	private float GiaThanh;
	
	
	public CD() {
		super();
	}
	
	public CD(int maCD, String tuaCD, int soBaiHat, float giaThanh) {
		super();
		this.maCD = 9999;
		this.TuaCD = tuaCD;
		this.soBaiHat = soBaiHat;
		GiaThanh = giaThanh;
	}

	public int getMaCD() {
		return maCD;
	}
	public void setMaCD(int maCD) {
		if (this.maCD < 0)
			this.maCD = 1;
		else
			this.maCD = maCD;
	}
	public String getTuaCD() {
		return TuaCD;
	}
	public void setTuaCD(String tuaCD) {
		if (!tuaCD.trim().equals(""))
			this.TuaCD = "chua xac dinh";
		else this.TuaCD = TuaCD;
	}
	public int getSoBaiHat() {
		return soBaiHat;
	}
	public void setSoBaiHat(int soBaiHat) {
		if (soBaiHat < 0)
			this.soBaiHat = 1;
		else
			this.soBaiHat = soBaiHat;
	}
	public float getGiaThanh() {
		return GiaThanh;
	}
	public void setGiaThanh(float giaThanh) {
		if (giaThanh < 0)
			GiaThanh = 0;
		else
			GiaThanh = giaThanh;
	}
	
	
	
}
