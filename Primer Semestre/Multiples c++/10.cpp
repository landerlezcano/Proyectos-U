#include<iostream>
#include<cstdlib>
using namespace std;

int main() {
	float a;
	cout<<"Ingrese su edad, para calcular el costo de la entrada"<<endl;
	cin>>a;
	if (a<=13) 
    {
		cout<<"El costo de la entrada es de $3000 pesos"<<endl;
	} 
    else 
    {
		if (a<60) 
        {
			cout<<"El costo de la entrada es de $6000 pesos"<<endl;
		} 
        else 
        {
			if (a>=60) 
            {
				cout<<"El costo de la entrada es de $4000 pesos"<<endl;
			} 
            else 
            {
				cout<<"Asegurese de ingresar un valor válido en la edad"<<endl;
			}
		}
	}
    system ("PAUSE");
    return EXIT_SUCCESS;  
}   
