#include<iostream>
#include<cstdlib>
using namespace std;

int main() 
{
	float a,b;
	char c;
	cout<<"Ingrese dos numeros a operar"<<endl;
	cin>>a>>b;
	cout<<"A continuacion seleccione la operacion que desea realizar con los dos numeros"<<endl;
	cout<<endl<<"Para seleccionar la operacion, escriba: "<<endl<<"s para suma"<<endl<<"r para resta"<<endl<<"m para multiplicacion"<<endl<<"d para division"<<endl;
	cin>>c;
	switch (c) 
    {
	case 's':
		cout<<"El resultado de la suma es : "<<a+b<<endl;
		break;
	case 'r':
		cout<<"El resultado de la resta es : "<<a-b<<endl;
		break;
	case 'm':
		cout<<"El resultado de la multiplicacion es : "<<a*b<<endl;
		break;
	case 'd':
		cout<<"El resultado de la division es : "<<a/b<<endl;
		break;
	default:
		cout<<"La letra ingresada no corresponde a una operacion"<<endl;
	}
    system ("PAUSE");
    return EXIT_SUCCESS;  
}   

