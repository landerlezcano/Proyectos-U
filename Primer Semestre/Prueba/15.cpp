#include <cstdlib>
#include <iostream>
using namespace std;
int main()
{
    cout<<"Ingrese las notas de un estudiante"<<endl;
    float num, prom, acum, suma;
    suma=0;
    acum=0;
    prom=0;
    do{
        cin>>num;
        if(num>=2 & num<=5)
        {
                  suma=suma+num;
                  acum++;
        }
        else
        {
                  cout<<"Ingrese una nota cuyo valor este entre 2 y 5"<<endl;
        }
    }
    while(num != 1);
    prom=suma/acum;
    cout<<"El promedio de las notas ingresadas es de: "<<prom<<endl;
    system("PAUSE");
    return EXIT_SUCCESS;
}
