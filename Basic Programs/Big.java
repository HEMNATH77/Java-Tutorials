import java.util.Scanner;

class Big {
public static void main(String[]args) {
 Scanner Sc = new Scanner(System.in);

 System.out.print("Enter A : ");
 int a = Sc.nextInt();

 System.out.print("Enter B : ");
 int b = Sc.nextInt();

 if(a > b)
 System.out.println(a + " is Bigger");

 else if(b > a)
 System.out.println(b + " is Bigger");
 
 else 
 System.out.println("Both are Equal");

 Sc.close();

}
}