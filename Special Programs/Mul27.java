import java.util.Scanner;

class Mul27 {

public static void main(String[]args){

Scanner Sc = new Scanner(System.in);
System.out.print("Enter A : ");
int a = Sc.nextInt();

if (a % 27 == 0)
System.out.println("Multiple of 27");

else
System.out.println("Not multiple of 27");

}
}