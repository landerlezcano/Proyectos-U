#include<iostream>
#include<cstdlib>
using namespace std;
int main(){
    int array[10], contador, i;                    //Variables para iteraciones
    for (contador=1;contador<=10;contador++){
        array[contador] = contador*contador;
        cout<<"Entrada "<<contador<<" del arreglo: "<< array[contador]<<endl;
    }
        for(i=0;i<11;i++){          
    cout<<array[i]<<endl;}
    system("PAUSE");
    return EXIT_SUCCESS;
}    
