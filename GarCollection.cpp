#include <bits/stdc++.h>
using namespace std;

int main(){

    int *myarray = new int[5];
   
    if(!myarray){
     cout<< "Memory allocation crashed";
    }
    else 
    {
        for (int i = 0;i<5;i++)
        myarray[i] = i + 1;
        
        
        cout<< "Value allocated in memory blocks " ; // allocate memory
        for (int i = 0;i<5;i++)  // printing
         cout<< myarray[i] << " ";
    }
 delete []myarray;  // erase allocation
  
   cout<< endl << "Memory allocation erased"; // 

 return 0;

}