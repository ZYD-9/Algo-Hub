import java.util.*;

public class Arith  {

    static void operations(int first_number,int second_number){
        int sum,difference, product, quotient, remainder;

        sum = first_number + second_number;
        difference = first_number + second_number;
        product  = first_number * second_number;
        quotient = first_number / second_number;
        remainder = first_number % second_number;
        
        System.out.println( first_number +  " + " + second_number + " = " + sum);
        System.out.println( first_number +  " - " + second_number + " = " + difference);
        System.out.println( first_number +  " x " + second_number + " = " + product);
        System.out.println( first_number +  " / " + second_number + " = " + quotient);
        System.out.println( first_number +  " % " + second_number + " = " + remainder);

    }

    public static void main(String args[]){
       Scanner scan =  new Scanner(System.in);
        int first_number, second_number;

        System.out.print("Input First Number: ");
         first_number = scan.nextInt();
        System.out.print("Input Second Number: ");
         second_number = scan.nextInt();

        Arith.operations(first_number, second_number);
    }
    
}
