import java.util.*;
public class PrimeList1 {

  public static void main(String[] args) {
    int i,j;
    int low=23,high=99;
    for(j=low;j<=high;j++){
    boolean flag = false;
    for ( i = 2; i <= j/ 2; i++) {
      // condition for nonprime number
      if (j % i == 0) {
        flag = true;
        break;
      }
    }

    if (!flag){
      System.out.print(j+" ");
    }
    }
  }
}
