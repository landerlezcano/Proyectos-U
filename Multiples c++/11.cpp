#include<iostream>
#include <cstdlib>
using namespace std;

int main() 
{
	float a,b,c;
	cout<<"A continuacion ingrese tres numeros distintos"<<endl;
	cin>>a>>b>>c;
	if (a>b && a>c) 
    {
		if (b>c) 
        {
			cout<<"El orden de los numeros de mayor a menor es: "<<a<<", "<<b<<" y "<<c<<endl;
		} 
        else 
        {
			cout<<"El orden de los numeros de mayor a menor es: "<<a<<", "<<c<<" y "<<b<<endl;
		}
	} 
    else 
    {
		if (b>a && b>c) 
        {
			if (a>c) 
            {
				cout<<"El orden de los numeros de mayor a menor es: "<<b<<", "<<a<<" y "<<c<<endl;
			} 
            else 
            {
				cout<<"El orden de los numeros de mayor a menor es: "<<b<<", "<<c<<" y "<<a<<endl;
			}
		} 
        else 
        {
			if (a>b) 
            {
				cout<<"El orden de los numeros de mayor a menor es: "<<c<<", "<<a<<" y "<<b<<endl;
			} 
            else 
            {
				cout<<"El orden de los numeros de mayor a menor es: "<<c<<", "<<b<<" y "<<a<<endl;
			}
		}
	}
    system ("PAUSE");
    return EXIT_SUCCESS;  
}   
