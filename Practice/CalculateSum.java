import java.util.Scanner;
class CalculateSum{
public static void main(String []args){

Scanner Sc = new Scanner(System.in);
int sum = 0;
System.out.print("Enter the M : ");
int M = Sc.nextInt();

System.out.print("Enter the N : ");
int N = Sc.nextInt();

for (int i = M; i <= N; i++){

sum +=i;
}

System.out.println("Sum = "+sum);
Sc.close();

}
}