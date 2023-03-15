import java.util.Scanner;


public class Nearest {

    static int nearest (int first_number, int second_number){
        int nearest = 0;
        int first = 0;
        int second =0;
        first = Math.abs(20-first_number);
        second = Math.abs(20-second_number);

        if(first<second){
            nearest = first_number;
}
        else if (first>second){
            nearest = second_number;
        }
        

        return nearest;
    }

    public static void main(String args[]){
       Scanner scan = new Scanner(System.in);
        System.out.print("Input first number: ");
        int first_number = scan.nextInt();
        System.out.print("Input second number: ");
        int second_number = scan.nextInt();

        if(first_number == second_number){
            System.out.print("0");
        }
        else{
            System.out.println(Nearest.nearest(first_number, second_number));
        }

    }
    
}
