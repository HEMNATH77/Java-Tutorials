import java.util.Scanner;

class Great4 {

public static void main(String[]args) {

Scanner Sc = new Scanner(System.in);

System.out.print("Enter A : ");
int A = Sc.nextInt();
System.out.print("Enter B:");
int B = Sc.nextInt();
System.out.print("Enter C:");
int C = Sc.nextInt();
System.out.print("Enter D:");
int D = Sc.nextInt();

if(A>B)
System.out.println("A is Greater");
else
System.out.println("B is Greater");
if(B>C)
System.out.println("B is Greater");
else
System.out.println("C is Greater");
if(A>C)
System.out.println("A is Greater");
else
System.out.println("C is Greater");
if(A>D)
System.out.println("A is Greater");
else
System.out.println("D is Greater");
if(B>D)
System.out.println("B is Greater");
else
System.out.println("D is Greater");
if(C>D)
System.out.println("C is Greater");
else
System.out.println("D is Greater");

Sc.close();
}
}