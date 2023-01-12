import java.util.Scanner;

public class BoyKiloIndeksi {
    public static void main(String[] args) {
        double kilo, boy;

        Scanner girdi=new Scanner(System.in);
        System.out.println("Kilonuzu giriniz   :");
        kilo=girdi.nextInt();
        System.out.println("Boyunuzu giriniz   :");
        boy=girdi.nextDouble();
       double indeks=(kilo/(boy*boy));
        System.out.println("Vücut kitle indeksiniz   :"+indeks);

    }
}
