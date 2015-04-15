#include<iostream>
#include <cstdlib>
using namespace std;

int main() 
{
	float b,c;
	cout<<"Ingrese el monto a pagar en dolares "<<endl;
	cin>>b;
	if (b<500) {
		cout<<"No hay descuento"<<endl;
		cout<<" el valor final a pagar es $ "<<b<<endl;
	} 
    else 
    {
		if (b<1000) 
        {
			c=b*0.05;
			cout<<"El valor del descuento en su compra es $"<<c<<endl;
			cout<<"el valor final a pagar es $"<<b-c<<endl;
		} 
        else 
        {
			if (b<7000) 
            {
				c=b*0.11;
				cout<<"El valor del descuento en su compra es $"<<c<<endl;
				cout<<"el valor final a pagar es $"<<b-c<<endl;
			} 
            else 
            {
				if (b<15000) 
                {
					c=b*0.18;
					cout<<"El valor del descuento en su compra es $"<<c<<endl;
					cout<<"el valor final a pagar es $"<<b-c<<endl;
				} 
                else 
                {
					c=b*0.25;
					cout<<"El valor del descuento en su compra es $"<<c<<endl;
					cout<<"el valor final a pagar es $"<<b-c<<endl;
				}
			}
		}
	}
    system ("PAUSE");
    return EXIT_SUCCESS;  
}     

