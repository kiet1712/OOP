package bai4_Vehicle;

public class ThongTinDangKyXe {
	private String chuXe;
	private String loaiXe;
	private double dungTichXL;
	private double triGiaXe;

	public ThongTinDangKyXe() {
		chuXe = "Khong co";
		loaiXe = "Khong co";
	}
	public ThongTinDangKyXe(String chuXe, String loaiXe, int dungTichXL, float triGiaXe) throws Exception {
		this.chuXe = chuXe;
		this.loaiXe = loaiXe;
		setDungTichXL(dungTichXL);
		setTriGiaXe(triGiaXe);
	}

	public String getChuXe() {
		return chuXe;
	}
	public void setChuXe(String chuXe) {
		this.chuXe = chuXe;
	}
	public String getLoaiXe() {
		return loaiXe;
	}
	public void setLoaiXe(String loaiXe) {
		this.loaiXe = loaiXe;
	}
	public double getDungTichXL() {
		return dungTichXL;
	}
	public void setDungTichXL(double dungTichXL)throws Exception {
		if (dungTichXL >= 0)
			this.dungTichXL = dungTichXL;
		else
			throw new Exception("Error: Dung tich xy lanh be hon 0!");
	}
	public double getTriGiaXe() {
		return triGiaXe;
	}
	public void setTriGiaXe(double triGiaXe)throws Exception {
		if (triGiaXe >= 0)
			this.triGiaXe = triGiaXe;
		else
			throw new Exception("Error: Tri gia xe be hon 0!");
	}
	
	public double tinhThuePhaiNop() {
		if (dungTichXL < 100)
			return triGiaXe * 0.01;
		else if (dungTichXL >= 100 && dungTichXL <= 200)
			return triGiaXe * 0.03;
		else
			return triGiaXe * 0.05;
	}
	public String toString() {
		return String.format("%-20s %-15s %-12f %-15.2f %-15.2f", chuXe, loaiXe, dungTichXL, triGiaXe, tinhThuePhaiNop());
	}
}