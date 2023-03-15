import java.util.*;
public class PositiveNegative {

    static boolean determinant(int first_number, int second_number){
           boolean check = false;
          if(first_number<0 || second_number<0){
            if (first_number<0 && second_number<0){
                check = false;
            }
            else{
                check = true;
            }
          }
        return check;
    }
    public static void main (String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.print("Input first number: ");
        int first_number = scan.nextInt();
        System.out.print("Input first number: ");
        int second_number = scan.nextInt();
        System.out.println(PositiveNegative.determinant(first_number, second_number)?"True":"False");
    }
}
