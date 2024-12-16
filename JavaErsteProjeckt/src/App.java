
import java.util.Scanner;

public class App {
   // public static void main(String[] args) throws Exception {

    /*     byte<short<int<long
        short i = 100;
        byte j = 2;
        int k = 4;

        long d = i + j + k;
        System.out.println(d); */

        /* 
       double one = 70;
       double two = 14.54;
       double three = 87;

       System.out.println("Ortalama:" + (one + two + three) / 3);

       float sayi1 = 70f;
       float sayi2 = 14.54f;
       float sayi3 = 87f;

       System.out.println("Ortalama2:" + (sayi1 + sayi2 + sayi3) / 3); */

    /*    char a = 'K';
       char b = 1500;
       char d = '\u0024';

       System.out.println(a);
       System.out.println(b);
       System.out.println(d);

       boolean c = true;
       boolean e = false;

       System.out.println(c);
       System.out.println(e);  */

    /*    String b = "üzerinden";
       long c = 100;
       String d = "sün";
       System.out.println("Sevgilim " + c + " " + b + " " + c + " " + d);

     
     String e = "?";
     String f = "Sen harika misin" + e;
     System.out.println(f);

     
     String h = "eylul " +
                "idil "
                + "ORUL";
                System.out.println(h);

                String j = "eylul\tidil\torul";
                System.out.println(j);

                String k = "eylul\nidil\norul";
                System.out.println(k); */


/*    System.out.println(5*2);        
    System.out.println(5+2);
    System.out.println(10/4);
    System.out.println(10d/4);   
    System.out.println(10/4.0);  */

    /* kalan operatörü için */

  /*   System.out.println(10 % 4); */

    /*arttırma ve azaltma operatörleri */

  /*  int a = 5;
    a += 3;
    System.out.println(a);
    int b = 5;
    b -= 3;
    System.out.println(b);

    int c = 5;
    c--;
    System.out.println(c);
    int d = 5;
    d++;
    System.out.println(d);

    int e = 4;
    System.out.println(++e);
    int f = 9;
    System.out.println(--f);  */



  /*   Scanner scanner = new Scanner(System.in); 
    System.out.println("Lütfen yasinizi giriniz:");
    int yas = scanner.nextInt();
    System.out.println("Yasiniz:" + yas); */

 /*    Scanner scanner = new Scanner(System.in);
    System.out.println("Lütfen isminizi giriniz:");
    String isim = scanner.nextLine();
    System.out.println("isim: " + isim); */


 /*   Scanner s = new Scanner(System.in);
int yasone = s.nextInt();
int yastwo = s.nextInt();
int yasthree = s.nextInt();

System.out.println("birinci yas: " + yasone + "   ikinci yas: " + yastwo + "   üçüncü yas: " + yasthree );  */

/*  Scanner s = new Scanner(System.in);

int yas = s.nextInt();
s.nextLine();

String isim = s.nextLine();

System.out.println("yas: " + yas);
System.out.println("isim: " + isim); */



// Beden Kitle İndeksi: Kilo / Boy*Boy
/* 
Scanner s = new Scanner(System.in);
System.out.println("Kilonuzu girin: " );
int kilo = s.nextInt();
System.out.println("Boyunuzu girin: ");
double boy = s.nextDouble();

double bki = kilo / ( boy * boy );

System.out.println("Beden Kitle İndeksiniz: " + bki ); */

//Bir aracın km'de ne kadar yaktığını, kaç km gittiğini ve toplam ne kadar ödemesi lazım bul.

/*   Scanner s = new Scanner(System.in);
System.out.print("Araciniz km de kaç kurus yakar? (Örnek: 0,35): ");
double kurus = s.nextDouble();
System.out.print("Kaç km yol gittiniz?: ");
int km = s.nextInt();

System.out.print("Toplam ödemeniz gereken tutar : " + (kurus * km) + " tl 'dir.");  */

/*   Scanner s = new Scanner(System.in);
int birinci_sayi;
int ikinci_sayi;
 System.out.print("Birinci Sayi: ");
 birinci_sayi = s.nextInt();
 System.out.print("ikinci sayi: ");
 ikinci_sayi = s.nextInt();
 System.out.println("Değerler değişiyor...");

 int geçici = birinci_sayi;
 birinci_sayi = ikinci_sayi;
 ikinci_sayi = geçici;

 System.out.println("Değitirildekten sonra: " + "birincisi: " + birinci_sayi + " ikincisi: " + ikinci_sayi); */

