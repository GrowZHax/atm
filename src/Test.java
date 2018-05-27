//The Language Is Turkish :D
import java.util.Scanner;

public class Test {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("GrowZ Banka Hoş Geldiniz İşlemi Seçiniz 1)Para Çekme 2)Para Yatırma 3)Hesap Bakiyesi");
	System.out.println("İşlem Seçiniz: ");
	int islem = scan.nextInt();
	int para = 100;
	switch (islem) {
	case 1:
		System.out.println("Çekmek İstediğiniz Miktarı Giriniz: ");
		int miktar = scan.nextInt();
		para-=miktar;
		System.out.println("Bankadaki Paranız: "+para);
		break;
	case 2:
		String isim = scan.nextLine();
		System.out.println("Yatırmak İsteiğiniz Kişinin Adını Yazınız: ");
		System.out.println("Yatırmak İstediğiniz Miktarı Seçin: ");
		miktar = scan.nextInt();
		para-=miktar;
		System.out.println(miktar+"tl"+isim+"Adlı Kişiye Gönderildi");
		break;
	case 3:
	System.out.println("Bakiyeniz "+ para);
	break;
	default:
		System.out.println("Geçersiz İşlem");
		break;
	}
}
}
