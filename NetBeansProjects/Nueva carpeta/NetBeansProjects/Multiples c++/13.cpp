#include<iostream>
#include<cstdlib>
using namespace std;

int main() {
	float a,c;
	int b;
	cout<<"Ingrese el valor de su compra"<<endl;
	cin>>a;
	cout<<"A continuacion ingrese un numero del 1 al 7 segun el color de la bolita para efectuar el descuento a su compra"<<endl;
	cout<<endl<<"Los valores de los colores son:"<<endl<<"Blanca = 1"<<endl<<"Verde = 2"<<endl<<"Amarilla = 3"<<endl<<"Azul = 4"<<endl<<"Roja = 5"<<endl;
	cin>>b;
	switch (b) {
	case 1:
		cout<<"No tiene descuento, debe pagar $"<<a<<endl;
		break;
	case 2:
		c=a*0.10;
		cout<<"El valor final de la compra es $"<<a-c<<endl;
		break;
	case 3:
		c=a*0.25;
		cout<<"El valor final de la compra es $"<<a-c<<endl;
		break;
	case 4:
		c=a*0.50;
		cout<<"El valor final de la compra es $"<<a-c<<endl;
		break;
	case 5:
		cout<<"El descuento de su compra es del 100%, no debe pagar"<<endl;
		break;
	default:
		cout<<"Ese color no corresponde a los del descuento"<<endl;
	}
    system ("PAUSE");
    return EXIT_SUCCESS;  
}   

