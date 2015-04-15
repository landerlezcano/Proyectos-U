#include<iostream>
#include<cstdlib>
using namespace std;

int main() 
{
	float a;
	string b;
	float c;
	cout<<"A continuacion ingrese el valor de la compra"<<endl;
	cin>>a;
	cout<<"Ahora ingrese el color de bolita que saco para aplicar el descuento"<<endl;
	cout<<"Recuerde que a la hora de ingresar los colores las opciones posibles son: "<<endl;
    cout<<"blanca"<<endl<<"verde"<<endl<<"amarilla"<<endl<<"azul"<<endl<<"roja. En minúsculas"<<endl;
	cin>>b;
	if (b=="blanca") 
    {
		cout<<"No tiene descuento, debe pagar $"<<a<<endl;
	} 
    else 
    {
		if (b=="verde") 
        {
			c=a*0.10;
			cout<<"El valor final de la compra es $"<<a-c<<endl;
		} 
        else 
        {
			if (b=="amarilla") 
            {
				c=a*0.25;
				cout<<"El valor final de la compra es $"<<a-c<<endl;
			} else 
            {
				if (b=="azul") 
                {
					c=a*0.50;
					cout<<"El valor final de la compra es $"<<a-c<<endl;
				} 
                else 
                {
					if (b=="roja") 
                    {
						cout<<"El descuento de su compra es del 100%, no debe pagar"<<endl;
					} 
                    else 
                    {
						cout<<"Ese color no corresponde a los del descuento"<<endl;
					}
				}
			}
		}
	}
    system ("PAUSE");
    return EXIT_SUCCESS;  
}     
