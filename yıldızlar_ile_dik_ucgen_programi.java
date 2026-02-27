import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner girdi1=new Scanner(System.in);

        int satir;
        int i;
        int j;

        System.out.printf("Ucgenin satir sayisini giriniz= ");
        satir=girdi1.nextInt();

        for(i=0;i<satir;i++){
            for(j=0;j<=i;j++){
                System.out.printf("*");
            }
            System.out.printf("\n");
        }
    }
}
