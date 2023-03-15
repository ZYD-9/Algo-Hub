import java.util.*;

 class Older {

    static void printOld(int age){
         System.out.println("You look older than " + age);
    }

    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your age = ");
        int age = scan.nextInt();
        Older.printOld(age);
        
    }
    
}