 //Dik üçgen hipotenüs bulma
 /*   Scanner s = new Scanner(System.in);
 int a;
 int b;
 System.out.print("Birinci Kenar: ");
 a = s.nextInt();
 System.out.print("İkinci kenar: ");
 b = s.nextInt();

 double h = Math.sqrt(a * a + b * b);
 System.out.println("Hipotenüs: " + h);  */

 
 //KARŞILAŞTIRMA OPERATÖRÜ
 /* == eşit mi
 != eşit değil mi
  > büyük mü
  >= büyük veya eşit mi */
 /*  System.out.println(3 == 3);
 System.out.println(4 >= 4);
 System.out.println("Mehmet" == "Mehmet");
 System.out.println(3 == 3 && 2 < 1); // bütün şıklar true ise true 
 System.out.println(2 < 3 || 2 == 3); // sadece bir şık true ise true
 System.out.println(! (3 < 4));    */


/* 
 Scanner s = new Scanner(System.in);
 System.out.println("lütfen yasınızı giriniz: ");
 int yas = s.nextInt();
 
 if (yas < 18) {
    System.out.println("Bu mekana giremezsiniz...");
 } else {
    System.out.println("Hosgeldiniz...");
 } */


 //hesap makinesi switch case ile
/* 
 Scanner s = new Scanner(System.in);
 System.out.println("*******************************");
 String islemler = "(1) numara için: toplama işlemi\n"
 + "(2) numara için: çıkarma işlemi\n"
 + "(3) numara için: çarpma işlemi\n"
 + "(4) numara için: bölme işlemi";
 System.out.println(islemler);
 System.out.println("*******************************");
 System.out.println("islem seçiniz");
 String islem = s.nextLine();

int a;
int b;

 switch(islem) {
    case "1":
    System.out.print("birinci sayi: ");
    a = s.nextInt();
    System.out.print("ikinci sayi: ");
    b = s.nextInt();
    System.out.println("Sonuc: " + ( a + b ));
    break;
    case "2":
    System.out.print("birinci sayi: ");
    a = s.nextInt();
    System.out.print("ikinci sayi: ");
    b = s.nextInt();
    System.out.println("Sonuc: " + ( a - b));
    break;
    case "3":
    System.out.print("birinci sayi: ");
    a = s.nextInt();
    System.out.print("ikinci sayı: ");
    b = s.nextInt();
    System.out.println("Sonuc: " + ( a * b));
    break;
    case "4":
    System.out.print("birinci sayi: ");
    a = s.nextInt();
    System.out.print("ikinci sayi: ");
    b = s.nextInt();
    System.out.println("Sonuc: " + ( (double)a / b ));
    break;
    default:
    System.out.println("Gecersiz islem...");
 }
*/

// gelişmiş bir not hesaplama
/* 
Scanner s = new  Scanner(System.in);
System.out.print("1. Vize: ");
int vizebir = s.nextInt();
System.out.print("2. Vize: ");
int vizeiki = s.nextInt();
System.out.print("Final: ");
int finalnot = s.nextInt();
System.out.print("Not Ortalması: ");
double notort = s.nextDouble();
double toplamnot = ( vizebir * 3 / 10.0 ) + ( vizeiki * 3 / 10.0 ) + ( finalnot * 4 / 10.0 );
 if ( toplamnot >= 90) {
    System.out.println("Notunuz: AA");
 }
 else if ( toplamnot >= 85 ) {
    System.out.println("Notunuz: AB");
 }
 else if ( toplamnot >= 80 ) {
    System.out.println("Notunuz: BB");
 }
 else if ( toplamnot >= 75 ) {
    System.out.println("Notunuz: BC");
 }
 else if ( toplamnot >= 70 ) {
    System.out.println("Notunuz: CC");
 }else if ( toplamnot >= 65 ) {
    System.out.println("Notunuz: DC");
 }
 else if ( toplamnot >= 60 ) {
    System.out.println("Notunuz: DD");
    if ( notort < 2.50) {
        System.out.println("Notunuz ve not ortalamanız düsük. Bu dersi tekrardan almayı düsünebilirsiniz.");
    }
 } else {
    System.out.println("Notunuz: FF, Bu dersten kaldiniz...");
 }
   */
  
   
   //DÖNGÜLER 
   //faktöriyel hesaplama
   /* 

   Scanner s = new Scanner(System.in);

   System.out.print("Schreiben Sie eine Zahl: ");
   int faktoriyel = 1;
   int zahl = s.nextInt();

   for (int i = 1; i <= zahl; i++ ) {
    faktoriyel = faktoriyel * i;
   }

   System.out.println("Fakultat = " + faktoriyel); */
   
// while ve for farkı

/* 
for ( int i = 0; i <= 10; i++ ) {
    System.out.println("i = " + i );
}

int a = 0;
while( a < 10) {
    System.out.println("a = " + a);
    a++;
}

int b = 10;
while( b < 100 ) {
    System.out.println("b = " + b);
    b *= 2;
} */

/* 
Scanner s = new Scanner(System.in);

System.out.println("Schreiben sie eine Zahl: "); // sayı 1234 ve rakamları toplamı 10 olacak.
int zahl = s.nextInt();
int toplam = 0;
// do koşulsuz olarak döngüyü devam ettirir. while koşul sağlandığı sürece gerçekleşir.
do { 
    toplam += zahl % 10; // sayıyı eğer 10 a bölersek son basamaktaki yani birler basamağındaki sayıyı öğreniriz. bu da bizim kalanımız olur. o yüzden % işaretiyle işlem yapılır. kalanı yani birler basamağındaki sayıyı toplama eşitlersek ilk önce sayının sağdaki rakamı toplam olur ve bu döngü böyle devam eder.
    zahl /= 10;// döngüyü devam ettirmek içinde sayıyı doğrudan 10 a böleriz ve 1234 sayısından 4 elendiğinde geriye 123 kalır. döngü bu sayı üzerinden devam eder.
    System.out.println(" Zahl = " + zahl ); // açıklamalarda yazan işlemleri görmek için bu eklenebilir ama gerekli değil.
} while (zahl > 0); 

System.out.println("Summe der Ziffern der Zahl = " + toplam); */



// break ve continue: break döngüyü söylenen koşulda keser ve sonrasına karışmaz döngü devam eder. ama continue belirtilen koşulda döngüyü keser ve o koşuldan sonrasında döngünün devam etmesine izin vermez döngü başa dönerek devam eder.

/*  for ( int i = 0; i < 10; i++) {
    if ( i == 3 ) {
        continue; // döngüyü 3te kesti, başa döndü ve 3'ü atlayarak sayıyı arttırdığında 2 den sonra 4 geldi döngü başa dönerek devam etti.
    }

    System.out.println("i = " + i);
} */
/*  int i = 0;
while (i < 10) {
    if ( i == 3) {
        i++; // continue döngüyü 3 te kesti ve başa döndü. eğer aşağıda i++ olmasına rağmen buraya da i++ koymasaydık continue 3 te kesip başa döndüğünde döngü biterdi. 4,5.... olmazdı.
        continue;
    }
    System.out.println("i = " + i);
    i++;
}*/






// while ve döngülerle ile atm yapma
/* 
Scanner s = new Scanner(System.in);
int bakiye = 1000;
String islemler = "1. Islem: Bakiye Ogrenme\n"
+ "2. Islem: Para Cekme\n"
+ "3. Islem: Para Yatırma\n"
+ "Cikis icin p ' ya basın";

System.out.println("*********************");
System.out.println( islemler );
System.out.println("*********************");

while (true) {
    System.out.print("Islemi seciniz: ");
    String islem = s.nextLine();
    
    if (islem.equals("q")) {
        System.out.println("Programdan cikiliyor.....");
        break;
    } else if (islem.equals("1")) {
        System.out.println("Bakiyeniz: " + bakiye );
    } else if (islem.equals("2")) {
        System.out.print("Cekmek istediginiz tutar: ");
        int tutar = s.nextInt();
        s.nextLine();

        if ( bakiye < 0 ) {
            System.out.println("Bakiyeniz Yetersiz....");
        } else {
            bakiye -= tutar;
            System.out.println("Yeni bakiyeniz: " + bakiye );
        }

    } else if (islem.equals("3")) {
        System.out.print("Yatirmak istediginiz tutar: ");
        int tutar = s.nextInt();
        s.nextLine();
        bakiye += tutar;
        System.out.println("Yeni Bakiyeniz: " + bakiye );
    } else {
        System.out.println("Gecersiz Islem...");
    }
    
} 
    */




