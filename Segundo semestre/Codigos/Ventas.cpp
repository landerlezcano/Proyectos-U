#include <iostream>
#include <cstdlib>
using namespace std;

struct ventas{
	float subtotal;
	float iva;
	float total;
};


float calcularValorIVA(float total, float iva){
	return total*(iva/100);
}

float calcularSubtotal(float total, float valorIVA){
	return total-valorIVA;
}

float subtotalVentaMasAlta(struct ventas aux[], int numElem){
	float valorMin = 0;
	int aux1 = 0;
	for(int i=0;i<numElem;i++){
		if((aux[i].total)>valorMin){
			aux1=i;
			valorMin=aux[i].total;
		}
	}
	return aux[aux1].subtotal;
}


int main(){
	struct ventas arregloVentas[3];
	float acumIVA=0;
	for(int i=0;i<3;i++){
		cout<<"A continuación ingrese el valor total no."<<i+1<<" :"<<endl;
		cin>>arregloVentas[i].total;
	}
	for(int i=0;i<3;i++){
		
		arregloVentas[i].iva = calcularValorIVA(arregloVentas[i].total,16);
		arregloVentas[i].subtotal = calcularSubtotal(arregloVentas[i].total,arregloVentas[i].iva);
	}
	cout<<"\nEl subtotal de la venta mas alta de hoy es: "<<subtotalVentaMasAlta(arregloVentas,3);
	for(int i=0;i<3;i++){
		acumIVA=acumIVA+arregloVentas[i].iva;
	}
	cout<<"\nLa suma del IVA de las ventas de hoy es: "<<acumIVA<<endl;
	system("PAUSE");
	return 0;
}
