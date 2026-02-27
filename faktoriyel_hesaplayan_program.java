import java.util.Scanner;

public class faktoriyel_hesaplayan_program {

    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);
        int sayi;
        int sonuc;
        System.out.printf("Bir sayi giriniz= ");
        sayi = girdi.nextInt();
        sonuc = faktoriyel(sayi);
        System.out.printf("%d!= %d", sayi, sonuc);
    }

    public static int faktoriyel(int sayi) {
        int i;
        int faktoriyel;
        faktoriyel = 1;
        for (i = 1; i <= sayi; i++) {
            faktoriyel = faktoriyel * i;
        }
        return faktoriyel;
    }

}
