import java.util.*;
public class LowestorGreatest {

    static int lowest(int first_number,int second_number,int third_number){
        int low = 0;
          if(first_number<second_number && first_number<third_number){
            low = first_number;
          }
          else if (second_number<first_number&& second_number<third_number){
            low = second_number;
          }
          else{
            low = third_number;
          }
     return low;
    }

    static int greatest(int first_number,int second_number,int third_number){
          int high = 0;

          if(first_number>second_number && first_number>third_number){
            high = first_number;
          }
          else if (second_number>first_number&& second_number>third_number){
            high = second_number;
          }
          else{
            high = third_number;
          }
        return high;
    }

    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);

        System.out.println("Input first integer");
        int first_number = scan.nextInt();
        System.out.println("Input first integer");
        int second_number = scan.nextInt();
        System.out.println("Input first integer");
        int third_number = scan.nextInt();

        System.out.println("Largest of Three" + LowestorGreatest.greatest(first_number, second_number, third_number));
        System.out.println("Lowest of Three" + LowestorGreatest.lowest(first_number, second_number, third_number));

    }
    
}
