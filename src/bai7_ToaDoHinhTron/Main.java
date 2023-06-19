package bai7_ToaDoHinhTron;

public class Main {

	public static void main(String[] args) {
		ToaDo toaDo = new ToaDo(5f, 5F);
		HinhTron ht = new HinhTron(toaDo, 10.5);
		
		System.out.println(ht);

	}

}
