import java.io.*;
public class CmdLineArgumentsV2 {
    public static void main(String args[]) {
        if(args.length!=2){
            System.out.println("Invalid no of arguments \n we need to pass integers");
        }
        else {
            int x=Integer.parseInt(args[0]);
            int y=Integer.parseInt(args[1]);
            int z=x+y;

            System.out.println("Sum of x+y = " + z);
        }
    }
     
}