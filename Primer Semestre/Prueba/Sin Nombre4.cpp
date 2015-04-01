#include <cstdlib>
#include <iostream>
using namespace std;
int main ()
{
    int a,suma,contador;
	suma=0;
	cout<<" Ingrese un valor numerico "<<endl;
	cin>>a;
	if (a<20)
	{
          contador=a;
          while (contador<=50)
          {
          suma=contador+suma;
          contador++;   
          }
          cout<<" La suma de los numeros de "<<a<<" al 50 es: "<<suma<<endl;
    }
	system("PAUSE");
    return EXIT_SUCCESS;   
}
               
