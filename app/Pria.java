package app;

public class Pria{

	public static void keterangan(double hasil){
		if (hasil < 17) {
			System.out.println("anda kekurangan berat badan/kurus");
		}else if (hasil < 23) {
			System.out.println("berat badan normal atau ideal");
		}else if (hasil < 27) {
			System.out.println("anda kelebihan berat badan");
		}else {
			System.out.println("obesitas, sebaiknya anda segera menurunkan berat badan!");
		}
	}

}