    // ONEMLİ : ARMSTRONG SAYISI HESAPLAMA 
    /* 
    Scanner s = new Scanner(System.in);

    System.out.print("Bir sayi giriniz: ");
    int sayi = s.nextInt();
    System.out.print("Basamak sayisini giriniz: ");
    int basamak_sayisi = s.nextInt();
    
    int gecici_sayi = sayi;
    int toplam = 0;
    
    do { 
        int basamak_degeri = (gecici_sayi % 10);
        gecici_sayi /= 10;

        toplam += Math.pow(basamak_degeri, basamak_sayisi);
        
    } while ( gecici_sayi > 0);
    if ( sayi == toplam ) {
        System.out.println("Sayi bir armstrong sayisidir.");
    } else {
        System.out.println("Sayi bir armstrong sayisi degildir.");
    } */
   






    // for döngülerini iç içe kullanarak çarpım tablosu

   /*  for (int i = 1; i <=10 ; i++) {
        System.out.println("********************************");
        for (int j = 1; j <=10 ; j++ ) { // bu for döngüsünün içindeki döngü. i=1 iken j=1 olacak, i=1 iken j=2 olacak, i=1 iken j=3 olacak ve bu şekilde j 10 olana kadar devam edecek. j 10 olunca bu for döngüsü bitecek ve döngü tekrar i'yi tanımladığımız for döngüsüne gelecek baştan başlayacak. bu durumda i=2 iken j=1, i=2 iken j=2, i=2 iken j=3 olarak j döngüsünü baştan başlatacak. Yani içerdeki döngü bitmeden dışardaki döngü bir sonrakin adıma geçemez. ve dışardaki döngü her bir adım ilerleyişinde içerdeki ffor döngüsü başlar ve biter.
            System.out.println( i + " x " + j + " = " + ( i * j ));
        } System.out.println("********************************");
    } */

/* 
    @SuppressWarnings("resource")
    Scanner s = new Scanner(System.in);

    int giris_hakki = 3;
    String sys_kullanici_adi = "idil orul";
    String sys_parola = "12345";

    System.out.println("***************************************");
    System.out.println("Kullanici girisine hosgeldiniz...");
    System.out.println("***************************************");

    while (true) { 
        System.out.print("Kullanici Adiniz: ");
        String kullanici_adı = s.nextLine();
        System.out.print("Parolaniz: ");
        String parola = s.nextLine();

        if (kullanici_adı.equals(sys_kullanici_adi) && parola.equals(sys_parola)) {
            System.out.println("Sisteme Hosgeldiniz...");
            break;
        } else if (kullanici_adı.equals(sys_kullanici_adi) && !parola.equals(sys_parola)) {
            System.out.println("Parolaniz yanlis...");
            giris_hakki -= 1;
            System.out.println("Giris hakkiniz: " + giris_hakki);
        } else if (!kullanici_adı.equals(sys_kullanici_adi) && parola.equals(sys_parola)) {
            System.out.println("Kullanici Adiniz yanlis...");
            giris_hakki -= 1;
            System.out.println("Giris hakkiniz: " + giris_hakki);
        } else {
            System.out.println("Kullanici adiniz ve parolaniz yanlis...");
            giris_hakki -= 1;
            System.out.println("Giris hakkiniz: " + giris_hakki);
        }

        if (giris_hakki == 0 ) {
            System.out.println("Giris hakki bitti, sistemden cikarildiniz.");
            break;
        }
        
    } */









