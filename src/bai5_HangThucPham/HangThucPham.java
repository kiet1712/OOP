package bai5_HangThucPham;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.text.DecimalFormat;
import java.time.LocalDate;

public class HangThucPham {
	private String maHang;
	private String tenHang;
	private double donGia;
	private LocalDate ngaySanXuat;
	private LocalDate ngayHetHan;

	public HangThucPham() {
		this.maHang = "Khong co";
		this.tenHang = "xxx";
		this.donGia = 0;
		this.ngaySanXuat = LocalDate.now();
		this.ngayHetHan = this.ngaySanXuat;
	}

	public HangThucPham(String maHang) throws Exception {
		setMaHang(maHang);
		this.tenHang = "xxx";
		this.donGia = 0;
		this.ngaySanXuat = LocalDate.now();
		this.ngayHetHan = this.ngaySanXuat;
	}

	public HangThucPham(String maHang, String tenHang, double donGia, LocalDate ngaySanXuat, LocalDate ngayHetHan)
			throws Exception {
		setMaHang(maHang);
		setTenHang(tenHang);
		setDonGia(donGia);
		setNgaySanXuat(ngaySanXuat);
		setNgayHetHan(ngayHetHan);
	}

	private void setMaHang(String maHang) throws Exception {
		if (!maHang.trim().equals(""))
			this.maHang = maHang;
		else
			throw new Exception("Lỗi: Mã hàng rỗng!");
	}

	public void setTenHang(String tenHang) {
		if (!tenHang.trim().equals(""))
			this.tenHang = tenHang;
		else
			this.tenHang = "xxx";
	}

	public void setDonGia(double donGia) {
		if (donGia >= 0)
			this.donGia = donGia;
		else
			this.donGia = 0;
	}

	public void setNgaySanXuat(LocalDate ngaySanXuat) {
		if (ngaySanXuat.isBefore(LocalDate.now()))
			this.ngaySanXuat = ngaySanXuat;
		else
			this.ngaySanXuat = LocalDate.now();
	}

	public void setNgayHetHan(LocalDate ngayHetHan) {
		if (ngayHetHan.isAfter(ngaySanXuat))
			this.ngayHetHan = ngayHetHan;
		else
			this.ngayHetHan = ngaySanXuat;
	}

	public String getMaHang() {
		return maHang;
	}

	public String getTenHang() {
		return tenHang;
	}

	public double getDonGia() {
		return donGia;
	}

	public LocalDate getNgaySX() {
		return ngaySanXuat;
	}

	public LocalDate getNgayHH() {

		return ngayHetHan;
	}

	public boolean kiemTraHanSuDung() {
		return ngayHetHan.isAfter(LocalDate.now()) ? true : false;
	}

	public String toString() {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DecimalFormat df = new DecimalFormat("#,##0.00");
		return String.format("%-7s %-10s %-15s %-15s %-15s %-15s", maHang, tenHang, df.format(donGia),
				dtf.format(ngaySanXuat), dtf.format(ngayHetHan), kiemTraHanSuDung() ? "Hàng còn hạn!" : "Hàng hết hạn");
	}
}