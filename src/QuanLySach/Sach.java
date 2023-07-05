package QuanLySach;

import java.time.LocalDate;

public abstract class Sach {
	private String maSach;
	private LocalDate ngayNhap;
	private double donGia;
	private int soLuong;
	private String nhaxuatBan;

	public Sach() {
		this.maSach = "chua co";
		this.ngayNhap = LocalDate.now();
		this.donGia = 0;
		this.soLuong = 0;
		this.nhaxuatBan = "chua co";
	}

	public Sach(String maSach, LocalDate ngayNhap, double donGia, int soLuong, String nhaxuatBan) {
		setMaSach(maSach);
		setNgayNhap(ngayNhap);
		setDonGia(donGia);
		setSoLuong(soLuong);
		setNhaxuatBan(nhaxuatBan);
	}

	public String getMaSach() {
		return maSach;
	}

	public void setMaSach(String maSach) {
		this.maSach = maSach;
	}

	public LocalDate getNgayNhap() {
		return ngayNhap;
	}

	public void setNgayNhap(LocalDate ngayNhap) {
		this.ngayNhap = ngayNhap;
	}

	public double getDonGia() {
		return donGia;
	}

	public void setDonGia(double donGia) {
		this.donGia = donGia;
	}

	public int getSoLuong() {
		return soLuong;
	}

	public void setSoLuong(int soLuong) {
		this.soLuong = soLuong;
	}

	public String getNhaxuatBan() {
		return nhaxuatBan;
	}

	public void setNhaxuatBan(String nhaxuatBan) {
		this.nhaxuatBan = nhaxuatBan;
	}

	abstract double thanhTien();

	@Override
	public String toString() {
		return String.format("%-10s%-20s%-20s%-5d%-20s", maSach, ngayNhap, donGia, soLuong, nhaxuatBan);
	}
}
