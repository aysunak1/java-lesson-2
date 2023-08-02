import java.util.Scanner;

public class text3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Adýnýzý girin:");
		String isim = scanner.nextLine();
		
		System.out.print("Soyadýnýzý girin:");
		String soyad = scanner.nextLine();
		
		System.out.println("Ders adýný girin:");
		String dersAdi = scanner.nextLine();
		
		System.out.print("Kýsa sýnav notunuzu girin:");
		double kýsaSinav = scanner.nextDouble();
		
		System.out.print("Vize notunuzu girin:");
		double vizeNot = scanner.nextDouble();
		
		System.out.print("Final notunuzu girin:");
		double finalNot = scanner.nextDouble();
		
		double sonuc = (kýsaSinav*0.2) + (vizeNot*0.3) + (finalNot*0.5) ;
		if(sonuc>50) {
			System.out.println(isim + " " + soyad +" isimli öðrenci " + dersAdi + " dersinden " + sonuc + " ortalamayla geçmiþtir.");	
		}
		else if (sonuc<50 && sonuc>=40) {
			System.out.println(isim + " " + soyad +" isimli öðrenci " + dersAdi + " dersinden " + sonuc + " ortalamayla KOÞULLU geçmiþtir.");
			
		}
		else {
			System.out.println("DERSTEN KALDINIZ! NOTUNUZ:" + sonuc);
		}
		
		
	}

}
