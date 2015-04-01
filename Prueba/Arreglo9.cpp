#include<iostream>
#include<cstdlib>
using namespace std;
int main(){
    int array1[6], array2[6], contador;     //Declaracion de variables
    cout<<"Ingrese 6 numeros"<<endl;
    for (contador=0;contador<5;contador++){
        cout<<"Entrada "<<contador<<" : ";
        cin>>array1[contador];
        cout<<endl;
    }
    cout<<"El siguiente arreglo es el producto entre el arreglo ingresado y 5: "<<endl;    
    for (contador=0;contador<5;contador++){
        array2[contador]= array1[contador]*5;
        cout<<"Entrada "<<contador<<" resultante: "<<array2[contador]<<endl;
    }  
    system ("PAUSE");
    return EXIT_SUCCESS;                                    
}
