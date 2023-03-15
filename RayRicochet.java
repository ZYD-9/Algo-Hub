import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



public class RayRicochet {

    public static boolean calculateRaySurvivability(int D, int W, int B) {
        //(B*W)+W≥D
        double rayDynamics = (B*W) + W;

        if(rayDynamics >= D){
            return true;
        }
        return false;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int testCases = Integer.parseInt(reader.readLine());
    
        String output = "";
        for (int i = 0 ; i < testCases ; i++) {
            String[] input = reader.readLine().split(" ");
            output += RayRicochet.calculateRaySurvivability(Integer.parseInt(input[0]), Integer.parseInt(input[1]),Integer.parseInt(input[2]))? "YES":"NO";
        }

        String[] outputs = output.split(",");

        for (String o : outputs) {
            System.out.println(o + " ");
        }
       

       
    }
}
