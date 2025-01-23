



import java.util.Scanner;

class Age {
public static void main (String[]args) {

Scanner Sc = new Scanner(System.in);
System.out.print("Enter the Age : ");
int age = Sc.nextInt();

if(age <=12)
System.out.println("Child");

else if (age >=13 && age <=19)
System.out.println("Teenager");


else if(age>=20 && age<=64)
System.out.println("Adult");


else if(age>64)
System.out.println("Senior");

else
System.out.println("Doesn't Exist");


Sc.close();
}
}