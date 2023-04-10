import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Kullanıcı Adını Girin");
        String kullaniciAdi = input.nextLine();

        System.out.println("Şifrenizi Girin");
        String sifre = input.nextLine();

        if (kullaniciAdi.equals("abdurrahman") && sifre.equals("123456")) {
            System.out.println("ATM'ye Hoş Geldiniz!");
            int bakiye = 3000;

            int secim;
            do {
                // menüyü yazdır
                System.out.println("Yapmak istediğiniz işlemi seçin:");
                System.out.println("1- Para Çek");
                System.out.println("2- Para Yatır");
                System.out.println("3- Bakiye Sorgula");
                System.out.println("4- Kart Iade");
                System.out.println("Seçiminiz (1-4): ");
                secim = input.nextInt();

                switch (secim) {
                    case 1: // para çekme
                        System.out.print("Çekmek istediğiniz miktar: ");
                        int miktar = input.nextInt();
                        if (miktar > bakiye) {
                            System.out.println("Bakiye yetersiz.");
                        } else {
                            bakiye -= miktar;
                            System.out.println(miktar + " TL çektiniz. Yeni bakiyeniz: " + bakiye + " TL");
                        }
                        break;
                    case 2: // para yatırma
                        System.out.print("Yatırmak istediğiniz miktar: ");
                        miktar = input.nextInt();
                        bakiye += miktar;
                        System.out.println(miktar + " TL yatırdınız. Yeni bakiyeniz: " + bakiye + " TL");
                        break;
                    case 3: // bakiye sorgulama
                        System.out.println("Bakiyeniz: " + bakiye + " TL");
                        break;
                    case 4: // kart iade
                        System.out.println("Kartınız iade ediliyor. Tekrar görüşmek üzere!");
                        break;
                    default:
                        System.out.println("Geçersiz seçim. Lütfen 1-4 arasında bir seçim yapın.");
                }

            } while (secim != 4); // kart iade işlemi seçilene kadar devam et
        } else {
            System.out.println("Hatalı kullanıcı adı veya şifre. Lütfen tekrar deneyin.");
        }
    }
}
