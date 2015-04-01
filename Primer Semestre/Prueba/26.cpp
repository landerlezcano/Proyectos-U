#include <cstdlib>
#include <iostream>
using namespace std;
int main()
{
    int num, acum, contador, var;
    contador=0;
    acum=0;                                 
    cout<<"Ingrese un numero: ";
    cin>>num;
        while (contador<num)
    {
          var=(2*contador)+1;
          acum=acum+var;
          contador++;
    }
    cout<<"La suma de los "<<num<<" primeros numeros impares es: "<<acum<<endl;
    contador=0;
    acum=0;
    while (contador<=num)
    {
          var=2*contador;
          acum=acum+var;
          contador++;
    }
    cout<<"La suma de los "<<num<<" primeros numeros pares es: "<<acum<<endl;
    contador=1;
    acum=0;
    while (contador<=num)
    {
          var=3*contador;
          acum=acum+var;
          contador++;
    }
    cout<<"La suma de los "<<num<<" primeros numeros multiplos de 3 es: "<<acum<<endl;
    system ("PAUSE");
    return EXIT_SUCCESS;
}
