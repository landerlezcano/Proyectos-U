#include<iostream>
#include<cstdlib>
using namespace std;
int main(){
	int registro[5],i,j,var,aux=0, contador = 0,check;
	int mayor[5] = {0};
	cout<<"Ingrese 5 numeros"<<endl;
	for (i = 0; i<5; i++){								                        //Ingreso de secuencia al arreglo
		cin >> registro[i];
	}
	for (i = 0; i<5; i++)
	{
		aux = 0;
		for (j = 0; j<5; j++){
			if (registro[j] > aux){
				aux = registro[j];                                           
			}	                  
        }
		for(var=0;var<5;var++){             
                if (aux == registro[var]){
                        registro[var]=0;                                        // "registro[contador]=0;" Limpia la entrada ya ordenada                    
                }                   
        }    
		if (aux>mayor[i]){
			mayor[i] = aux;
		}
	}
	cout<<"Matriz en orden ascendente"<<endl;	
	cout << endl;
	for (i = 4; i >= 0; i--){
		cout << mayor[i] << "  " << endl;
	}
	cout << endl;
system("PAUSE");
return EXIT_SUCCESS;
}
