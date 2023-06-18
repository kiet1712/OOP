package bai5_HangThucPham;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try {
			LocalDate ngay = LocalDate.of(2018, 07, 10);
			LocalDate ngay1 = LocalDate.of(2025, 03, 01);
			LocalDate ngay2 = LocalDate.of(2018, 9, 01);
			LocalDate ngay3 = LocalDate.of(2017, 03, 01);
			LocalDate ngay4 = LocalDate.of(2024, 03, 01);
			
			HangThucPham htp1 = new HangThucPham("001", "Gạo", 100000, ngay, ngay);
			HangThucPham htp2 = new HangThucPham("002", "", 5000, ngay1, ngay2);
			HangThucPham htp3 = new HangThucPham("003", "Nước", 10000, ngay3, ngay4);
		

			System.out.println("Mã_Hàng Tên_Hàng   Đơn_Giá         Ngày_Sản_Xuất   Ngày_Hết_Hạn    Ghi_Chú");
			System.out.println("----------------------------------------------------------------------------------");
		
			System.out.println(htp1);
			System.out.println(htp2);
			System.out.println(htp3);
			
			htp1 = new HangThucPham("", "", -100000, ngay, ngay);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			System.out.println("Kết thúc chương trình!");
		}
	}
}