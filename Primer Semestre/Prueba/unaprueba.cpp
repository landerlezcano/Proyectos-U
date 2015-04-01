#include<iostream>
#include<cstdlib>
using namespace std;
int main(){
	int registro[20],i,j,var,aux=0, contador = 0;
	int mayor[20] = {0};
	cout<<"Ingrese 5 numeros"<<endl;
	for (i = 0; i<20; i++){								                        //Ingreso de secuencia al arreglo
		cin >> registro[i];
		cout << endl;
	}
	for (i = 0; i<20; i++)
	{
		aux = 0;
		for (j = 0; j<20; j++){
			if (registro[j] >= aux){
				aux = registro[j];                                           
			}	                  
        }
		for(var=0;var<20;var++){
                if (aux == registro[var]){
                        registro[var]=0;                                        //registro[contador]=0;                    
                }                   
        }    
		if (aux>mayor[i]){
			mayor[i] = aux;
		}
	}
	cout<<"Matriz en orden ascendente"<<endl;	
	cout << endl;
	for (i = 19; i >= 0; i--){
		cout << mayor[i] << "  " << endl;
	}
	cout << endl;
system("PAUSE");
return EXIT_SUCCESS;
}
