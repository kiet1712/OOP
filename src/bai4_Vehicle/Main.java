package bai4_Vehicle;

public class Main {
	public static void main(String[] args) {
		try {
		ThongTinDangKyXe xe1 = new ThongTinDangKyXe("Nguyễn Thu Lan", "Future Neo", 100, 35000000);
		ThongTinDangKyXe xe2 = new ThongTinDangKyXe("Lê Minh Tính", "Ford Ranger", 3000, 250000000);
		ThongTinDangKyXe xe3 = new ThongTinDangKyXe("Nguyễn Minh Triết", "Landscape", 1500, 1000000000);
		
			System.out.println("Tên chủ xe           Loại xe         Dung tích    Trị giá         Thuế phải nộp");
			System.out.println("================================================================================");
	
			System.out.println(xe1);
			System.out.println(xe2);
			System.out.println(xe3);

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}