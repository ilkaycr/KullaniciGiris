package KosulluIfadeler;

import java.util.Scanner;

public class KullanıcıGiris {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String kayitliSifre = "sifre"; // Kayıtlı şifre (örnek olarak)

        System.out.print("Kullanıcı Adı: ");
        String kullaniciAdi = scanner.nextLine();

        System.out.print("Şifre: ");
        String sifre = scanner.nextLine();

        if (kullaniciAdi.equals("kullanici") && sifre.equals(kayitliSifre)) {
            System.out.println("Giriş başarılı!");
        } else {
            System.out.println("Kullanıcı adı veya şifre yanlış.");
            System.out.print("Şifrenizi sıfırlamak ister misiniz? (E/H): ");
            String cevap = scanner.nextLine();
            if (cevap.equalsIgnoreCase("E")) {
                System.out.print("Yeni Şifre: ");
                String yeniSifre = scanner.nextLine();

                System.out.println(kayitliSifre);
                if (kayitliSifre.equals(yeniSifre)){
                    System.out.println("Yeni girdiğiniz şifre öncekiyle aynı olamaz.");
                    System.out.print("Yeni Şifre: ");
                    yeniSifre = scanner.nextLine();
                    kayitliSifre = yeniSifre;
                    //System.out.println(kayitliSifre);


                }
                else {
                    kayitliSifre = yeniSifre;
                    System.out.println("Şifre başarıyla değiştirildi.");
                    //System.out.println(kayitliSifre);
                }

            }
        }



    }
}
