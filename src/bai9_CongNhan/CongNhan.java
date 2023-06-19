package bai9_CongNhan;

public class CongNhan {
	private double maCN;
	private String maHo;
	private String maTen;
	private long mSoSP;

	
	
	public CongNhan() {
	}
	
	public CongNhan(double maCN, String maHo, String maTen, long mSoSP ) {
		
		this.maCN = maCN;
		this.maHo = maHo;
		this.maTen = maTen;
		this.mSoSP = mSoSP;
	}

	public double getMaCN() {
		return maCN;
	}
	public void setMaCN(double maCN) {
		this.maCN = maCN;
	}
	public String getMaHo() {
		return maHo;
	}
	public void setMaHo(String maHo) {
		this.maHo = maHo;
	}
	public String getMaTen() {
		return maTen;
	}
	public void setMaTen(String maTen) {
		this.maTen = maTen;
	}
	public long getMSoSP() {
		return mSoSP;
	}
	public void setMaSoSP(long mSoSP) {
//		if(mSoSP < 0)
//			this.mSoSP = 0;
		this.mSoSP = mSoSP;
	}
	
	public double donGia() {
		double luu = 0;
		if (mSoSP >= 1 && mSoSP < 199) 
			luu = 0.5;
		else if (mSoSP >= 200 && mSoSP < 399)
			luu = 0.55;
		else if (mSoSP >= 400 && mSoSP < 599)
			luu = 0.6;
		else luu = 0.65;
		
		return luu;
		
	}
	
	public double tinhLuong() {
		return mSoSP * donGia();
	}
//	public String toString() {
//		return String.format("Luong Cong nhan với sản phẩm là %l thì mức lương sẽ là %d",mSoSP,tinhLuong() );
//	}

	@Override
	public String toString() {
		return "CongNhan [maCN=" + maCN + ", maHo=" + maHo + ", maTen=" + maTen + ", mSoSP=" + mSoSP + ", tinhLuong()="
				+ tinhLuong() + "]";
	}
	
}

