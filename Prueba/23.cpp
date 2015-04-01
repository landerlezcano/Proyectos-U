#include <cstdlib>
#include <iostream>
using namespace std;
int main()
{
    string msn;
    int acum;
    acum=0;
    cout<<"Digite la palabra hola"<<endl;
    while (true)
    {
        cin>>msn;
        if (msn == "hola")
                {
                      acum++;    
                }
        if (msn == "salir") break;
    }
    cout<<"La cantidad de veces que ingreso la palabra 'hola' fue de: "<<acum<<endl;
    system ("PAUSE");
    return EXIT_SUCCESS;
}
