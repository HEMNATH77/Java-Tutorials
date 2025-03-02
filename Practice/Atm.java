import java.util.Scanner;
class Atm{
public static void main(String []args){

Scanner Sc = new Scanner(System.in);

System.out.print("Enter no.of. Rs:100 you want : ");
int a = Sc.nextInt();

System.out.print("Enter no.of. Rs:500 you want : ");
int b = Sc.nextInt();

System.out.print("Enter no.of. Rs:500 you want : ");
int c = Sc.nextInt();

int d = (a*100) + (b*500) + (c*1000);
System.out.println("Total withdrawn amount : Rs "+d);
Sc.close();
}
}