    ////// FAİZ ORANI
  /*   Scanner s = new Scanner(System.in);
    System.out.println("Bankamiza hosgeldiniz. Faiz oranimiz %6' dir.");
    System.out.print("Yatirmak istediginiz parayi girin: ");
    int anapara = s.nextInt();
    System.out.println("Kac yil vade ile yatirmak istersiniz?: ");
    int vade = s.nextInt();
    
    int toplampara = anapara;
    double faizOrani = 0.06;
     

    for ( int i = 1; i <= vade ; i++) {
        toplampara = (int) (( toplampara * faizOrani ) + toplampara);
        System.out.println( i + ". yilin sonunda toplam para " + toplampara + " tl' dir.");
    } */


    ///// EN ÜSTTEKİ MAİN İ BURDAN SONRA KAPATTIM.


   // }





   /// Metodlar
/* 
   public static void bkİndeks ( double a, double b) {
    System.out.println("Beden kitle indeksiniz: " + (a / Math.pow(b, b)));
   }
   public static void main(String[] args) throws Exception {
    bkİndeks(55, 1.59);
   } */

   




   ///// metodlarda return
  /*  public static int ikiilecarp (int a) {
    return a * 2;
   }
   public static int yirmiiletopla (int a) {
    return a + 20;
   }
   public static int karesinial ( int a) {
    return a * a;
   }


   public static void main(String[] args) throws Exception {
    System.out.println("Sonuc: " + karesinial(yirmiiletopla(ikiilecarp(2))));
   } */

/* 
   public static boolean asalmi (int sayi) {
    for (int i = 2; i < sayi; i++) {
        if ( sayi % i == 0 ) {
            return false;
        } 
    } return true;
   }

   public static void main(String[] args) {
       for ( int i = 2; i < 100; i++) {
        if (asalmi(i)) {
            System.out.println(i);
        }
       }
   } */







