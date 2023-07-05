package QuanLySach;

import java.time.LocalDate;

public class SachThamKhao extends Sach{
	private double thue;

	public SachThamKhao(String maSach, LocalDate ngayNhap, double donGia, int soLuong, String nhaxuatBan, double thue) {
		super(maSach, ngayNhap, donGia, soLuong, nhaxuatBan);
		this.thue = thue;
	}

	public SachThamKhao() {
		super();
		this.thue =0;
	}

	public double getThue() {
		return thue;
	}

	public void setThue(double thue) {
		this.thue = thue;
	}

	@Override
	public double thanhTien()  {
		return super.getSoLuong() * super.getDonGia() + thue;
	}
	
	@Override
	public String toString() {
		return String.format("%s%-10.2f%-10.2f", super.toString(), thue, thanhTien());
	}
}
