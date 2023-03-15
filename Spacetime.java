

public class Spacetime{

  public static int  Sendback( int starSystems[])
  {
     int save = 1;
     int collapse = 0;

     int sendback = 0;
     int  numofStars = starSystems.length-1;
         for(int i = 1;i<numofStars;i++ ){ 
            if (starSystems[i]== collapse){
                starSystems[i] = save;
                if(starSystems[i+1] == save)
                {
                  starSystems[i+1] = collapse;
                }
                else {
                  starSystems[i+1] = save;
                }
                 
               sendback++;
              }

             
           
            }
         return sendback;
            
         }
    

  public static void main(String args[]){
    
     int starSystems[]= {1,1,1,1,0,0,0,0};
    int ans = Spacetime.Sendback(starSystems);
      System.out.print(ans);

   }

}
