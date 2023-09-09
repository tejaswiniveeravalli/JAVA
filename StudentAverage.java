import java.io.*;
import java.util.*;
public class StudentAverage {
public static void main(String args[]){
System.out.println("Enter marks of 3 subjects");
Scanner sc=new Scanner(System.in);
int m1=sc.nextInt();
int m2=sc.nextInt();
int m3=sc.nextInt();
int total=m1+m2+m3;
float avg =(float)total/3;
if(avg>=75) {
System.out.println("Your passed in distinction:");
}
else if(avg>=60&&avg<75) {
System.out.println("Student passed in first class");
}
else if(avg>=50&&avg<60) {
System.out.println("Student passed in second class");
}
else if(avg>=40&&avg<50) {
System.out.println("Student passed in third class");
}
else {
System.out.println("Failed");
}
}
}