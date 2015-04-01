#include <cstdlib>
#include <iostream>
using namespace std;
int main()
{
    int contador;
    contador=0;
    cout<<"Del 0 al 100"<<endl;
    while (contador<=99)
    {
          cout<<contador<<endl;
          contador++; 
    }
    cout<<"Del 100 al 0"<<endl;
    while (contador>=0){
          cout<<contador<<endl;
          contador--;
       }
    system ("PAUSE");
    return EXIT_SUCCESS;
}

    
