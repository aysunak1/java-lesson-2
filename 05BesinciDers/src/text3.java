import java.util.Scanner;

public class text3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Ad�n�z� girin:");
		String isim = scanner.nextLine();
		
		System.out.print("Soyad�n�z� girin:");
		String soyad = scanner.nextLine();
		
		System.out.println("Ders ad�n� girin:");
		String dersAdi = scanner.nextLine();
		
		System.out.print("K�sa s�nav notunuzu girin:");
		double k�saSinav = scanner.nextDouble();
		
		System.out.print("Vize notunuzu girin:");
		double vizeNot = scanner.nextDouble();
		
		System.out.print("Final notunuzu girin:");
		double finalNot = scanner.nextDouble();
		
		double sonuc = (k�saSinav*0.2) + (vizeNot*0.3) + (finalNot*0.5) ;
		if(sonuc>50) {
			System.out.println(isim + " " + soyad +" isimli ��renci " + dersAdi + " dersinden " + sonuc + " ortalamayla ge�mi�tir.");	
		}
		else if (sonuc<50 && sonuc>=40) {
			System.out.println(isim + " " + soyad +" isimli ��renci " + dersAdi + " dersinden " + sonuc + " ortalamayla KO�ULLU ge�mi�tir.");
			
		}
		else {
			System.out.println("DERSTEN KALDINIZ! NOTUNUZ:" + sonuc);
		}
		
		
	}

}
