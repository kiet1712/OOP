package bai1_ChuyenXe;

public abstract class ChuyenXe {
	private double doanhthu;
	private String MaSoChuyen;
	private String TenTaiXe;
	private String SoXe;
	public ChuyenXe(double doanhthu, String maSoChuyen, String tenTaiXe, String soXe) {
		super();
		this.doanhthu = doanhthu;
		MaSoChuyen = maSoChuyen;
		TenTaiXe = tenTaiXe;
		SoXe = soXe;
	}
	public ChuyenXe() {
		super();
	}
	public double getDoanhthu() {
		return doanhthu;
	}
	public void setDoanhthu(double doanhthu) {
		this.doanhthu = doanhthu;
	}
	public String getMaSoChuyen() {
		return MaSoChuyen;
	}
	public void setMaSoChuyen(String maSoChuyen) {
		MaSoChuyen = maSoChuyen;
	}
	public String getTenTaiXe() {
		return TenTaiXe;
	}
	public void setTenTaiXe(String tenTaiXe) {
		TenTaiXe = tenTaiXe;
	}
	public String getSoXe() {
		return SoXe;
	}
	public void setSoXe(String soXe) {
		SoXe = soXe;
	}

	
} 
