
import java.io.IOException;


public class SecondHands {


    public static boolean Solutions(int k , int n, int arr[]){
        int partcount = 0;
        for(int i = 0; i<arr.length;i++){
            int temp = arr[i];
            for(int j = arr.length-1 ;j>=0;j--){
             if(temp == arr[j]){
                    partcount++;
                }
                else {
                   continue;
                }

            }
         }
           
        if(n>2*k){
            return false;

                }
        else if ( partcount >= k){
            return false;
        }
        
            return true;
        
        
       
    }

    public static void main(String args[])throws IOException{

    
    int n = 5;
    int k = 3;
    int[] styles = {1,2,3,3,1};

    String output = SecondHands.Solutions(k,n,styles)? "YES": "NO";
       System.out.print(output);



    
     /* 
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
   
    int numberofTestCase = Integer.parseInt(reader.readLine());
    
    for(int i = 0; i<numberofTestCase;i++)
    {
      String [] nAndk = reader.readline().split(" ");
          
       for(int )
    }
    */



 }
    
}
