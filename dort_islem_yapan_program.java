import java.util.Scanner;

public class dort_islem_yapan_program {
    public static void main(String[] args){
        Scanner girdi1=new Scanner(System.in);
        Scanner girdi2=new Scanner(System.in);
        float sayi1;
        float sayi2;

        System.out.printf("Birinci sayiyi girin= ");
        sayi1=girdi1.nextFloat();
        System.out.printf("Ikinci sayiyi girin= ");
        sayi2=girdi2.nextFloat();

        dort_islem(sayi1,sayi2);
    }

    public static void dort_islem(float sayi1,float sayi2){
        float toplam;
        float fark;
        float carpim;
        float bolum;

        toplam=sayi1+sayi2;
        fark=sayi1-sayi2;
        carpim=sayi1*sayi2;
        bolum=sayi1/sayi2;

        System.out.printf("Toplam= %f\n",toplam);
        System.out.printf("Fark= %f\n",fark);
        System.out.printf("Carpim= %f\n",carpim);
        System.out.printf("Bolum= %f",bolum);
    }
}