   /* 
   public static void main(String[] args)  {
    Account account1 = new Account();
    Account account2 = new Account("123456", 1000.0, "idil orul", "idil.e.o@gmail.com", "789456123");

    account2.paraYatir(500);
    account2.paraCekme(900);
    account2.paraCekme(1600);
    account2.paraCekme(800);
    

   }*/
  





   // Hesap.java, Login.java, Atm.java = ATM projekt
 /*
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Hesap hesap = new Hesap("idil orul", "123456", 2000);
        Atm atm = new Atm();
        atm.calis(hesap, s);
        System.out.println("Programdan Cikiliyor...");
    } */








    
// İdman Programı = idman.java
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("idman programina hosgeldiniz...");
        String idmanlar = """
        Gecerli idmanlar...
        Burpee
        Pushup
        Situp
        Squat
        """;
        System.out.println(idmanlar);
        System.out.println("bir idman oluşturun...");

        System.out.print("Burpee sayisi: ");
        int burpee = s.nextInt();
        s.nextLine();
        System.out.print("Pushup sayisi: ");
        int pushup = s.nextInt();
        s.nextLine();
        System.out.print("Situp sayisi: ");
        int situp = s.nextInt();
        s.nextLine();
        System.out.print("Squat sayisi: ");
        int squat = s.nextInt();
        s.nextLine();

        Idman idman = new Idman(burpee, pushup, situp, squat);

        System.out.println("idmaniniz baslatiliyor...");

        while (idman.idmanBittiMi() == false) {
            System.out.print("Hareket türü(Burpee, Pushup, Situp, Squat): ");
            String tur = s.nextLine();
            System.out.print("Bu hareketten kac tane yapmak istersiniz?: ");
            int sayi = s.nextInt();
            s.nextLine();
            idman.hareketYap(tur, sayi);
        }
        System.out.println("Tebrikler! Tüm idmaninizi tamamladiniz.");


    }



}


