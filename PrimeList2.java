import java.util.*;
public class PrimeList2 {

  public static void main(String[] args) {
    int i,j;
    System.out.println("Enter the range to display prime numbers");
    Scanner sc=new Scanner(System.in);
    int low =sc.nextInt();
    int high=sc.nextInt();
    System.out.println("Theprime numbers between "+low+" and "+high+" are :");
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
