#include <iostream>
using namespace std;

static int ArSum(int a, int d, int n){

    int insideparenthesis= 2*a + n-1;
    int insidebracket = insideparenthesis * d;
    int overallsum = n/2 * insidebracket;

    return overallsum;
}

int main (){
 
 int n = 30;
 int d = 2;
 int a = 1;
 int result =  ArSum(a,d,n);
 
 cout<<result;

    return 0; 
}