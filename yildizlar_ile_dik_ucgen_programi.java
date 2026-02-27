import java.util.Scanner;

public class yildizlar_ile_dik_ucgen_programi {
    public static void main(String[] args){
        Scanner girdi=new Scanner(System.in);
        int satir;
        int i;
        int j;
        System.out.printf("Ucgenin satir sayisini giriniz= ");
        satir=girdi.nextInt();
        for(i=0;i<satir;i++){
            for(j=0;j<=i;j++){
                System.out.printf("*");
            }
            System.out.printf("\n");
        }
    }
}



