import app.Rumus;
import app.Pria;
import app.Wanita;
import java.util.Scanner;


class pengukuran{

	public static void main(String[] args) {
	
		Scanner ketik = new Scanner(System.in);
		double tinggi, berat;
		int jenis;

		System.out.println("MASUKAN TINGGI BADAN (meter) : ");
		tinggi=ketik.nextDouble();
		System.out.println("MASUKAN BERAT BADAN (kg) : ");
		berat=ketik.nextDouble();
		System.out.println("JENIS KELAMIN (1) PRIA (2) WANITA : ");
		jenis = ketik.nextInt();

		Rumus hitung = new Rumus();
		double hasil = hitung.pengukuran(tinggi, berat);

		if (jenis== 1) {
			Pria.keterangan(hasil);

		}else if (jenis== 2) {
			Wanita.keterangan(hasil);
		}else{
			System.out.println("KAMU PULANG SAJA");
		}
	}


}