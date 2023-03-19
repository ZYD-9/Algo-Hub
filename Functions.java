public class Functions {
    
    // lowest
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
// static greatest
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

    // nearest
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
    // equals
    static boolean isEqauls(int first_number,int second_number ){
        
        
        if(first_number==second_number){
            return true;
        }

        else{
            return false;
        }


        
    }

   // factorial
    public static String  addTo(int x ){
     
    int sum = 0;  
    String expression = ""; 

    for (int i = 1; i<=x;i++){
      //  System.out.println(i);
      sum += i;
      expression += String.valueOf(i) + "+";
      
    }
    return expression.substring(0,expression.length()-1) + " = " + sum;   
}
    

    public static void Charge(int amount){
    
    int charge = 0;
        if(amount<=10){
            charge = 2;
        }
        else if(amount > 10 && amount< 20){
            charge = 4;
        }
        else if(amount>=20){
            charge = 6;
        }

        System.out.println("The charge is " + charge);

    }

    // main method
    public static void main (String args[]){


       int lower = Functions.lowest(4, 5, 3);
       int greater = Functions.greatest(3, 4, 5);
       System.out.println("The lowest number is " + ": " + lower );
       System.out.println("The greatest number is " + ": " + greater );

       int near = Functions.nearest(25, 15);
       System.out.println("Nearest" + ": "+ near);
       String addnums = Functions.addTo(6);

       System.out.println(addnums);
       Functions.Charge(4);
       






    }
}
