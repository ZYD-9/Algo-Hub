import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
class Collatz

{

    public String performConjecture(int x ){
        
        
        String sequence = Integer.toString(x) + "\n";
       while(x != 1 ){
           if(x==16){
             break;
           }

           else if(x%2==0){
             x = x/2;
               }

          else if(x%2!=0){
                 x = 3*x + 1;
            }

            sequence +=  Integer.toString(x) + "\n";

       }
       return (sequence);
       

    
    }
     public static void main(String args[]) throws IOException{

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(reader.readLine());
        Collatz collatz = new Collatz();

        if(number<1){
          System.out.println("Please Input a Number greater than Zero(0)");
          }

          else{
          System.out.print(collatz.performConjecture(number));
          }

        
    }
}