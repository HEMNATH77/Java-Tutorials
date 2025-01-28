
import java.util.Scanner;

class Sumeven {

public static void main(String[]args) {

Scanner Sc = new Scanner(System.in);

System.out.print("Enter A : ");
int A = Sc.nextInt();
System.out.print("Enter B :");
int B = Sc.nextInt();

int C = A+B;
if(C%2 ==0)
System.out.println("Divided by 2");
else
System.out.println("Not Divided by 2");
}
}