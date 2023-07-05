package QuanLySach;

import java.time.LocalDate;

public class SachGiaoKhoa extends Sach {
	private String tinhTrang;

	public SachGiaoKhoa() {
		super();
		this.tinhTrang = "chua co";

	}

	public SachGiaoKhoa(String maSach, LocalDate ngayNhap, double donGia, int soLuong, String nhaxuatBan,
			String tinhTrang) {
		super(maSach, ngayNhap, donGia, soLuong, nhaxuatBan);
		this.tinhTrang = tinhTrang;
	}

	public String getTinhTrang() {
		return tinhTrang;
	}

	public void setTinhTrang(String tinhTrang) {
		this.tinhTrang = tinhTrang;
	}

	@Override
	public double thanhTien() {
		if (tinhTrang == "moi")
			return super.getSoLuong() * super.getDonGia();
		else
			return super.getSoLuong() * super.getDonGia() / 2;
	}

	@Override
	public String toString() {
		return String.format("%s%-10s%-10.2f", super.toString(), tinhTrang, thanhTien());
	}

}
