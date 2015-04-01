#include<iostream>
#include<cstdlib>
using namespace std;
void menu() {
     int opc;
     cout<<"Ingrese a continuacion una de las 3 siguientes opciones: "<<endl;
     cout<<"1. Producto mas vendido"<<endl;
     cout<<"2. Cantidad de productos vendidos"<<endl;
     cout<<"3. Total recolectado por la videotienda"<<endl;
     cin>>opc;
     switch(opc) {
                 case 1:
                      
                      break;
                 case 2:
                      
                      break;
                 case 3:
                 
                      break;
                 default:   
                      break;       
     }
int validar(int ){
    
    }
int main() {
	float producto1,producto2,producto3;
	float total,unitario1,unitario2,unitario3,recolectado;
	cout<<"ingrese la cantidad de ventas del producto 1, accion:"<<endl;
	cin>>producto1;
	cout<<"ingrese la cantidad de ventas del producto 2, amor:"<<endl;
	cin>>producto2;
	cout<<"ingrese la cantidad de ventas del producto 3, terror:"<<endl;
	cin>>producto3;
	if (producto1>producto2 && producto1>producto3) {
            cout<<"El producto 1 es el mas vendido"<<endl;
	}
	else {
        if(producto2>producto1 && producto2>producto3) {
            cout<<"El producto 1 es el mas vendido"<<endl;
        }
        else{
            cout<<"El producto 3 es el mas vendido"<<endl;
        }
	}
	total=producto1+producto2+producto3;
	cout<<"La cantidad de productos vendidos es :"<<total<<endl;
	cout<<"Ingrese el valor unitario del producto 1, accion:"<<endl;
	cin>>unitario1;
	cout<<"Ingrese el valor unitario del producto 2, amor:"<<endl;
	cin>>unitario2;
	cout<<"Ingrese el valor unitario del producto 3, terror:"<<endl;
	cin>>unitario3;
	recolectado=((producto1*unitario1)+(producto2*unitario2)+(producto3*unitario3));
	cout<<"El total recolectado por la videotienda es: "<<recolectado<<endl;
    cout<<"fin";
    return EXIT_SUCCESS;
    }
