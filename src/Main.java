import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        while (true){
            System.out.println("Hangisinin alanını Hesaplamak istiyorsunuz \n 1. Kare \n 2. Dikdörtgen \n 3. Daire");
            int deger = scanner.nextInt();

            switch (deger){
                case 1:
                    System.out.println("a Kenarını giriniz");
                    int a =  scanner.nextInt();
                    int sonuc = a*a;
                    System.out.println("Kareninizin alanı : " + sonuc + "\n");
                    break;

                case 2:
                    System.out.println("a Kenarını giriniz");
                    int aK = scanner.nextInt();
                    System.out.println("b Kenarını giriniz");
                    int bK = scanner.nextInt();
                    int sonucD = aK*bK;
                    System.out.println("Diktörtgeninizin alanı : " + sonucD + "\n");
                    break;

                case 3:
                    System.out.println("Daire Yarıçapını giriniz : ");
                    double yD = scanner.nextDouble();
                    double sonmucY = Math.PI * yD *yD;
                    System.out.println("Dairenizin alanı : " + sonmucY + "\n");
                    break;



            }

        }

    }
}