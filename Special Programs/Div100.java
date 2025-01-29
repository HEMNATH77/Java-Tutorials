import java.util.Scanner;

class Div100 {

public static void main(String[]args){

Scanner Sc = new Scanner(System.in);
System.out.print("Enter A : ");
int a = Sc.nextInt();

if (a % 100 == 0)
System.out.println("Multiple of 100");

else
System.out.println("Not Multiple of 100");

}
}