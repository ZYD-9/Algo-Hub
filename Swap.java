import java.util.*;
public class Swap {



    public static void main(String args[]){
        Scanner scan = new Scanner (System.in);
        System.out.print("Input First Number: ");
        int first_number = scan.nextInt();
        System.out.print("Input Second Number: ");
        int second_number = scan.nextInt();

    
    int temp = first_number;
    first_number = second_number;
    second_number = temp;

    System.out.println("First Number: " + first_number);
    System.out.println("Second Number: " + second_number);

    }
    
}

    

