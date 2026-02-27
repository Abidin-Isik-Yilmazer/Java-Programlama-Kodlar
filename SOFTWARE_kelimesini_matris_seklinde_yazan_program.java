public class SOFTWARE_kelimesini_matris_seklinde_yazan_program {
  public static void main(String[] args){
    char[] karakter={'S','O','F','T','W','A','R','E'};
    int i,j;
    for(i=0;i<8;i++){
      for(j=i;j<8;j++){
        System.out.printf("%c ",karakter[j]);
      }
      for(j=0;j<i;j++){
        System.out.printf("%c ",karakter[j]);
      }
      System.out.printf("\n");
    }
  }
}
