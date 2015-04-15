#include <cstdlib>
#include <iostream>
using namespace std; 
int main ()
{
    int i=1,a=0;
    cout << " Los pares entre 1 y 100 son " <<endl;
    while(i<100){
         if (i%2 == 0){
             cout<<i<<endl;}
         i++;                                                       
    }
    system("PAUSE");
    return EXIT_SUCCESS;
}
