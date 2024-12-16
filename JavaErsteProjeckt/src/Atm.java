/*  import java.util.Scanner;

public class Atm {
    public void calis(Hesap hesap, Scanner s) {
        Login login = new Login();

        System.out.println("Bankamiza Hosgeldiniz...");
        System.out.println("************************");
        System.out.println("Kullanici Girisi");
        System.out.println("************************");
        int giris_hakki = 3;

        while (true) {
            if (login.login(hesap, s)) {
                System.out.println("Giris Basarili...");
                break;
            } else {
                System.out.println("Giris Basarisiz...");
                giris_hakki -= 1;
                System.out.println("Kalan Giris Hakkiniz: " + giris_hakki);
            }
            if (giris_hakki == 0) {
                System.out.println("Giris Hakkiniz Bitti...");
                return;
            }
        }
        System.out.println("************************");
        String islemler = """
        1. Bakiye Goruntuleme
        2. Para Yatirma
        3. Para Cekme
        Cikis icin q'ya basin.
        """;
        System.out.println(islemler);
        System.out.println("************************");

        while (true) {
            System.out.println("Islemi seciniz: ");
            String islem = s.nextLine();

            switch (islem) {
                case "q" -> {
                    System.out.println("Çikis yapiliyor...");
                    return; // Döngüyü bitir
                }
                case "1" -> System.out.println("Bakiyeniz: " + hesap.getBakiye());
                case "2" -> {
                    System.out.println("Yatirmak istediginiz tutar: ");
                    int tutar = s.nextInt();
                    s.nextLine();
                    if (tutar > 0) {
                        hesap.paraYatir(tutar);
                    } else {
                        System.out.println("Geçersiz tutar...");
                    }
                }
                case "3" -> {
                    System.out.println("Cekmek istediginiz tutar: ");
                    int tutar = s.nextInt();
                    s.nextLine();
                    if (tutar > 0) {
                        hesap.paraCek(tutar);
                    } else {
                        System.out.println("Geçersiz tutar...");
                    }
                }
                default -> System.out.println("Gecersiz Islem...");
            }
        }
    }
}
 */