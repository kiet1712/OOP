package bai6_account;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Account acc1 = new Account(72354, "Kiet 1", 100000);
		Account acc2 = new Account(69713, "Kiet 2", 40000);
		Account acc3 = new Account(93757, "Kiet 3", 700000);
		
		System.out.println(acc1);
		System.out.println(acc2);
		System.out.println(acc3);
	//chuyen tien 
		System.out.println("Nhập số tiền cần gửi cho Account1: ");
		if(acc1.deposite(sc.nextDouble()))System.out.println("Gửi tiền thành công!");
		else System.out.println("Gửi tiền thất bại!");
		System.out.println("Nhập số tiền cần gửi cho Account2: ");
		if(acc2.deposite(sc.nextDouble()))System.out.println("Gửi tiền thành công!");
		else System.out.println("Gửi tiền thất bại!");
		System.out.println("Nhập số tiền cần gửi cho Account3: ");
		if(acc3.deposite(sc.nextDouble()))System.out.println("Gửi tiền thành công!");
		else System.out.println("Gửi tiền thất bại!");
		
	//rut tien
		System.out.println("Nhập số tiền cần rút cho Account2: ");
		if(acc2.withdraw(sc.nextDouble(), 2000))System.out.println("Rút tiền thành công!");
		else System.out.println("Rút tiền thất bại!");
		
		acc3.addInterest();

		System.out.println(acc1);
		System.out.println(acc2);
		System.out.println(acc3);
	//chuyen tien tu acc1 qua acc 2
		System.out.println("Nhập số tiền cần chuyển từ Account 1 cho Account 2: ");
		if(acc1.transper(acc2, sc.nextDouble()))System.out.println("Chuyển tiền thành công!");
		else System.out.println("Chuyển tiền thất bại!");
	
	System.out.println(acc1);
		System.out.println(acc2);
		
		sc.close();
	}
}
