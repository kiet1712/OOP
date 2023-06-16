package bai3_HinhTamGiac;

public class HinhTamGiac {
	private double ma;
	private double mb;
	private double mc;
	public HinhTamGiac() {
		super();
	
	}
	public HinhTamGiac(double ma, double mb, double mc) {
		if(ma>=0 && mb>= 0 && mc>=0 && ma<mb+mc && mb<ma+mc && mc<ma+mb) {
			this.ma = ma;
			this.mb = mb;
			this.mc = mc;
		}
	}
	public double getMa() {
		return ma;
	}
	public void setMa(double ma) {
		if(ma>=0 && ma<mb+mc && mb<ma+mc && mc<ma+mb)
			this.ma = ma;
		else this.ma = 0;
	}
	public double getMb() {
		return mb;
	}
	public void setMb(double mb) {
		if(mb>=0 && ma<mb+mc && mb<ma+mc && mc<ma+mb)
			this.mb = mb;
		else this.mb = 0;
	}
	public double getMc() {
		return mc;
	}
	public void setMc(double mc) {
		if(mc>=0 && ma<mb+mc && mb<ma+mc && mc<ma+mb)
			this.mc = mc;
		else this.mc = 0;
	}
	public double tinhChuVi() {
		return (ma+mb+mc)/2;
	}
	public double tinhDienTich() {
		double p = tinhChuVi();
		return Math.sqrt(p*(p-ma)*(p-mb)*(p-mc));
	}
}

