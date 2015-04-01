#include<cstdlib>
#include<iostream>
using namespace std;
void grados(){
     cout << "Long live the Microsoft Empire! \n"; 
     cout << "All Hail Bill Gates! \n"; 
     }
void ahorro(){
     float capital;
     cout<<"Ingrese el monto dinero a invertir en el banco: "<<endl;
     cin>>capital;
     if(capital>0){
     cout<<"La cantidad de dinero ahorrada en un mes, a razon de 3% es de: "<<(capital*0.03)<<endl;
     }
     else{
          cout<<"Ingrese una cantidad valida"<<endl;
          }
     }
void triple(){
     float numero;
     cout<<"Ingrese un numero: "<<endl;
     cin>>numero;
     if (numero>=100){
                      cout<<"El triple del numero es: "<<numero*3<<endl;
                     }
     else{
          if (numero<100){
                    cout<<"El cuadrado del numero es: "<<numero*numero<<endl;
                    }
          }                
     }     
void cine(){
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
}
void velocidad(){
     float accel,distance,vel,time;
     cout<<"Ingrese la distancia del recorrido: "<<endl;
     cin>>distance;
     cout<<"Ingrese el tiempo del recorrido: "<<endl;
     cin>>time;
     vel=distance/time;
     accel=vel/time;
     cout<<"La aceleracion del vehiculo es: "<<accel<<endl;
     }
int main(){
    int menu;
    cout<<"A continuacion escoga una de las 5 opciones que se mostraran acontinuacion"<<endl;
    cout<<"Digite un numero del 1 al 5 segun desee"<<endl;
    cout<<"1 para calculo de temperatura grados Fahrenheit"<<endl;
    cout<<"2 para calculo de ahorros en el banco al invertir"<<endl;
    cout<<"3 para calculo de triples o cuadrados de un numero"<<endl;
    cout<<"4 para calculo de entrada de cine"<<endl;
    cout<<"5 para calculo de aceleracion"<<endl;
    cin>>menu;
    switch (menu)
    {
        case 1:
             grados();
             break;
        case 2:
             ahorro();
             break;
        case 3:
             triple();
             break;
        case 4:
             cine();
             break;
        case 5:
             velocidad();
             break;
        default:
                cout<<"Ingrese una opcion valida"<<endl;                            
    }
    system ("PAUSE");
    return EXIT_SUCCESS; 
    
}
