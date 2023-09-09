import java.io.*;
public class CmdLineArgumentsV3 extends Object {
    public static void main(String args[]) {
        CmdLineArgumentsV3 ob=new CmdLineArgumentsV3();
        if(args.length!=2){
            System.out.println("Invalid no of arguments \n we need to pass integers");
        }
        else {
            int x=Integer.parseInt(args[0]);
            int y=Integer.parseInt(args[1]);
            int z=x+y;
            System.out.println("the Class name is : "+ob.getClass());
            System.out.println("Sum of x+y = " + z);
        }
    }
     
}