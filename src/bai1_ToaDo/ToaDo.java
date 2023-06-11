package bai1_ToaDo;

public class ToaDo {
	private double x;
	private double y;
	private String ten;
	
	public ToaDo() {
		ten = "O";
	}
	public ToaDo(double x, double y, String ten) {
		this.x = x;
		this.y = y;
		this.ten = ten;
	}
	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x = x;
	}
	public double getY() {
		return y;
	}
	public void setY(double y) {
		this.y = y;
	}
	public String getTen() {
		return ten;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}
	public String toString() {
		return String.format("%s(%.2f,%.2f)",ten,x,y);
	}
}
