package bai2_DiemTrungBinh;

public class Poin {
	private double maSV;
	private float diemLT;
	private float diemTH;
	private String name;
	
	
	public Poin() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Poin(double maSV, float diemLT, float diemTH, String name) {
		
	
		
		setMaSV(maSV);
		this.diemLT = diemLT;
		this.diemTH = diemTH;
		this.name = name;
	}


	@Override
	public String toString() {
		return "Poin [maSV=" + maSV + ", diemLT=" + diemLT + ", diemTH=" + diemTH + ", name=" + name +",diemTB="+tinhDiemTB() +"]";
	}


	public double getMaSV() {
		return maSV;
	}


	public void setMaSV(double maSV) {
		if (maSV < 0)
			this.maSV = 0;
		else 	
			this.maSV = maSV;
	}


	public float getDiemLT() {
		return diemLT;
	}


	public void setDiemLT(float diemLT) {
		if (diemLT < 0 || diemLT > 10)
			this.diemLT = 0;
		else
			this.diemLT = diemLT;
	}


	public float getDiemTH() {
		return diemTH;
	}


	public void setDiemTH(float diemTH) {
		if (diemTH < 0 || diemTH > 10)
			this.diemTH = 0;
		else
			this.diemTH = diemTH;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}
	
	public double tinhDiemTB() {
		
		return (diemLT + diemTH) /2;
	
	}



	

}
