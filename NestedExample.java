import java.io.*;
import java.util.*;
public class NestedExample {
public static void main(String args[]) {
Scanner sc=new Scanner(System.in);
System.out.println("Enter marks of 3 subjects:");
int m1=sc.nextInt();
int m2=sc.nextInt();
int m3=sc.nextInt();
int total=m1+m2+m3;
float avg =(float)total/3;
if(avg>=75) {
if(avg>=95) {
System.out.println("Your average is in top 5 percentage");
}
else if(avg>=90) {
System.out.println("Your average is in 10 percent");
}
else {
System.out.println("Student passed in distinction");
}
}
else if(avg>=40&&avg<75) {
System.out.println("Student passed");
}
else {
System.out.println("Failed");
}
}
}