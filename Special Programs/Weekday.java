import java.util.Scanner;
class Weekday{
public static void main(String[]args){

Scanner Sc = new Scanner(System.in);
System.out.println("Enter the Number : ");

int num = Sc.nextInt();

String Week = getWeekName(num);
System.out.println(Week);

Sc.close();

}

public static String getWeekName (int num){

switch(num){
  case 1:
         return "Monday";
         
  case 2:
         return "Tuesday";
        
  case 3:
         return "Wednesday";
        
  case 4:
         return "Thursday";
         
  case 5:
        return "Friday";
        
  case 6:
        return "Saturday";
        
  case 7:
        return "Sunday";
       
  default:
        return "Give numbers from 1-7";

}

}

}
