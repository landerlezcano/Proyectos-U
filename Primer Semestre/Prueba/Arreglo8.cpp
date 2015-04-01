#include<iostream>
#include<cstdlib>
using namespace std;
int main(){
    int array1[5];
    int array2[5];
    int array3[5];
    int contador;            //Variables para iteraciones
    int mayor = 0;
    int menor = 0;  
    cout<<"A continuacion ingrese 5 numeros para el arreglo A"<<endl;
    for (contador=0;contador<5;contador++){
        cout<<contador+1<<" : ";
        cin>>array1[contador];
        cout<<endl;                              
    }
    cout<<"A continuacion ingrese 5 numeros para el arreglo B"<<endl;
    for (contador=0;contador<5;contador++){
        cout<<contador+1<<" : ";
        cin>>array2[contador];
        cout<<endl;                         
    }
    for (contador=0;contador<5;contador++){
        array3[contador]=array1[contador]+array2[contador];                     
    }
    for (contador=0;contador<5;contador++){
        cout<<"El resultado de la suma de las entradas '"<<contador<<"' es: "<<array3[contador]<<endl;            
    }
    cout<<array3;
    system ("PAUSE");
    return EXIT_SUCCESS;                                    
}
