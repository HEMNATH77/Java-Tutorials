import java.util.Scanner;

class Leapyear {
public static void main(String[]args) {

Scanner Sc = new Scanner(System.in);

System.out.print("Enter the year : ");

int year = Sc.nextInt();

if(year % 4 == 0 && year % 400 == 0 || year%100 != 0)
System.out.print("Leap Year");
else
System.out.print("Normalyear");


Sc.close();
} 
}