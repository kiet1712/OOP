package QuanLySach;

import java.time.LocalDate;

public class Main {
	public static void main(String[] args) {
		Sach sach1 = new SachGiaoKhoa("111", LocalDate.of(2015, 12, 24), 100000, 1, "Social-v2", "moi");
		Sach sach2 = new SachGiaoKhoa("112", LocalDate.of(2015, 12, 25), 150000, 1, "IUH", "cu");
		Sach sach3 = new SachThamKhao("113", LocalDate.of(2015, 12, 20), 180000, 1, "BTX", 10);
		
		System.out.println(sach1);
		System.out.println(sach3);
		
		System.out.println( );
	}
}
