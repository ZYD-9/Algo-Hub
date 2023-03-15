import java.io.*;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class List {

    public static void main(String args[])throws IOException{
        
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = 5;
        
        ArrayList<Integer> sample_list = new ArrayList<Integer>(n);
        

        for(int i = 0;i<n;i++){
            int element = Integer.parseInt(reader.readLine());
            sample_list.add(element);
        }

        

    }
    
}
