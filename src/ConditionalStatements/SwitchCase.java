package ConditionalStatements;

import java.util.Scanner;
public class SwitchCase {
    public static void main(String[] args) {
         Scanner input= new Scanner(System.in);

         //Basic Calculator
          System.out.println("enter character");
          String character=input.next();
          System.out.println("enter numbers");
          int num1=input.nextInt(),num2=input.nextInt();
          switch(character){
              case "+":
              System.out.println(num1+num2);
              break;
              case "-":
              System.out.println(num1-num2);
              break;
              case "*":
              System.out.println(num1*num2);
              break;
              case "/":
              System.out.println(num1/num2);
              break;
              case "%":
              System.out.println(num1%num2);
              break;
              default:
              System.out.println("error");
          }



          //Even or odd
          System.out.println("Enter a number");
          int num=input.nextInt();
          switch(num%2){
              case 0:
              System.out.println("even");
              break;
              default:
              System.out.println("odd");
          }




          //Valid Triangle or not
          System.out.println("Enter triangle sides");
          int side1=input.nextInt(),side2=input.nextInt(),side3=input.nextInt();
          if(side1>0 && side2>0 && side3>0){
          switch(side1+side2+side3){
              case 180:
              System.out.println("valid");
              break;
              default:
              System.out.println("invalid");
          }

      }
      else{
          System.out.println("wrong operation");
      }


//Leap years in a range
     //     System.out.println("enter start and end of range");
     // int start=input.nextInt(),end=input.nextInt(),i;
     // System.out.println("Leap years are: ");
     // for(i=start;i<=end;i++){
     //     if(i%4==0 && i%100!=0 || i%400==0){
     //         System.out.println(i);
     //     }

     // }
     // System.out.println("Not leap years are: ");
     // for(i=start;i<=end;i++){
     //     if(i%4==0 && i%100!=0 || i%400==0){
     //         continue;
     //     }
     //     else{
     //         System.out.println(i);
     //     }

     // }


        //Days in a week
          System.out.println("enter week number");
          int num3=input.nextInt();
          switch(num3){
              case 1:
              System.out.println("monday");
              break;
              case 2:
              System.out.println("Tuesday");
              break;
              case 3:
              System.out.println("wednesday");
              break;
              case 4:
              System.out.println("thursday");
              break;
              case 5:
              System.out.println("friday");
              break;
              case 6:
              System.out.println("saturday");
              break;
              case 7:
              System.out.println("Sunday");
              break;
              default:
              System.out.println("error");
          }


    }
}
