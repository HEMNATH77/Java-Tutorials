import java.util.Scanner;

class Phoneno{
public static void main(String[] args){

Scanner Sc = new Scanner(System.in);
System.out.print("Enter the Phone Number : ");
long phonenumber = Sc.nextLong();
System.out.println("Phone number : "+phonenumber);

Sc.close();
}
}