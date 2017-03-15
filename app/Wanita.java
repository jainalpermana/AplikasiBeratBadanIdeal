package app;

public class Wanita{

	public static void keterangan(double hasil){
		if (hasil < 18) {
			System.out.println("anda kekurangan berat badan/kurus");
		}else if (hasil < 25) {
			System.out.println("berat badan normal atau ideal");
		}else if (hasil < 27) {
			System.out.println("anda kelebihan berat badan");
		}else {
			System.out.println("obesitas, sebaiknya anda segera menurunkan berat badan!");
		}
	}

}