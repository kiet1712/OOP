package bai1_ChuyenXe;

public class ChuyenXeNoiThanh extends ChuyenXe {
	private int soTuyen;
	private int soKmdiDuoc;
	
	
	public ChuyenXeNoiThanh() {
		super();
		setSoTuyen(0);
		setSoKmdiDuoc(0);
	}
	
	public ChuyenXeNoiThanh(double doanhthu, String maSoChuyen, String tenTaiXe, String soXe, int soTuyen, int soKmdiDuoc) {
		super(doanhthu, maSoChuyen, tenTaiXe, soXe);;
		setSoKmdiDuoc(soKmdiDuoc);
		setSoTuyen(soTuyen); 
	}

	public int getSoTuyen() {
		return soTuyen;
	}

	public void setSoTuyen(int soTuyen) {
		this.soTuyen = soTuyen;
	}

	public int getSoKmdiDuoc() {
		return soKmdiDuoc;
	}

	public void setSoKmdiDuoc(int soKmdiDuoc) {
		this.soKmdiDuoc = soKmdiDuoc;
	}
}
