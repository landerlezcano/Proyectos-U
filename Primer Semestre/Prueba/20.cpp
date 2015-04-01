#include <cstdlib>
#include <iostream>
using namespace std;
int main()
{
    int num;
    float mod;
    do{
          cin>>num;
          if (num==0) break;
          mod=num%2;
          if (mod==0)
          {
             cout<<"El numero es par"<<endl;
          }
          else
          {
             cout<<"El numero es impar"<<endl; 
          }
          
    }
    while (num!=0);
    system ("PAUSE");
    return EXIT_SUCCESS;
}
          
