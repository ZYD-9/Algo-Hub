import java.util.*;
public class Average {

    static void computeAve(int first_number, int second_number,int third_number, int fourth_number){
        int average = first_number + second_number + third_number + fourth_number / 4;
        
        System.out.print("The average of " + first_number +  "," + second_number + "," + third_number + "," +  fourth_number + " is: " + average);
    }

    public static void main (String args[]){

        int first_number,second_number,third_number, fourth_number;

        Scanner scan = new Scanner (System.in);
        System.out.print("Input First Number: ");
         first_number = scan.nextInt();
        System.out.print("Input Second Number: ");
         second_number = scan.nextInt();
         System.out.print("Input Third Number: ");
         third_number = scan.nextInt();
         System.out.print("Input Fourth Number: ");
         fourth_number = scan.nextInt();
        Average.computeAve(first_number, second_number, third_number, fourth_number);
        
    }
    
}
