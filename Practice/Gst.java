import java.util.Scanner;
class Gst{
public static void main(String[] args){

Scanner Sc = new Scanner(System.in);
System.out.print("Enter the price  : ");
int price = Sc.nextInt();

double c = 9.0 / 100;
double s = 11.0/ 100;

double cgst = price * c;
double sgst = price * s;

double total = price + cgst + sgst;

System.out.println("CGST : "+cgst);
System.out.println("SGST : "+sgst);
System.out.println("Total : "+total);

Sc.close();

}
}