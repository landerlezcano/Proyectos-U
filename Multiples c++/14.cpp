#include<iostream>
#include<cstdlib>
using namespace std;

int main() 
{
	int a;
	cout<<"Ingrese un numero entero del 1 al 3"<<endl;
	cin>>a;
	switch (a) 
    {
	case 1:
		cout<<"El semaforo marca el color ROJO"<<endl;
		break;
	case 2:
		cout<<"El semaforo marca el color AMARILLO"<<endl;
		break;
	case 3:
		cout<<"El semaforo marca el color VERDE"<<endl;
		break;
	default:
		cout<<"El numero no corresponde a un color del semaforo"<<endl;
	}
    system ("PAUSE");
    return EXIT_SUCCESS;  
}   
