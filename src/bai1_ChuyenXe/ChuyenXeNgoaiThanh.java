package bai1_ChuyenXe;

public class ChuyenXeNgoaiThanh extends ChuyenXe {
	private String noiDen;
	private String soNgayDiDuoc;
	public ChuyenXeNgoaiThanh() {
		super();
		
	}
	
	public ChuyenXeNgoaiThanh(double doanhthu, String maSoChuyen, String tenTaiXe, String noiDen, String soXe2,
			String soNgayDiDuoc) {
		super(doanhthu, maSoChuyen, tenTaiXe, noiDen);
		this.noiDen = "khong co";
		this.soNgayDiDuoc ="khong co";
	}
	public String getNoiDen() {
		return noiDen;
	}
	public void setSoXe(String noiDen) {
		this.noiDen = noiDen;
	}
	public String getSoNgayDiDuoc() {
		return soNgayDiDuoc;
	}
	public void setSoNgayDiDuoc(String soNgayDiDuoc) {
		this.soNgayDiDuoc = soNgayDiDuoc;
	}
	


}
