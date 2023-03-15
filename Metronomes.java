import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Metronomes {

    public static void metronomeduplicates (String arr[])
    {
        int [] intCases =  new int [arr.length]; 
        for (int i = 0; i<arr.length;i++){
                 int b = 0;
                 for (int k = 0; k <arr.length;k++){
                    if(k == i ) continue;
                    else if(Integer.parseInt(arr[i])<Integer.parseInt(arr[k])) continue; // added a new condition3

                    else if(Integer.parseInt(arr[i]) % Integer.parseInt(arr[k])==0) 
                    {
                        b++;
                    }
                   intCases[i] = b; 
                        
                    
                }
               }
               for (int i = 0;i< intCases.length;i++){
                System.out.print(intCases[i] + " "); 
               }
               
             

              
           
          }

    public static void main(String args[]) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int pulsars = Integer.parseInt(reader.readLine());
        String tempos [] = reader.readLine().split(" ");
        if(pulsars>tempos.length) return;
       metronomeduplicates(tempos);
        

        


    }

}

