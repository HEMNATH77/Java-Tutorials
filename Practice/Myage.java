import java.util.Scanner;
class Myage{
public static void main(String []args){

Scanner Sc = new Scanner(System.in);

System.out.print("Enter Current Year : ");
int c_year = Sc.nextInt();

System.out.print("Enter Birth  Year : ");
int b_year = Sc.nextInt();

int age = c_year - b_year;

System.out.println(" Age : "+age); 



}
}