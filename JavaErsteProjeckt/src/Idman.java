
public class Idman {
    private int burpee__sayisi;
    private int pushup__sayisi;
    private int situp__sayisi;
    private int squat__sayisi;

    public Idman( int burpee__sayisi, int pushup__sayisi, int situp__sayisi, int squat__sayisi ) {
        this.burpee__sayisi = burpee__sayisi;
        this.pushup__sayisi = pushup__sayisi;
        this.situp__sayisi = situp__sayisi;
        this.squat__sayisi = squat__sayisi;
    }

    public int getBurpee__sayisi() {
        return burpee__sayisi;
    }

    public void setBurpee__sayisi(int burpee__sayisi) {
        this.burpee__sayisi = burpee__sayisi;
    }

    public int getPushup__sayisi() {
        return pushup__sayisi;
    }

    public void setPushup__sayisi(int pushup__sayisi) {
        this.pushup__sayisi = pushup__sayisi;
    }

    public int getSitup__sayisi() {
        return situp__sayisi;
    }

    public void setSitup__sayisi(int situp__sayisi) {
        this.situp__sayisi = situp__sayisi;
    }

    public int getSquat__sayisi() {
        return squat__sayisi;
    }

    public void setSquat__sayisi(int squat__sayisi) {
        this.squat__sayisi = squat__sayisi;
    }

    public void hareketYap(String hareketTuru, int sayi) {
        switch (hareketTuru) {
            case "Burpee" -> burpeeYap(sayi);
            case "Pushup" -> pushupYap(sayi);
            case "Situp" -> situpYap(sayi);
            case "Squat" -> squatYap(sayi);
            default -> System.out.println("Gecersiz hareket...");
        }
    }
    

    public void burpeeYap(int sayi) {
        if (burpee__sayisi == 0) {
            System.out.println("Burpee sayiniz tamamlandı.");
        }
        if (burpee__sayisi - sayi < 0) {
            System.out.println("Hedeflediginiz burpee sayisini gectiniz, tebrikler...");
        } else {
            burpee__sayisi -= sayi;
            System.out.println("Kalan burpee sayiniz = " + burpee__sayisi);
        }
    }

    public void pushupYap(int sayi) {
        if (pushup__sayisi == 0) {
            System.out.println("Pushup sayiniz tamamlandı.");
        }
        if (pushup__sayisi - sayi < 0) {
            System.out.println("Hedeflediginiz pushup sayisini gectiniz, tebrikler...");
        } else {
            pushup__sayisi -= sayi;
            System.out.println("Kalan pushup sayiniz = " + pushup__sayisi);
        }
    }

    public void situpYap(int sayi) {
        if (situp__sayisi == 0) {
            System.out.println("Situp sayiniz tamamlandı.");
        }
        if (situp__sayisi - sayi < 0) {
            System.out.println("Hedeflediginiz situp sayisini gectiniz, tebrikler...");
        } else {
            situp__sayisi -= sayi;
            System.out.println("Kalan situp sayiniz = " + situp__sayisi);
        }
    }

    public void squatYap(int sayi) {
        if (squat__sayisi == 0) {
            System.out.println("Squat sayiniz tamamlandı.");
        }
        if (squat__sayisi - sayi < 0) {
            System.out.println("Hedeflediginiz squat sayisini gectiniz, tebrikler...");
        } else {
            squat__sayisi -= sayi;
            System.out.println("Kalan squat sayiniz = " + squat__sayisi);
        }
    }

    public boolean idmanBittiMi() {
        return ( burpee__sayisi == 0 ) && ( pushup__sayisi == 0 ) && ( situp__sayisi == 0 ) && ( squat__sayisi == 0 );
    }
}
